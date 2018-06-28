package de.rdspp.editor.ui.popups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.rdspp.editor.rdsPP.CommonAssignment;
import de.rdspp.editor.rdsPP.ConnectionIdentification;
import de.rdspp.editor.rdsPP.Declaration;
import de.rdspp.editor.rdsPP.DocumentIdentification;
import de.rdspp.editor.rdsPP.FunctionalAssignment;
import de.rdspp.editor.rdsPP.FunctionalDesignation;
import de.rdspp.editor.rdsPP.InstallationLocationDescription;
import de.rdspp.editor.rdsPP.LocationDescription;
import de.rdspp.editor.rdsPP.Model;
import de.rdspp.editor.rdsPP.ProductDescription;
import de.rdspp.editor.rdsPP.RDSPPComponent;
import de.rdspp.editor.rdsPP.SignalIdentification;

public class RDSPPIdentificationDialog {

	private Shell shell;
	private Composite leftSlot;
	private Composite rightSlot;
	private Combo componentSelector;
	private Text rdsppIdentivicationName;

	private final static String NEWLINE = "\n";

	public RDSPPIdentificationDialog() {
		addedComponents = new ArrayList<>();
		shell = getNewGrid2Shell();
		shell.setText("Neue RDS-PP Kennzeichnung hinzufügen");
		leftSlot = new Composite(shell, SWT.BORDER);
		rightSlot = new Composite(shell, SWT.BORDER);
		leftSlot.setLayout(new GridLayout(1, true));
		rightSlot.setLayout(new GridLayout(1, true));

		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;

		rightSlot.setLayoutData(gridData);
		leftSlot.setLayoutData(gridData);
		shell.setLayoutData(gridData);
		addLabelToRightSlot("RDS-PP Kennzeichnung");
		addLabelToLeftSlot("RDS-PP Komponente zur Kennzeichnung hinzufügen");

		addRDSPPComponentSelector().setLayoutData(gridData);
		rdsppIdentivicationName = new Text(rightSlot, SWT.LEFT | SWT.READ_ONLY);
		rdsppIdentivicationName.setLayoutData(gridData);

		Button addComponent = new Button(leftSlot, SWT.PUSH);
		addComponent.setText("Hinzufügen");
		addComponent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addRDSPPComponent();
			}
		});

		Button addIdentification = new Button(rightSlot, SWT.PUSH);
		addIdentification.setText("Hinzufügen");
		addIdentification.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addRDSPPIdentification();
			}

			private void addRDSPPIdentification() {
				if (rdsppIdentivicationName.getText() != null
						&& !WHITESPACE.equals(rdsppIdentivicationName.getText())) {
					if(addedComponents.size()>1) {
					addTextToEditor("RDS-PPKENNZEICHNUNG " + rdsppIdentivicationName.getText() + NEWLINE);
					shell.close();
					}
					else {
						MessageDialog.openError(shell, "Fehler", "Bitte wählen Sie mindestens zwei Komponenten um eine RDS-PP Kennzeichnung zu erstellen.");
					}
				}
			}
		});

		shell.open();
	}

	private void addTextToEditor(String newLine) {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();

		IEditorPart part = page.getActiveEditor();
		if (!(part instanceof AbstractTextEditor)) {
			return;
		}

		ITextEditor editor = (ITextEditor) part;
		IDocumentProvider dp = editor.getDocumentProvider();
		IDocument doc = dp.getDocument(editor.getEditorInput());
		try {
			doc.replace(0, 0, newLine);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	private List<RDSPPComponent> addedComponents;

	private void addComponent(RDSPPComponent component) {
		addedComponents.add(component);
		updateRDSPPIdentificationText();
	}

	private void updateRDSPPIdentificationText() {
		StringBuilder identivication = new StringBuilder();
		addedComponents.sort(new Comparator<RDSPPComponent>() {

			@Override
			public int compare(RDSPPComponent o1, RDSPPComponent o2) {
				return Integer.compare(getValueForComponent(o2), getValueForComponent(o1));
			}

			private int getValueForComponent(RDSPPComponent component) {
				if (component instanceof CommonAssignment) {
					return 8;
				}
				if (component instanceof FunctionalDesignation) {
					return 7;
				}
				if (component instanceof FunctionalAssignment) {
					return 6;
				}
				if (component instanceof InstallationLocationDescription) {
					return 5;
				}
				if (component instanceof LocationDescription) {
					return 4;
				}
				if (component instanceof ProductDescription) {
					return 3;
				}
				if (component instanceof ConnectionIdentification) {
					return 2;
				}
				if (component instanceof SignalIdentification) {
					return 1;
				}
				if (component instanceof DocumentIdentification) {
					return 0;
				}

				return -1;
			}
		});
		for (

		RDSPPComponent rdsppComponent : addedComponents) {
			identivication.append(getSymbolAndName(rdsppComponent));
		}

		rdsppIdentivicationName.setText(identivication.toString());
	}

	private String getSymbolAndName(RDSPPComponent component) {
		if (component instanceof ConnectionIdentification) {
			return ":" + component.getName();
		} else if (component instanceof LocationDescription) {
			return "++" + component.getName();
		} else if (component instanceof DocumentIdentification) {
			return "&" + component.getName();
		} else if (component instanceof InstallationLocationDescription) {
			return "+" + component.getName();
		} else if (component instanceof FunctionalAssignment) {
			return "==" + component.getName();
		} else if (component instanceof SignalIdentification) {
			return ";" + component.getName();
		} else if (component instanceof FunctionalDesignation) {
			return "=" + component.getName();
		} else if (component instanceof CommonAssignment) {
			return "#" + component.getName();
		} else if (component instanceof ProductDescription) {
			return "-" + component.getName();
		}
		return null;
	}

	private void addRDSPPComponent() {
		RDSPPComponent selectedComponent = getRDSPPComponentByName(componentSelector.getText());
		List<String> selectorItems = new ArrayList<>(Arrays.asList(componentSelector.getItems()));
		selectorItems.remove(componentSelector.getText());
		componentSelector.setItems(selectorItems.toArray(new String[0]));
		if (selectorItems.size() > 0) {
			componentSelector.select(0);
		}
		if (selectedComponent != null) {
			addComponent(selectedComponent);
		}
	}

	private RDSPPComponent getRDSPPComponentByName(String text) {
		RDSPPComponent component = getRDSPPComponentsAndNames().get(text);
		return component;
	}

	private Label addLabelToLeftSlot(String text) {
		Label label = new Label(leftSlot, SWT.LEFT);
		label.setText(text);
		return label;
	}

	private Label addLabelToRightSlot(String text) {
		Label label = new Label(rightSlot, SWT.LEFT);
		label.setText(text);
		return label;
	}

	private Shell getNewGrid2Shell() {
		Display display = PlatformUI.getWorkbench().getDisplay();
		Shell shell = new Shell(display, SWT.TITLE | SWT.MIN | SWT.CLOSE);
		GridLayout gridLayout = new GridLayout();

		gridLayout.numColumns = 2;

		shell.setLayout(gridLayout);
		return shell;
	}

	private Combo addRDSPPComponentSelector() {
		String[] allNames = getRDSPPComponentsNames();
		if (allNames.length > 0) {
			componentSelector = new Combo(leftSlot, SWT.DROP_DOWN | SWT.READ_ONLY);

			componentSelector.setItems(allNames);
			componentSelector.select(0);
			componentSelector.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					System.out.println(componentSelector.getText());
				}

				public void widgetDefaultSelected(SelectionEvent e) {
					System.out.println(componentSelector.getText());
				}
			});
		} else {
			addLabelToLeftSlot("Keine RDS-PP Komponenten gefunden");
		}
		return componentSelector;
	}

	private String[] getRDSPPComponentsNames() {
		List<String> allNames = new ArrayList<>();
		for (Entry<String, RDSPPComponent> entry : getRDSPPComponentsAndNames().entrySet()) {
			allNames.add(entry.getKey());
		}
		Collections.sort(allNames);
		return allNames.toArray(new String[0]);
	}

	private final static String WHITESPACE = " ";
	private final static String EMPTYSTRING = "";

	private Map<String, RDSPPComponent> getRDSPPComponentsAndNames() {
		Map<String, RDSPPComponent> result = new HashMap<>();

		for (RDSPPComponent component : getRDSPPComponents()) {
			String name = getTypeString(component) + component.getName();
			if (!(component.getDescription() == null
					|| EMPTYSTRING.equals(component.getDescription().replace(WHITESPACE, EMPTYSTRING)))) {
				name += WHITESPACE + "(" + component.getDescription() + ")";
			}
			result.put(name, component);
		}
		return result;
	}

	private String getTypeString(RDSPPComponent component) {
		if (component instanceof ConnectionIdentification) {
			return "Anschlusskennzeichnung :";
		} else if (component instanceof LocationDescription) {
			return "Aufstellungsortkennzeichnung ++";
		} else if (component instanceof DocumentIdentification) {
			return "Dokumentenkennzeichnung &";
		} else if (component instanceof InstallationLocationDescription) {
			return "Einbauortkennzeichnung +";
		} else if (component instanceof FunctionalAssignment) {
			return "Funktionale Zuordnung ==";
		} else if (component instanceof SignalIdentification) {
			return "Signalkennzeichnung ;";
		} else if (component instanceof FunctionalDesignation) {
			return "Funktionsbezogene Kennzeichnung =";
		} else if (component instanceof CommonAssignment) {
			return "Gemeinsame Zuordnung #";
		} else if (component instanceof ProductDescription) {
			return "Produktbezogene Kennzeichnung -";
		}
		return null;
	}

	private List<RDSPPComponent> getRDSPPComponents() {

		IXtextDocument xtextDocument = EditorUtils.getActiveXtextEditor().getDocument();
		XtextResource resource = xtextDocument.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
			public XtextResource exec(XtextResource state) throws Exception {
				return state;
			}
		});

		EList<EObject> contents = resource.getContents();
		List<RDSPPComponent> componentes = new ArrayList<>();
		for (EObject entry : contents) {
			if (entry instanceof Model) {
				Model model = (Model) entry;
				for (Declaration dec : model.getDeclarations()) {
					if (dec instanceof RDSPPComponent) {
						componentes.add((RDSPPComponent) dec);
					}
				}
			}
		}

		return componentes;
	}

}
