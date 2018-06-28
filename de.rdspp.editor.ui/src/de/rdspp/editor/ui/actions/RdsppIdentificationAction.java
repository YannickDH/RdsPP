package de.rdspp.editor.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import de.rdspp.editor.ui.popups.RDSPPIdentificationDialog;

public class RdsppIdentificationAction implements IWorkbenchWindowActionDelegate {
	IWorkbenchWindow activeWindow = null;

	/**
	 * Run the action. Display the new RDS-PP Component window
	 */
	public void run(IAction proxyAction) {
		openRDSPPIdentificationPopup();
	}

	private void openRDSPPIdentificationPopup() {
		new RDSPPIdentificationDialog();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		activeWindow = window;
	}
}