package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Vector extends CompositeTokenTransformation {
    public static final String NAME = "vector";

    public Vector(TokenApplier applier) {
        super(NAME, applier);
    }
}
