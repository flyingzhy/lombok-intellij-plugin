package de.plushnikov.intellij.plugin.inspection;

import com.intellij.codeInspection.InspectionProfileEntry;

/**
 * @author Plushnikov Michail
 */
public class DiverseInspectionTest extends LombokInspectionTest {

  @Override
  protected String getTestDataPath() {
    return TEST_DATA_INSPECTION_DIRECTORY + "/diverse";
  }

  @Override
  protected InspectionProfileEntry getInspection() {
    return new LombokInspection();
  }

  public void testIssue37() {
    doTest();
  }

  public void testDataEqualsAndHashCodeOverride() {
    doTest();
  }

  public void testEqualsAndHashCodeCallSuper() {
    doTest();
  }

  public void testSetterOnFinalField() {
    doTest();
  }
}
