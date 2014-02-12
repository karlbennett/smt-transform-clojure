package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Map extends CompositeTokenTransformation {
    public static final String NAME = "map";

    public Map(TokenApplier applier) {
        super(NAME, applier);
    }
}
