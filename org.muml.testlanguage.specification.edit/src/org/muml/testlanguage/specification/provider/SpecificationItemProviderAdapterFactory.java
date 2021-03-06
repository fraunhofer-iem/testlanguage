/**
 */
package org.muml.testlanguage.specification.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.muml.testlanguage.specification.util.SpecificationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support
 * Viewers. The adapters generated by this factory convert EMF adapter
 * notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The
 * adapters also support Eclipse property sheets. Note that most of the adapters
 * are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SpecificationItemProviderAdapterFactory extends SpecificationAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this
	 * adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement
	 * {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by
	 * {@link #isFactoryForType isFactoryForType}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public SpecificationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.PortSpecification} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PortSpecificationItemProvider portSpecificationItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.PortSpecification}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createPortSpecificationAdapter() {
		if (portSpecificationItemProvider == null) {
			portSpecificationItemProvider = new PortSpecificationItemProvider(this);
		}

		return portSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.Default} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DefaultItemProvider defaultItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.Default}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDefaultAdapter() {
		if (defaultItemProvider == null) {
			defaultItemProvider = new DefaultItemProvider(this);
		}

		return defaultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.LoadModel} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LoadModelItemProvider loadModelItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.LoadModel}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createLoadModelAdapter() {
		if (loadModelItemProvider == null) {
			loadModelItemProvider = new LoadModelItemProvider(this);
		}

		return loadModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.CompareModels} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompareModelsItemProvider compareModelsItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.CompareModels}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCompareModelsAdapter() {
		if (compareModelsItemProvider == null) {
			compareModelsItemProvider = new CompareModelsItemProvider(this);
		}

		return compareModelsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.ValidateModel} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValidateModelItemProvider validateModelItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.ValidateModel}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValidateModelAdapter() {
		if (validateModelItemProvider == null) {
			validateModelItemProvider = new ValidateModelItemProvider(this);
		}

		return validateModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.SaveModel} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SaveModelItemProvider saveModelItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.SaveModel}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createSaveModelAdapter() {
		if (saveModelItemProvider == null) {
			saveModelItemProvider = new SaveModelItemProvider(this);
		}

		return saveModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.Transformation} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TransformationItemProvider transformationItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.Transformation}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTransformationAdapter() {
		if (transformationItemProvider == null) {
			transformationItemProvider = new TransformationItemProvider(this);
		}

		return transformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.ExecuteUPPAAL} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExecuteUPPAALItemProvider executeUPPAALItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.ExecuteUPPAAL}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createExecuteUPPAALAdapter() {
		if (executeUPPAALItemProvider == null) {
			executeUPPAALItemProvider = new ExecuteUPPAALItemProvider(this);
		}

		return executeUPPAALItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.PrimitiveString} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PrimitiveStringItemProvider primitiveStringItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.PrimitiveString}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveStringAdapter() {
		if (primitiveStringItemProvider == null) {
			primitiveStringItemProvider = new PrimitiveStringItemProvider(this);
		}

		return primitiveStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.AssertBool} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssertBoolItemProvider assertBoolItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.AssertBool}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAssertBoolAdapter() {
		if (assertBoolItemProvider == null) {
			assertBoolItemProvider = new AssertBoolItemProvider(this);
		}

		return assertBoolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.AssertDiagnosticTrace}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssertDiagnosticTraceItemProvider assertDiagnosticTraceItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.AssertDiagnosticTrace}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAssertDiagnosticTraceAdapter() {
		if (assertDiagnosticTraceItemProvider == null) {
			assertDiagnosticTraceItemProvider = new AssertDiagnosticTraceItemProvider(this);
		}

		return assertDiagnosticTraceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.AssertResult} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssertResultItemProvider assertResultItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.AssertResult}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAssertResultAdapter() {
		if (assertResultItemProvider == null) {
			assertResultItemProvider = new AssertResultItemProvider(this);
		}

		return assertResultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.muml.testlanguage.specification.CheckMTCTL} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CheckMTCTLItemProvider checkMTCTLItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.muml.testlanguage.specification.CheckMTCTL}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCheckMTCTLAdapter() {
		if (checkMTCTLItemProvider == null) {
			checkMTCTLItemProvider = new CheckMTCTLItemProvider(this);
		}

		return checkMTCTLItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the
	 * adapter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to
	 * {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if (portSpecificationItemProvider != null)
			portSpecificationItemProvider.dispose();
		if (defaultItemProvider != null)
			defaultItemProvider.dispose();
		if (loadModelItemProvider != null)
			loadModelItemProvider.dispose();
		if (compareModelsItemProvider != null)
			compareModelsItemProvider.dispose();
		if (validateModelItemProvider != null)
			validateModelItemProvider.dispose();
		if (saveModelItemProvider != null)
			saveModelItemProvider.dispose();
		if (transformationItemProvider != null)
			transformationItemProvider.dispose();
		if (executeUPPAALItemProvider != null)
			executeUPPAALItemProvider.dispose();
		if (primitiveStringItemProvider != null)
			primitiveStringItemProvider.dispose();
		if (assertBoolItemProvider != null)
			assertBoolItemProvider.dispose();
		if (assertDiagnosticTraceItemProvider != null)
			assertDiagnosticTraceItemProvider.dispose();
		if (assertResultItemProvider != null)
			assertResultItemProvider.dispose();
		if (checkMTCTLItemProvider != null)
			checkMTCTLItemProvider.dispose();
	}

}
