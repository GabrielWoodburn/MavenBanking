package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Test suite to run TestCheckingLogic and TestSavingsLogic
@RunWith(Suite.class)
@SuiteClasses({ TestCheckingLogic.class, TestSavingsLogic.class })
public class AllTests {

}
