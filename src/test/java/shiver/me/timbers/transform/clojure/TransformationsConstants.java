package shiver.me.timbers.transform.clojure;

import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.CompoundTransformations;
import shiver.me.timbers.transform.antlr4.IterableTokenTransformations;
import shiver.me.timbers.transform.antlr4.TokenApplier;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
import shiver.me.timbers.transform.clojure.types.Comment;
import shiver.me.timbers.transform.language.test.WrappingTokenApplier;

import java.util.Arrays;
import java.util.LinkedList;

import static java.util.Collections.singleton;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.transform.clojure.KeyWords.KEYWORD_NAMES;
import static shiver.me.timbers.transform.language.test.TransformationsUtils.buildWrappingTransformationsFromPackageName;

public final class TransformationsConstants {

    private TransformationsConstants() {
    }

    public static final TokenApplier MOCK_APPLIER = mock(TokenApplier.class);

    public static final String TYPES_PACKAGE_NAME = "shiver.me.timbers.transform.clojure.types";
    public static final String RULES_PACKAGE_NAME = "shiver.me.timbers.transform.clojure.rules";

    public static final Transformations<TokenTransformation> TYPES_TRANSFORMATIONS =
            new IterableTokenTransformations(buildWrappingTransformationsFromPackageName(TYPES_PACKAGE_NAME));

    public static final Transformations<TokenTransformation> RULES_TRANSFORMATIONS =
            new IterableTokenTransformations(buildWrappingTransformationsFromPackageName(RULES_PACKAGE_NAME));

    @SuppressWarnings("unchecked")
    public static final Transformations<TokenTransformation> ALL_TRANSFORMATIONS =
            new IterableTokenTransformations(
                    new LinkedList<TokenTransformation>() {{
                        addAll(TYPES_TRANSFORMATIONS.asCollection());
                        addAll(RULES_TRANSFORMATIONS.asCollection());
                    }}
            );

    public static final Transformations<TokenTransformation> UNUSED_TRANSFORMATIONS =
            new IterableTokenTransformations(
                    Arrays.<TokenTransformation>asList(
                            new CompositeTokenTransformation("unused_one", new WrappingTokenApplier("unused_one")),
                            new CompositeTokenTransformation("unused_two", new WrappingTokenApplier("unused_two")),
                            new CompositeTokenTransformation("unused_three", new WrappingTokenApplier("unused_three"))
                    )
            );

    public static final Transformations<TokenTransformation> KEYWORD_TRANSFORMATIONS =
            new CompoundTransformations(KEYWORD_NAMES, new WrappingTokenApplier("KEYWORD"));

    public static final Transformations<TokenTransformation> COMMENT_TRANSFORMATIONS =
            new CompoundTransformations(singleton(Comment.NAME), new WrappingTokenApplier("COMMENT"));
}
