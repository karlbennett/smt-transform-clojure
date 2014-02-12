package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class MetaData extends CompositeTokenTransformation {
    public static final String NAME = "meta_data";

    public MetaData(TokenApplier applier) {
        super(NAME, applier);
    }
}
