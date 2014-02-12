package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Character extends CompositeTokenTransformation {
    public static final String NAME = "CHARACTER";

    public Character(TokenApplier applier) {
        super(NAME, applier);
    }
}
