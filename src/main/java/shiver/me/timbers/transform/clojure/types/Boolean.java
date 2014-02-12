package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Boolean extends CompositeTokenTransformation {
    public static final String NAME = "BOOLEAN";

    public Boolean(TokenApplier applier) {
        super(NAME, applier);
    }
}
