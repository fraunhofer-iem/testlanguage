/**
 */
package org.muml.testlanguage.specification;

import java.util.Map;

import org.muml.testlanguage.specification.custom.ExecutionException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Primitive String</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.muml.testlanguage.specification.PrimitiveString#getValue
 * <em>Value</em>}</li>
 * </ul>
 *
 * @see org.muml.testlanguage.specification.SpecificationPackage#getPrimitiveString()
 * @model
 * @generated
 */
public interface PrimitiveString extends NodeSpecification {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. The default
	 * value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.muml.testlanguage.specification.SpecificationPackage#getPrimitiveString_Value()
	 * @model default="" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '
	 * {@link org.muml.testlanguage.specification.PrimitiveString#getValue
	 * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='this.setLabel(\"Primitive String\");\r\nthis.addPortSpecification(PortType.OUT, \"string\", false);'"
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.muml.testlanguage.specification.ExecutionException org.muml.testlanguage.specification.DefaultException"
	 *        inputsRequired="true" outputsRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='\t\t// Put the wrapped string onto the output.\r\n\t\toutputs.put(\"string\", this.getValue());\r\n\r\n\t\treturn;'"
	 * @generated
	 */
	void execute(Map<String, Object> inputs, Map<String, Object> outputs) throws ExecutionException, Exception;

} // PrimitiveString
