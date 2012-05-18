package proto;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;

import proto.core.Compiler;
import proto.core.TinyCompiler;

public class Launcher {

	public static void main(String[] args) throws IOException, RecognitionException {
		// ������� ��������� ������
		// ��������� ������� ����������� (+������, ������, ���������)
		// ��������� compiler.compile
		// generator.generate

		String s = "asd";
		
		ANTLRFileStream fs = new ANTLRFileStream("examples/simple.proto");

		Compiler protoc = new TinyCompiler();
		System.out.print(protoc.compile(fs));
	}
}
