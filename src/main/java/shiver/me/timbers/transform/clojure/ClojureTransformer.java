package shiver.me.timbers.transform.clojure;

import shiver.me.timbers.antlr4.clojure.ClojureParser;
import shiver.me.timbers.transform.antlr4.Antlr4StringTransformer;

import javax.activation.MimeType;

/**
 * A StringTransformer for Clojure source code, it will apply any Transformations that have names matching the different
 * token and rule names. These names can be found in the {@link ClojureParser#tokenNames} and
 * {@link ClojureParser#ruleNames} arrays.
 */
public class ClojureTransformer extends Antlr4StringTransformer<ClojureParser> {

    public static final MimeType TEXT_X_CLOJURE = quietMimeType("text", "x-clojure");

    public ClojureTransformer() {
        super(TEXT_X_CLOJURE, new ClojureParserBuilder());
    }
}
