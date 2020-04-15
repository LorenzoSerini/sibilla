/**
 * generated by Xtext 2.18.0.M3
 */
package quasylab.sibilla.lang.pm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quasylab.sibilla.lang.pm.model.NegationExpression#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see quasylab.sibilla.lang.pm.model.ModelPackage#getNegationExpression()
 * @model
 * @generated
 */
public interface NegationExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(Expression)
   * @see quasylab.sibilla.lang.pm.model.ModelPackage#getNegationExpression_Argument()
   * @model containment="true"
   * @generated
   */
  Expression getArgument();

  /**
   * Sets the value of the '{@link quasylab.sibilla.lang.pm.model.NegationExpression#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(Expression value);

} // NegationExpression
