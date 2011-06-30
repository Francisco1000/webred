package WebRequirementsMetamodel.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class WebRequirementsMetamodelCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelCreationWizardTitle);
		setDefaultPageImageDescriptor(WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewWebRequirementsMetamodelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelCreationWizardPage(
				"DiagramModelFile", getSelection(), "webrequirementsmetamodel_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelCreationWizardPage(
				"DomainModelFile", getSelection(), "webrequirementsmetamodel") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".webrequirementsmetamodel_diagram".length()); //$NON-NLS-1$
					setFileName(WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "webrequirementsmetamodel")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								WebRequirementsMetamodel.diagram.part.Messages.WebRequirementsMetamodelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				WebRequirementsMetamodel.diagram.part.WebRequirementsMetamodelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
