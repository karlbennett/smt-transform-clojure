package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Number extends CompositeTokenTransformation {
    public static final String NAME = "NUMBER";

    public Number(TokenApplier applier) {
        super(NAME, applier);
    }
}
