package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VarQuote extends CompositeTokenTransformation {
    public static final String NAME = "var_quote";

    public VarQuote(TokenApplier applier) {
        super(NAME, applier);
    }
}
