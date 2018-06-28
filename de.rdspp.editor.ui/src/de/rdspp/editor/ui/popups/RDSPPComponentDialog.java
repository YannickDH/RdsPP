package de.rdspp.editor.ui.popups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

public class RDSPPComponentDialog {
	private Text name;
	private Text description;
	private Shell shell;
	private Combo typeSelector;
//	private Composite explanation;

	public RDSPPComponentDialog() {
		this.shell = getNewGrid2Shell();
		shell.setText("Neue RDS-PP Komponente hinzufügen");

		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;

		addLabel("Komponenten Typ:");
		addRDSComponentTypComboBox(shell);
		
		
//		Idea show explanation
//		explanation = new Composite(shell, SWT.LEFT);
//		setExplanation(TEXT_COMMON_ASSIGNMENT);
//		
//		addLabel(WHITESPACE);
		
		addLabel("Bezeichner");
		this.setName(new Text(shell, SWT.MULTI | SWT.BORDER));
		name.setLayoutData(gridData);

		addLabel("Beschreibung");
		this.setDescription(new Text(shell, SWT.MULTI | SWT.BORDER));
		description.setLayoutData(gridData);

		Button button = new Button(shell, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Hinzufügen");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (inputISComplete()) {
					addRDSPPComponent();
				}
			}
		});

		shell.open();
	}

	private final static String WHITESPACE = " ";
	private final static String EMPTYSTRING = "";
	private final static String NEWLINE = "\n";
	private final static String DESCIPTION_SYMBOL = "->";
	private final static String QUOTE = "\"";

	private final static String ERROR = "Fehler";
	private final static String ERROR_MESSAGE_MISSING_NAME = "Bitte geben sie einen Bezeichner an";

	private boolean inputISComplete() {
		if (name.getText() == null || EMPTYSTRING.equals(name.getText().replace(WHITESPACE, EMPTYSTRING))) {
			MessageDialog.openError(shell, ERROR, ERROR_MESSAGE_MISSING_NAME);
			return false;
		}
		// no need to check description because its optional
		return true;
	}

	private void addRDSPPComponent() {
		StringBuilder newLine = new StringBuilder();

		newLine.append(getDeclarationTextForType(typeSelector.getText()));
		newLine.append(name.getText());
		newLine.append(WHITESPACE);
		if (!(description.getText() == null
				|| EMPTYSTRING.equals(description.getText().replace(WHITESPACE, EMPTYSTRING)))) {
			newLine.append(DESCIPTION_SYMBOL);
			newLine.append(QUOTE);
			newLine.append(description.getText());
			newLine.append(QUOTE);
			newLine.append(WHITESPACE);
		}
		newLine.append(NEWLINE);

		addTextToEditor(newLine.toString());

		shell.close();
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

	private Shell getNewGrid2Shell() {
		Display display = PlatformUI.getWorkbench().getDisplay();
		Shell shell = new Shell(display, SWT.TITLE | SWT.MIN | SWT.CLOSE);
		GridLayout gridLayout = new GridLayout();

		gridLayout.numColumns = 2;

		shell.setLayout(gridLayout);
		return shell;
	}

	private Label addLabel(String text) {
		Label label = new Label(shell, SWT.LEFT);
		label.setText(text);
		return label;
	}

	private Combo addRDSComponentTypComboBox(Shell shell) {
		typeSelector = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);
		typeSelector.setItems(RDSPPComponentTyps);
		typeSelector.select(0);
		typeSelector.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
//				setExplanation(typeSelector.getText());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
//				setExplanation(typeSelector.getText());
			}
		});
		return typeSelector;
	}

	/*
	private static final String TEXT_LEVEL_OF_STRUCTURE = "Gliederungsstufe";
	private static final String TEXT_STRUCTURE = "Aufbau";
	private static final String TEXT_NUMBER_ONE = "1";	
	private static final String TEXT_NUMBER_TWO = "2";	

	private void setExplanation(String selectedType) {
		GridLayout gridLayout = new GridLayout();
		gridLayout
		explanation.setLayout(gridLayout);
		if (TEXT_COMMON_ASSIGNMENT.equals(selectedType)) {
			gridLayout.numColumns = 4;
			new Label(explanation, SWT.LEFT).setText(TEXT_LEVEL_OF_STRUCTURE);
			new Label(explanation, SWT.LEFT).setText(TEXT_NUMBER_ONE);
			new Label(explanation, SWT.LEFT);
			new Label(explanation, SWT.LEFT).setText(TEXT_NUMBER_TWO);
			

			new Label(explanation, SWT.LEFT).setText(TEXT_STRUCTURE);
			new Label(explanation, SWT.LEFT).setText("A...N");
			new Label(explanation, SWT.LEFT).setText(".");
			new Label(explanation, SWT.LEFT).setText("A...N");
			
			new Label(explanation, SWT.LEFT).setText(TEXT_STRUCTURE);
			new Label(explanation, SWT.LEFT).setText("A...N");
			new Label(explanation, SWT.LEFT).setText(".");
			new Label(explanation, SWT.LEFT).setText("A...N");
		}
		explanation.update();
	}
*/
	public Text getName() {
		return name;
	}

	public void setName(Text name) {
		this.name = name;
	}

	public Text getDescription() {
		return description;
	}

	public void setDescription(Text description) {
		this.description = description;
	}

	private static final Map<String, String> rdsppComponentTypMap = createRDSPPComponentTypMap();

	private static final String TEXT_COMMON_ASSIGNMENT = "Gemeinsame Zuordnung";

	private static final Map<String, String> createRDSPPComponentTypMap() {
		Map<String, String> rdsppComponentTypMap = new HashMap<String, String>();
		rdsppComponentTypMap.put("Anschlusskennzeichnung", "ANSCHLUSSKENNZEICHNUNG :");
		rdsppComponentTypMap.put("Aufstellungsortkennzeichnung", "AUFSTELLUNGSORTKENNZEICHNUNG ++");
		rdsppComponentTypMap.put("Dokumentenkennzeichnung", "DOKUMENTENKENNZEICHNUNG &");
		rdsppComponentTypMap.put("Einbauortkennzeichnung", "EINBAUORTKENNZEICHNUNG +");
		rdsppComponentTypMap.put("Funktionale Zuordnung", "FUNKTIONALEZUORDNUNG ==");
		rdsppComponentTypMap.put("Signalkennzeichnung", "SIGNALKENNZEICHNUNG ;");
		rdsppComponentTypMap.put("Funktionsbezogene Kennzeichnung", "FUNKTIONSBEZOGENEKENNZEICHNUNG =");
		rdsppComponentTypMap.put(TEXT_COMMON_ASSIGNMENT, "GEMEINSAMEZUORDNUNG #");
		rdsppComponentTypMap.put("Produktbezogene Kennzeichnung", "PRODUKTBEZOGENEKENNZEICHNUNG -");
		return rdsppComponentTypMap;
	}

	private static final String[] RDSPPComponentTyps = getRDSPPComponentTypes();

	private static final String[] getRDSPPComponentTypes() {
		List<String> rdsppComponentTyps = new ArrayList<>();

		for (Entry<String, String> entry : rdsppComponentTypMap.entrySet()) {
			rdsppComponentTyps.add(entry.getKey());
		}
		return rdsppComponentTyps.toArray(new String[0]);
	}

	private String getDeclarationTextForType(String text) {
		return rdsppComponentTypMap.get(text);
	}

}
