package shiver.me.timbers.transform.clojure;

import org.junit.Test;
import shiver.me.timbers.transform.language.test.ParserBuilderTestTemplate;

import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserWithNullSourceStringTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserWithNullTransformationsTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.parseTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.parseWithNullParserTest;

public class ClojureParserBuilderTest implements ParserBuilderTestTemplate {

    @Test
    @Override
    public void testBuildParser() {

        buildParserTest(new ClojureParserBuilder());
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testBuildParserWithNullSourceString() {

        buildParserWithNullSourceStringTest(new ClojureParserBuilder());
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testBuildParserWithNullTransformations() {

        buildParserWithNullTransformationsTest(new ClojureParserBuilder());
    }

    @Test
    @Override
    public void testParse() {

        parseTest(new ClojureParserBuilder());
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testParseWithNullParser() {

        parseWithNullParserTest(new ClojureParserBuilder());
    }
}
