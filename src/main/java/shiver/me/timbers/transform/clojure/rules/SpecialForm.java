package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SpecialForm extends CompositeTokenTransformation {
    public static final String NAME = "special_form";

    public SpecialForm(TokenApplier applier) {
        super(NAME, applier);
    }
}
