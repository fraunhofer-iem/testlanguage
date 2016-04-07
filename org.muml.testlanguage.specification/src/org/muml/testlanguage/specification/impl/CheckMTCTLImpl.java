/**
 */
package org.muml.testlanguage.specification.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.testlanguage.specification.CheckMTCTL;
import org.muml.testlanguage.specification.NodeSpecification;
import org.muml.testlanguage.specification.PortType;
import org.muml.testlanguage.specification.SpecificationPackage;
import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Check MTCTL</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.muml.testlanguage.specification.impl.CheckMTCTLImpl#getProperties
 * <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckMTCTLImpl extends NodeSpecificationImpl implements CheckMTCTL {

	/**
	 * The default value of the '{@link #getProperties() <em>Properties</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected String properties = PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CheckMTCTLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.CHECK_MTCTL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProperties(String newProperties) {
		String oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.CHECK_MTCTL__PROPERTIES,
					oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initialize() {
		this.setLabel("Check MTCTL");
		this.addPortSpecification(PortType.IN, "muml", false, org.muml.core.modelinstance.RootNode.class);
		this.addPortSpecification(PortType.IN, "options", true, org.muml.uppaal.options.Options.class);
		this.addPortSpecification(PortType.OUT, "results", false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void execute(final Map<String, Object> inputs, final Map<String, Object> outputs)
			throws ExecutionException, Exception {
		// Do we even have properties to verify?
		if ("".equals(this.getProperties())) {
			throw new ExecutionException("No properties to verify.");
		}

		// Copy the MUML model so we do not destroy it.
		// Copier copier = new Copier();

		org.muml.core.modelinstance.RootNode muml = null;
		org.muml.pim.protocol.CoordinationProtocol protocol = null;

		org.muml.core.Extension extension = null;

		org.muml.core.modelinstance.RootNode rootNode = null;
		// EObject rootNode = null;

		if (inputs.get("muml") instanceof org.muml.core.modelinstance.RootNode) {
			rootNode = (org.muml.core.modelinstance.RootNode) inputs.get("muml");
		} else if (inputs.get("muml") instanceof org.muml.pim.protocol.CoordinationProtocol) {

			protocol = (org.muml.pim.protocol.CoordinationProtocol) inputs.get("muml");

			// rootNode = (RootNode)((CoordinationProtocol)
			// inputs.get("muml")).eContainer().eContainer();

			if ((org.eclipse.emf.ecore.util.EcoreUtil
					.getRootContainer(protocol) instanceof org.muml.core.modelinstance.RootNode)) {
				rootNode = (org.muml.core.modelinstance.RootNode) org.eclipse.emf.ecore.util.EcoreUtil
						.getRootContainer(protocol);
			} else {
				throw new ExecutionException("The coordination protocol doesn't have correct RootContainer");
			}

			extension = protocol.getExtension(
					org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage.eINSTANCE
							.getElementToVerifyExtension());
			if (extension == null) {
				extension = org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionFactory.eINSTANCE
						.createElementToVerifyExtension();
				protocol.getExtensions().add(extension);
			}
		} else {
			throw new ExecutionException("Coordination protocol is not specified.");
		}

		// Copy the MUML model so we do not destroy it.
		org.eclipse.emf.ecore.util.EcoreUtil.Copier copier = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
		muml = (org.muml.core.modelinstance.RootNode) copier.copy(rootNode);
		copier.copyReferences();

		// Get the CoordinationProtocol category.
		org.muml.core.modelinstance.ModelElementCategory category = null;
		for (org.muml.core.modelinstance.ModelElementCategory cur : muml.getCategories()) {
			if (cur.getKey().equals("de.uni_paderborn.fujaba.muml.protocol.category")) {
				category = cur;
				break;
			}
		}

		if (category == null) {
			throw new ExecutionException("Model does not contain a CoordinationProtocol category.");
		}

		// Look for a CoordinationProtocol that asks for a verification,
		// otherwise just choose any.

		for (org.muml.core.ExtendableElement cur : category.getModelElements()) {
			protocol = (org.muml.pim.protocol.CoordinationProtocol) cur;

			if (protocol.getExtension(
					org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage.eINSTANCE
							.getElementToVerifyExtension()) != null) {
				break;
			}
			// In case there is no protocol with extension,
			// the last coordination protocol is used
		}
		if (protocol == null) {
			throw new ExecutionException("Model does not contain a CoordinationProtocol.");
		}

		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		resourceSet.getLoadOptions().put(org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		org.muml.uppaal.adapter.mtctl.xtext.scoping.MtctlScopeProvider.getInstance().setScopeForEObject(protocol);
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet
				.createResource(org.eclipse.emf.common.util.URI.createURI("dummy:/dummy.mtctl"));
		resource.load(new java.io.ByteArrayInputStream(properties.getBytes(java.nio.charset.StandardCharsets.UTF_8)),
				resourceSet.getLoadOptions());

		// Parse the PropertyRepository we have in the context of the protocol.
		org.muml.uppaal.requirements.PropertyRepository propertyRepository = (org.muml.uppaal.requirements.PropertyRepository) resource
				.getContents().get(0);

		// Replace all existing PropertyRepositories by the one we just created.
		protocol.getVerificationConstraintRepositories().clear();
		protocol.getVerificationConstraintRepositories()
				.add((org.muml.pim.constraint.VerificationConstraintRepository) propertyRepository);

		// Verify for results (= apply the transformation by the MTCTL people).
		org.eclipse.emf.common.util.URI realURI = org.eclipse.emf.common.util.URI.createURI(
				"platform:/plugin/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2Results.qvto");
		org.eclipse.m2m.qvt.oml.TransformationExecutor executor = new org.eclipse.m2m.qvt.oml.TransformationExecutor(
				realURI);
		org.eclipse.m2m.qvt.oml.ExecutionContextImpl context;
		org.eclipse.core.runtime.IStatus status;
		status = org.eclipse.emf.common.util.BasicDiagnostic.toIStatus(executor.loadTransformation());
		if (!status.isOK()) {
			throw new ExecutionException(status.getMessage());
		}
		context = new org.eclipse.m2m.qvt.oml.ExecutionContextImpl();

		// Check if we have custom options or use the default ones.
		org.muml.uppaal.options.CoordinationProtocolOptions options;
		if (inputs.containsKey("options") && inputs.get("options") != null) {
			options = (org.muml.uppaal.options.CoordinationProtocolOptions) inputs.get("options");
		} else {
			options = org.muml.uppaal.options.OptionsFactory.eINSTANCE.createCoordinationProtocolOptions();
			options.setTraceOptions(org.muml.uppaal.options.TraceOptions.NONE);
		}

		// Create the extents.
		org.eclipse.m2m.qvt.oml.BasicModelExtent mumlExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();
		mumlExtent.add(muml);
		org.eclipse.m2m.qvt.oml.BasicModelExtent optionsExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();
		optionsExtent.add(options);
		org.eclipse.m2m.qvt.oml.BasicModelExtent resultExtent = new org.eclipse.m2m.qvt.oml.BasicModelExtent();

		// Execute the transformation.
		java.io.OutputStreamWriter outStream = new java.io.OutputStreamWriter(System.out);
		org.eclipse.m2m.qvt.oml.util.Log log = new org.eclipse.m2m.qvt.oml.util.WriterLog(outStream);
		context.setLog(log);
		org.eclipse.m2m.qvt.oml.ExecutionDiagnostic dia = executor.execute(context, mumlExtent, optionsExtent,
				resultExtent);

		if (extension != null) {
			extension = null; // Is this enoguh or I should remove the extension
								// from the list of protocol's extensions?
		}

		// Check if we succeeded.
		if (dia.getSeverity() != org.eclipse.m2m.qvt.oml.ExecutionDiagnostic.OK) {
			throw new ExecutionException(dia.getMessage());
		}

		// Get the output.
		outputs.put("results", resultExtent.getContents().get(0));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpecificationPackage.CHECK_MTCTL__PROPERTIES:
			return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpecificationPackage.CHECK_MTCTL__PROPERTIES:
			setProperties((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpecificationPackage.CHECK_MTCTL__PROPERTIES:
			setProperties(PROPERTIES_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpecificationPackage.CHECK_MTCTL__PROPERTIES:
			return PROPERTIES_EDEFAULT == null ? properties != null : !PROPERTIES_EDEFAULT.equals(properties);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NodeSpecification.class) {
			switch (baseOperationID) {
			case SpecificationPackage.NODE_SPECIFICATION___INITIALIZE:
				return SpecificationPackage.CHECK_MTCTL___INITIALIZE;
			case SpecificationPackage.NODE_SPECIFICATION___EXECUTE__MAP_MAP:
				return SpecificationPackage.CHECK_MTCTL___EXECUTE__MAP_MAP;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SpecificationPackage.CHECK_MTCTL___INITIALIZE:
			initialize();
			return null;
		case SpecificationPackage.CHECK_MTCTL___EXECUTE__MAP_MAP:
			try {
				execute((Map<String, Object>) arguments.get(0), (Map<String, Object>) arguments.get(1));
				return null;
			} catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}
} // CheckMTCTLImpl
