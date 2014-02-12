package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Nil extends CompositeTokenTransformation {
    public static final String NAME = "'nil'";

    public Nil(TokenApplier applier) {
        super(NAME, applier);
    }
}
