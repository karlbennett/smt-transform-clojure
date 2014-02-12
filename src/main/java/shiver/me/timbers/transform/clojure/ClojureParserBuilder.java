package shiver.me.timbers.transform.clojure;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import shiver.me.timbers.antlr4.clojure.ClojureLexer;
import shiver.me.timbers.antlr4.clojure.ClojureParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.ParserBuilder;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
import shiver.me.timbers.transform.antlr4.listeners.LoggingErrorListener;
import shiver.me.timbers.transform.antlr4.listeners.TransformationAwareErrorListener;

/**
 * A {@code ParserBuilder} for the ANTLR4 {@code ClojureParser}.
 */
public class ClojureParserBuilder implements ParserBuilder<ClojureParser> {

    @Override
    public ClojureParser buildParser(String source, Transformations<TokenTransformation> errorTransformations) {

        final CharStream charStream = new ANTLRInputStream(source);

        final ClojureLexer lexer = new ClojureLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LoggingErrorListener());

        final TokenStream tokenStream = new BufferedTokenStream(lexer);

        final ClojureParser parser = new ClojureParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new TransformationAwareErrorListener(new LoggingErrorListener(), errorTransformations));

        return parser;
    }

    @Override
    public ParseTree parse(ClojureParser parser) {

        return parser.file();
    }
}
