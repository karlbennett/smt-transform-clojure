package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Lambda extends CompositeTokenTransformation {
    public static final String NAME = "lambda";

    public Lambda(TokenApplier applier) {
        super(NAME, applier);
    }
}
