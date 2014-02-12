package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Keyword extends CompositeTokenTransformation {
    public static final String NAME = "KEYWORD";

    public Keyword(TokenApplier applier) {
        super(NAME, applier);
    }
}
