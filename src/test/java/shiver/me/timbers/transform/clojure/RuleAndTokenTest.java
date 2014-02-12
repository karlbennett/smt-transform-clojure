package shiver.me.timbers.transform.clojure;

import org.junit.Test;
import shiver.me.timbers.transform.language.test.RuleAndTokenTestTemplate;

import static shiver.me.timbers.transform.clojure.TransformationsConstants.RULES_PACKAGE_NAME;
import static shiver.me.timbers.transform.clojure.TransformationsConstants.TYPES_PACKAGE_NAME;
import static shiver.me.timbers.transform.language.test.RuleAndTokenTestUtils.testEachTransformationInPackage;

public class RuleAndTokenTest implements RuleAndTokenTestTemplate {

    @Test
    @Override
    public void testAllTypeTransformations() {

        testEachTransformationInPackage(TYPES_PACKAGE_NAME);
    }

    @Test
    @Override
    public void testAllRuleTransformations() {

        testEachTransformationInPackage(RULES_PACKAGE_NAME);
    }
}
