package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class List extends CompositeTokenTransformation {
    public static final String NAME = "list";

    public List(TokenApplier applier) {
        super(NAME, applier);
    }
}
