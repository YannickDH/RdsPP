package de.rdspp.editor.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import de.rdspp.editor.ui.popups.RDSPPComponentDialog;

public class RdsppComponentsAction implements IWorkbenchWindowActionDelegate {
	IWorkbenchWindow activeWindow = null;

	/**
	 * Run the action. Display the new RDS-PP Component window
	 */
	public void run(IAction proxyAction) {
		openRDSPPComponentPopup();
	}

	private void openRDSPPComponentPopup() {
		new RDSPPComponentDialog();
	}


	// IActionDelegate method
	public void selectionChanged(IAction proxyAction, ISelection selection) {
		// do nothing, action is not dependent on the selection
	}

	// IWorkbenchWindowActionDelegate method
	public void init(IWorkbenchWindow window) {
		activeWindow = window;
	}

	// IWorkbenchWindowActionDelegate method
	public void dispose() {
		// nothing to do
	}
}