package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Symbol extends CompositeTokenTransformation {
    public static final String NAME = "SYMBOL";

    public Symbol(TokenApplier applier) {
        super(NAME, applier);
    }
}
