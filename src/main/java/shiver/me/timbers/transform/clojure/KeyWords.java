package shiver.me.timbers.transform.clojure;

import shiver.me.timbers.transform.antlr4.StaticNameListBuilder;
import shiver.me.timbers.transform.clojure.types.Boolean;
import shiver.me.timbers.transform.clojure.types.Nil;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * This class contains constants to help with parsing Clojure keywords.
 */
public final class KeyWords {

    private KeyWords() {
    }

    /**
     * All the transformation types of the Clojure keyword types.
     */
    @SuppressWarnings("unchecked")
    public static final List<Class> KEYWORDS = unmodifiableList(Arrays.<Class>asList(Boolean.class, Nil.class));

    /**
     * All the names of the Clojure keyword types.
     */
    @SuppressWarnings("unchecked")
    public static final List<String> KEYWORD_NAMES = unmodifiableList(
            new StaticNameListBuilder((Iterable) KEYWORDS).build());
}
