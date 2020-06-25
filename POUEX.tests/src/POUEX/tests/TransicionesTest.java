/**
 */
package POUEX.tests;

import POUEX.POUEXFactory;
import POUEX.Transiciones;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transiciones</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransicionesTest extends TestCase
{

  /**
   * The fixture for this Transiciones test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Transiciones fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TransicionesTest.class);
  }

  /**
   * Constructs a new Transiciones test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransicionesTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Transiciones test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Transiciones fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Transiciones test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Transiciones getFixture()
  {
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(POUEXFactory.eINSTANCE.createTransiciones());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //TransicionesTest
