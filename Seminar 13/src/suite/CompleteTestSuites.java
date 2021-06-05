package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.GrupaTest;
import tests.GrupaTestWithFakes;
import tests.GrupaTestWithMocks;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithMocks.class, GrupaTestWithFakes.class})
public class CompleteTestSuites {

}
