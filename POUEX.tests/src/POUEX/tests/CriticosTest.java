/**
 */
package POUEX.tests;

import POUEX.Criticos;
import POUEX.POUEXFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Criticos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CriticosTest extends EstadosTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(CriticosTest.class);
  }

  /**
   * Constructs a new Criticos test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CriticosTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Criticos test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Criticos getFixture()
  {
    return (Criticos)fixture;
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
    setFixture(POUEXFactory.eINSTANCE.createCriticos());
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

} //CriticosTest
