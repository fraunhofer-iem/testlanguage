/**
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification.validation;

/**
 * A sample validator interface for
 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.SaveModel}.
 * This doesn't really do anything, and it's not a real EMF artifact. It was
 * generated by the org.eclipse.emf.examples.generator.validator plug-in to
 * illustrate how EMF's code generator can be extended. This can be disabled
 * with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SaveModelValidator {
	boolean validate();

	boolean validateUri(String value);
}
