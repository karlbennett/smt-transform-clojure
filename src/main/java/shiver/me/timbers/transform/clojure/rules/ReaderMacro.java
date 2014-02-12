package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ReaderMacro extends CompositeTokenTransformation {
    public static final String NAME = "reader_macro";

    public ReaderMacro(TokenApplier applier) {
        super(NAME, applier);
    }
}
