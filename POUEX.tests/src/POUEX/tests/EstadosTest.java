/**
 */
package POUEX.tests;

import POUEX.Estados;
import POUEX.POUEXFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Estados</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EstadosTest extends TestCase
{

  /**
   * The fixture for this Estados test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Estados fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EstadosTest.class);
  }

  /**
   * Constructs a new Estados test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadosTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Estados test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Estados fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Estados test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Estados getFixture()
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
    setFixture(POUEXFactory.eINSTANCE.createEstados());
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

} //EstadosTest
