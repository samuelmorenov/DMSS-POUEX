/**
 */
package POUEX.tests;

import POUEX.Fisicas;
import POUEX.POUEXFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fisicas</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FisicasTest extends CaracteristicasTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(FisicasTest.class);
  }

  /**
   * Constructs a new Fisicas test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FisicasTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Fisicas test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Fisicas getFixture()
  {
    return (Fisicas)fixture;
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
    setFixture(POUEXFactory.eINSTANCE.createFisicas());
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

} //FisicasTest
