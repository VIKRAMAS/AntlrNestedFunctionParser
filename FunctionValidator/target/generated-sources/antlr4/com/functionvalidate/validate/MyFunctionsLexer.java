// Generated from MyFunctionsLexer.g4 by ANTLR 4.4
package com.functionvalidate.validate;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyFunctionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, NAME=2, DOT=3, COMMA=4, L_BRACKET=5, R_BRACKET=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"FUNCTION", "NAME", "DOT", "COMMA", "L_BRACKET", "R_BRACKET", "WS"
	};


	public MyFunctionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyFunctionsLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t/\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\6\3\35\n\3\r\3\16\3\36\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\6\b*\n\b\r\b\16\b+\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\3\2\4\5\2\62;C\\c|\5\2\13\f\17\17\"\"\60\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2"+
		"\2\2\5\34\3\2\2\2\7 \3\2\2\2\t\"\3\2\2\2\13$\3\2\2\2\r&\3\2\2\2\17)\3"+
		"\2\2\2\21\22\7H\2\2\22\23\7w\2\2\23\24\7p\2\2\24\25\7e\2\2\25\26\7v\2"+
		"\2\26\27\7k\2\2\27\30\7q\2\2\30\31\7p\2\2\31\32\7u\2\2\32\4\3\2\2\2\33"+
		"\35\t\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\6\3\2\2\2 !\7\60\2\2!\b\3\2\2\2\"#\7.\2\2#\n\3\2\2\2$%\7*\2\2%\f\3\2"+
		"\2\2&\'\7+\2\2\'\16\3\2\2\2(*\t\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,"+
		"\3\2\2\2,-\3\2\2\2-.\b\b\2\2.\20\3\2\2\2\5\2\36+\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}