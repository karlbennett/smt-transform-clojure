package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Regex extends CompositeTokenTransformation {
    public static final String NAME = "regex";

    public Regex(TokenApplier applier) {
        super(NAME, applier);
    }
}
