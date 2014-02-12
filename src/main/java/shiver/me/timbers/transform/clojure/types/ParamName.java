package shiver.me.timbers.transform.clojure.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ParamName extends CompositeTokenTransformation {
    public static final String NAME = "PARAM_NAME";

    public ParamName(TokenApplier applier) {
        super(NAME, applier);
    }
}
