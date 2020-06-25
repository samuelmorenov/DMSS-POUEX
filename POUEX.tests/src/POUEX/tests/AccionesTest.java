/**
 */
package POUEX.tests;

import POUEX.Acciones;
import POUEX.POUEXFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Acciones</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccionesTest extends TestCase
{

  /**
   * The fixture for this Acciones test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Acciones fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(AccionesTest.class);
  }

  /**
   * Constructs a new Acciones test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccionesTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Acciones test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Acciones fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Acciones test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Acciones getFixture()
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
    setFixture(POUEXFactory.eINSTANCE.createAcciones());
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

} //AccionesTest
