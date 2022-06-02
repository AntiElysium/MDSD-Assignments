/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.x21.impl;

import dk.sdu.mmmi.mdsd.x21.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class X21FactoryImpl extends EFactoryImpl implements X21Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static X21Factory init()
  {
    try
    {
      X21Factory theX21Factory = (X21Factory)EPackage.Registry.INSTANCE.getEFactory(X21Package.eNS_URI);
      if (theX21Factory != null)
      {
        return theX21Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new X21FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public X21FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case X21Package.X21: return createX21();
      case X21Package.DECLARATION: return createDeclaration();
      case X21Package.PARAMETER: return createParameter();
      case X21Package.FUNCTION: return createFunction();
      case X21Package.LAMBDA: return createLambda();
      case X21Package.INPUT: return createInput();
      case X21Package.NODE: return createNode();
      case X21Package.STREAM: return createStream();
      case X21Package.ELEMENT: return createElement();
      case X21Package.DATA_DECL: return createDataDecl();
      case X21Package.EXP: return createExp();
      case X21Package.EXPRESSION: return createExpression();
      case X21Package.ATOMIC: return createAtomic();
      case X21Package.LET_BINDING: return createLetBinding();
      case X21Package.IF_STATEMENT: return createIfStatement();
      case X21Package.LOGIC_EXP: return createLogicExp();
      case X21Package.PARAMETER_STATEMENT: return createParameterStatement();
      case X21Package.NEW_STATEMENT: return createNewStatement();
      case X21Package.PLUS: return createPlus();
      case X21Package.MINUS: return createMinus();
      case X21Package.MULT: return createMult();
      case X21Package.DIV: return createDiv();
      case X21Package.PARENTHESIS: return createParenthesis();
      case X21Package.INT_VALUE: return createIntValue();
      case X21Package.NONE: return createNone();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public X21 createX21()
  {
    X21Impl x21 = new X21Impl();
    return x21;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lambda createLambda()
  {
    LambdaImpl lambda = new LambdaImpl();
    return lambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stream createStream()
  {
    StreamImpl stream = new StreamImpl();
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataDecl createDataDecl()
  {
    DataDeclImpl dataDecl = new DataDeclImpl();
    return dataDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LetBinding createLetBinding()
  {
    LetBindingImpl letBinding = new LetBindingImpl();
    return letBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicExp createLogicExp()
  {
    LogicExpImpl logicExp = new LogicExpImpl();
    return logicExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterStatement createParameterStatement()
  {
    ParameterStatementImpl parameterStatement = new ParameterStatementImpl();
    return parameterStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NewStatement createNewStatement()
  {
    NewStatementImpl newStatement = new NewStatementImpl();
    return newStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenthesis createParenthesis()
  {
    ParenthesisImpl parenthesis = new ParenthesisImpl();
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public None createNone()
  {
    NoneImpl none = new NoneImpl();
    return none;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public X21Package getX21Package()
  {
    return (X21Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static X21Package getPackage()
  {
    return X21Package.eINSTANCE;
  }

} //X21FactoryImpl
