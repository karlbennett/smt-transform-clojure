package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class WhiteSpace extends CompositeTokenTransformation {
    public static final String NAME = "WS";

    public WhiteSpace(TokenApplier applier) {
        super(NAME, applier);
    }
}
