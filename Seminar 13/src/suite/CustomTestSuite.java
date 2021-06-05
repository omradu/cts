package suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import categories.TesteRight;
import categories.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses(CompleteTestSuites.class)
@Categories.IncludeCategory({TesteRight.class})
@Categories.ExcludeCategory({TesteUrgente.class})
public class CustomTestSuite {

}
