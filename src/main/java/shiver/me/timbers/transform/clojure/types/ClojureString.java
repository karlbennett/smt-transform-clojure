package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ClojureString extends CompositeTokenTransformation {
    public static final String NAME = "STRING";

    public ClojureString(TokenApplier applier) {
        super(NAME, applier);
    }
}
