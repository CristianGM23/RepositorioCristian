/**
 *
 * $Id$
 */
package bpmn.validation;

import bpmn.Connection;
import bpmn.Lane;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bpmn.Figure}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FigureValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateConnection(EList<Connection> value);

	boolean validateConnectionTarget(EList<Connection> value);

	boolean validateConnectionSource(EList<Connection> value);

	boolean validateFigurecontentslane(Lane value);
}
