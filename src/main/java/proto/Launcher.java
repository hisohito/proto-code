package proto;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import proto.antlr.ProtoLexer;
import proto.antlr.ProtoParser;
import proto.core.TinyCompiler;
import proto.core.Compiler;


public class Launcher {

	public static void main(String[] args) throws IOException, RecognitionException {
		// парсить командную строку
		// создавать инстанс компилятора (+парсер, лексер, генератор)
		// запускать compiler.compile
		// generator.generate

		ANTLRFileStream fs = new ANTLRFileStream("examples/simple.proto");

		Compiler protoc = new TinyCompiler();
		System.out.print(protoc.compile(fs));
		
	}
}
