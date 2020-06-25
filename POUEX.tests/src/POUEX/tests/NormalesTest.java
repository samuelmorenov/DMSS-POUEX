/**
 */
package POUEX.tests;

import POUEX.Normales;
import POUEX.POUEXFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Normales</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalesTest extends EstadosTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(NormalesTest.class);
  }

  /**
   * Constructs a new Normales test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalesTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Normales test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Normales getFixture()
  {
    return (Normales)fixture;
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
    setFixture(POUEXFactory.eINSTANCE.createNormales());
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

} //NormalesTest
