package shiver.me.timbers.transform.clojure.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class File extends CompositeTokenTransformation {
    public static final String NAME = "file";

    public File(TokenApplier applier) {
        super(NAME, applier);
    }
}
