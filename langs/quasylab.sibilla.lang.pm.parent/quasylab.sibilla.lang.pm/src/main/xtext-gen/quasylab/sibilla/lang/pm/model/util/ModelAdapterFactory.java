/**
 * generated by Xtext 2.18.0.M3
 */
package quasylab.sibilla.lang.pm.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import quasylab.sibilla.lang.pm.model.AndExpression;
import quasylab.sibilla.lang.pm.model.CallExpression;
import quasylab.sibilla.lang.pm.model.Constant;
import quasylab.sibilla.lang.pm.model.DifferenceOperator;
import quasylab.sibilla.lang.pm.model.DisEqualOperator;
import quasylab.sibilla.lang.pm.model.DivisionOperator;
import quasylab.sibilla.lang.pm.model.Element;
import quasylab.sibilla.lang.pm.model.EqualOperator;
import quasylab.sibilla.lang.pm.model.Expression;
import quasylab.sibilla.lang.pm.model.FalseLiteral;
import quasylab.sibilla.lang.pm.model.FractionOf;
import quasylab.sibilla.lang.pm.model.GreaterOperator;
import quasylab.sibilla.lang.pm.model.GreaterOrEqualOperator;
import quasylab.sibilla.lang.pm.model.IfThenElseExpression;
import quasylab.sibilla.lang.pm.model.LessOperator;
import quasylab.sibilla.lang.pm.model.LessOrEqualOperator;
import quasylab.sibilla.lang.pm.model.Macro;
import quasylab.sibilla.lang.pm.model.MaxExpression;
import quasylab.sibilla.lang.pm.model.Measure;
import quasylab.sibilla.lang.pm.model.MinExpression;
import quasylab.sibilla.lang.pm.model.Model;
import quasylab.sibilla.lang.pm.model.ModelPackage;
import quasylab.sibilla.lang.pm.model.ModuloExpression;
import quasylab.sibilla.lang.pm.model.MulDivExpression;
import quasylab.sibilla.lang.pm.model.MulDivOperator;
import quasylab.sibilla.lang.pm.model.MultiplicationOperator;
import quasylab.sibilla.lang.pm.model.Multiplicity;
import quasylab.sibilla.lang.pm.model.NegationExpression;
import quasylab.sibilla.lang.pm.model.NotExpression;
import quasylab.sibilla.lang.pm.model.NumExpression;
import quasylab.sibilla.lang.pm.model.NumberOf;
import quasylab.sibilla.lang.pm.model.OrExpression;
import quasylab.sibilla.lang.pm.model.Population;
import quasylab.sibilla.lang.pm.model.ReferenceableElement;
import quasylab.sibilla.lang.pm.model.RelationExpression;
import quasylab.sibilla.lang.pm.model.RelationOperator;
import quasylab.sibilla.lang.pm.model.Rule;
import quasylab.sibilla.lang.pm.model.Species;
import quasylab.sibilla.lang.pm.model.SumDiffExpression;
import quasylab.sibilla.lang.pm.model.SumDiffOperator;
import quasylab.sibilla.lang.pm.model.SumOperator;
import quasylab.sibilla.lang.pm.model.TrueLiteral;
import quasylab.sibilla.lang.pm.model.ZeroDivisionOperator;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see quasylab.sibilla.lang.pm.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelSwitch<Adapter> modelSwitch =
    new ModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseSystem(quasylab.sibilla.lang.pm.model.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseMacro(Macro object)
      {
        return createMacroAdapter();
      }
      @Override
      public Adapter caseMeasure(Measure object)
      {
        return createMeasureAdapter();
      }
      @Override
      public Adapter caseReferenceableElement(ReferenceableElement object)
      {
        return createReferenceableElementAdapter();
      }
      @Override
      public Adapter caseSpecies(Species object)
      {
        return createSpeciesAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter casePopulation(Population object)
      {
        return createPopulationAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseRelationOperator(RelationOperator object)
      {
        return createRelationOperatorAdapter();
      }
      @Override
      public Adapter caseMulDivOperator(MulDivOperator object)
      {
        return createMulDivOperatorAdapter();
      }
      @Override
      public Adapter caseSumDiffOperator(SumDiffOperator object)
      {
        return createSumDiffOperatorAdapter();
      }
      @Override
      public Adapter caseFractionOf(FractionOf object)
      {
        return createFractionOfAdapter();
      }
      @Override
      public Adapter caseNumberOf(NumberOf object)
      {
        return createNumberOfAdapter();
      }
      @Override
      public Adapter caseNumExpression(NumExpression object)
      {
        return createNumExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseRelationExpression(RelationExpression object)
      {
        return createRelationExpressionAdapter();
      }
      @Override
      public Adapter caseLessOperator(LessOperator object)
      {
        return createLessOperatorAdapter();
      }
      @Override
      public Adapter caseLessOrEqualOperator(LessOrEqualOperator object)
      {
        return createLessOrEqualOperatorAdapter();
      }
      @Override
      public Adapter caseEqualOperator(EqualOperator object)
      {
        return createEqualOperatorAdapter();
      }
      @Override
      public Adapter caseDisEqualOperator(DisEqualOperator object)
      {
        return createDisEqualOperatorAdapter();
      }
      @Override
      public Adapter caseGreaterOperator(GreaterOperator object)
      {
        return createGreaterOperatorAdapter();
      }
      @Override
      public Adapter caseGreaterOrEqualOperator(GreaterOrEqualOperator object)
      {
        return createGreaterOrEqualOperatorAdapter();
      }
      @Override
      public Adapter caseMulDivExpression(MulDivExpression object)
      {
        return createMulDivExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicationOperator(MultiplicationOperator object)
      {
        return createMultiplicationOperatorAdapter();
      }
      @Override
      public Adapter caseDivisionOperator(DivisionOperator object)
      {
        return createDivisionOperatorAdapter();
      }
      @Override
      public Adapter caseZeroDivisionOperator(ZeroDivisionOperator object)
      {
        return createZeroDivisionOperatorAdapter();
      }
      @Override
      public Adapter caseSumDiffExpression(SumDiffExpression object)
      {
        return createSumDiffExpressionAdapter();
      }
      @Override
      public Adapter caseSumOperator(SumOperator object)
      {
        return createSumOperatorAdapter();
      }
      @Override
      public Adapter caseDifferenceOperator(DifferenceOperator object)
      {
        return createDifferenceOperatorAdapter();
      }
      @Override
      public Adapter caseModuloExpression(ModuloExpression object)
      {
        return createModuloExpressionAdapter();
      }
      @Override
      public Adapter caseTrueLiteral(TrueLiteral object)
      {
        return createTrueLiteralAdapter();
      }
      @Override
      public Adapter caseFalseLiteral(FalseLiteral object)
      {
        return createFalseLiteralAdapter();
      }
      @Override
      public Adapter caseNotExpression(NotExpression object)
      {
        return createNotExpressionAdapter();
      }
      @Override
      public Adapter caseNegationExpression(NegationExpression object)
      {
        return createNegationExpressionAdapter();
      }
      @Override
      public Adapter caseCallExpression(CallExpression object)
      {
        return createCallExpressionAdapter();
      }
      @Override
      public Adapter caseMinExpression(MinExpression object)
      {
        return createMinExpressionAdapter();
      }
      @Override
      public Adapter caseMaxExpression(MaxExpression object)
      {
        return createMaxExpressionAdapter();
      }
      @Override
      public Adapter caseIfThenElseExpression(IfThenElseExpression object)
      {
        return createIfThenElseExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Macro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Macro
   * @generated
   */
  public Adapter createMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Measure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Measure
   * @generated
   */
  public Adapter createMeasureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.ReferenceableElement <em>Referenceable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.ReferenceableElement
   * @generated
   */
  public Adapter createReferenceableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Species <em>Species</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Species
   * @generated
   */
  public Adapter createSpeciesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Population <em>Population</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Population
   * @generated
   */
  public Adapter createPopulationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.RelationOperator <em>Relation Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.RelationOperator
   * @generated
   */
  public Adapter createRelationOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.MulDivOperator <em>Mul Div Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.MulDivOperator
   * @generated
   */
  public Adapter createMulDivOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.SumDiffOperator <em>Sum Diff Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.SumDiffOperator
   * @generated
   */
  public Adapter createSumDiffOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.FractionOf <em>Fraction Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.FractionOf
   * @generated
   */
  public Adapter createFractionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.NumberOf <em>Number Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.NumberOf
   * @generated
   */
  public Adapter createNumberOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.NumExpression <em>Num Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.NumExpression
   * @generated
   */
  public Adapter createNumExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.RelationExpression <em>Relation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.RelationExpression
   * @generated
   */
  public Adapter createRelationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.LessOperator <em>Less Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.LessOperator
   * @generated
   */
  public Adapter createLessOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.LessOrEqualOperator <em>Less Or Equal Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.LessOrEqualOperator
   * @generated
   */
  public Adapter createLessOrEqualOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.EqualOperator <em>Equal Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.EqualOperator
   * @generated
   */
  public Adapter createEqualOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.DisEqualOperator <em>Dis Equal Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.DisEqualOperator
   * @generated
   */
  public Adapter createDisEqualOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.GreaterOperator <em>Greater Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.GreaterOperator
   * @generated
   */
  public Adapter createGreaterOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.GreaterOrEqualOperator <em>Greater Or Equal Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.GreaterOrEqualOperator
   * @generated
   */
  public Adapter createGreaterOrEqualOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.MulDivExpression <em>Mul Div Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.MulDivExpression
   * @generated
   */
  public Adapter createMulDivExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.MultiplicationOperator <em>Multiplication Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.MultiplicationOperator
   * @generated
   */
  public Adapter createMultiplicationOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.DivisionOperator <em>Division Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.DivisionOperator
   * @generated
   */
  public Adapter createDivisionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.ZeroDivisionOperator <em>Zero Division Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.ZeroDivisionOperator
   * @generated
   */
  public Adapter createZeroDivisionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.SumDiffExpression <em>Sum Diff Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.SumDiffExpression
   * @generated
   */
  public Adapter createSumDiffExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.SumOperator <em>Sum Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.SumOperator
   * @generated
   */
  public Adapter createSumOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.DifferenceOperator <em>Difference Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.DifferenceOperator
   * @generated
   */
  public Adapter createDifferenceOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.ModuloExpression <em>Modulo Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.ModuloExpression
   * @generated
   */
  public Adapter createModuloExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.TrueLiteral <em>True Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.TrueLiteral
   * @generated
   */
  public Adapter createTrueLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.FalseLiteral <em>False Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.FalseLiteral
   * @generated
   */
  public Adapter createFalseLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.NotExpression
   * @generated
   */
  public Adapter createNotExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.NegationExpression <em>Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.NegationExpression
   * @generated
   */
  public Adapter createNegationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.CallExpression <em>Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.CallExpression
   * @generated
   */
  public Adapter createCallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.MinExpression <em>Min Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.MinExpression
   * @generated
   */
  public Adapter createMinExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.MaxExpression <em>Max Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.MaxExpression
   * @generated
   */
  public Adapter createMaxExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link quasylab.sibilla.lang.pm.model.IfThenElseExpression <em>If Then Else Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see quasylab.sibilla.lang.pm.model.IfThenElseExpression
   * @generated
   */
  public Adapter createIfThenElseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ModelAdapterFactory
