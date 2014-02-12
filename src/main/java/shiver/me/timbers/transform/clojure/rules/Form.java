package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Form extends CompositeTokenTransformation {
    public static final String NAME = "form";

    public Form(TokenApplier applier) {
        super(NAME, applier);
    }
}
