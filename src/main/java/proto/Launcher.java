package proto;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.stringtemplate.v4.compiler.CodeGenerator.includeExpr_return;

import proto.core.Compiler;
import proto.core.TinyCompiler;

public class Launcher {

	public static void main(String[] args) throws IOException, RecognitionException {
		// ������� ��������� ������
		// + ��������� ������� ����������� (+������, ������, ���������)
		// + ��������� compiler.compile
		// generator.generate

		ANTLRFileStream fs = new ANTLRFileStream("examples/simple.proto");

		Compiler compiler = new TinyCompiler();
		String output = "";
		output = compiler.compile(fs);
		
		System.err.println(output);
	}
}
