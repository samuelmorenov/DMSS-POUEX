/**
 */
package POUEX.tests;

import POUEX.Emocionales;
import POUEX.POUEXFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Emocionales</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmocionalesTest extends CaracteristicasTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EmocionalesTest.class);
  }

  /**
   * Constructs a new Emocionales test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmocionalesTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Emocionales test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Emocionales getFixture()
  {
    return (Emocionales)fixture;
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
    setFixture(POUEXFactory.eINSTANCE.createEmocionales());
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

} //EmocionalesTest
