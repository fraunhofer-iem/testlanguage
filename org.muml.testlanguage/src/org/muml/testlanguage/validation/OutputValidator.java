/**
 *
 * $Id$
 */
package org.muml.testlanguage.validation;

import org.eclipse.emf.common.util.EList;
import org.muml.testlanguage.Input;
import org.muml.testlanguage.Node;

/**
 * A sample validator interface for
 * {@link org.muml.testlanguage.Output}. This doesn't really
 * do anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's
 * code generator can be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OutputValidator {
	boolean validate();

	boolean validateTargets(EList<Input> value);

	boolean validateNode(Node value);
}
