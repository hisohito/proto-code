// **********************************************************************
// Proto Project
//
// Copyright (c) 2012 Julia Shatilina <julia.shatilina@gmail.com>
//
// Licensed under the Apache License, Version 2.0 (the "License");
// You may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// **********************************************************************

package proto.constants;

public interface Constants {

    public static final String LANGUAGE_PROMELA = "promela";

    public static final String PARAMETERS_TARGET = "target";
    public static final String PARAMETERS_SOURCE = "source";
    public static final String PARAMETERS_OUTPUT = "output";

    public static final String USAGE = "Welcome to Proto Compiler 0.0.1! [http://github.com/hisohito/proto-code]\n\n"
            + "USAGE:\n"
            + "\t java -cp proto-0.0.1.jar proto.Launcher [--target=<TARGET>] [--output=<OUTPUT_FILE>] <SOURCE>\n\n"
            + "\t <SOURCE> is an proto source file\n"
            + "\t <TARGET> is one of supported targets (promela by default)\n"
            + "\t <OUTPUT_FILE> is an output file name (out.pml by default)\n";

    public static final String DEFAULT_OUTPUT_FILENAME = "out";
    public static final String PML_FILE_EXTENSION = ".pml";
    public static final String SPIN_COMMAND_LINE = "spin.exe -f";

    public static final String SMBL_DOUBLE_COLON = "::";
    public static final String SMBL_DOT = ".";
    public static final String SMBL_LEFT_BRACE = "{";
    public static final String SMBL_RIGHT_BRACE = "}";
    public static final String SMBL_LEFT_RBRACE = "(";
    public static final String SMBL_RIGHT_RBRACE = ")";

    public static final String ERR_WRONG_SPEC = "ERROR: Wrong specification description!";
    public static final String MSG_SUCCESS_CREATED_FILES = "Success created files: ";

    public static final String PML_FINALLY = "finally";
    public static final String SPIN_FINALLY = "<>";
    public static final String PML_GLOBALLY = "globally";
    public static final String SPIN_GLOBALLY = "[]";
    public static final String PML_UNTIL = "until";
    public static final String SPIN_UNTIL = "U";
    public static final String PML_RELEASE = "release";
    public static final String SPIN_RELEASE = "R";
    public static final String PML_AND = "and";
    public static final String SPIN_AND = "&&";
    public static final String PML_OR = "or";
    public static final String SPIN_OR = "||";
    public static final String PML_NOT = "not";
    public static final String SPIN_NOT = "!";
    public static final String PML_IF = "if";
    public static final String SPIN_IF = "->";
    public static final String PML_DO = "do";
    public static final String PML_OD = "od;";
    public static final String PML_FI = "fi;";

    public static final String PROTO_FINALIZE = "finalize";
    public static final String PML_DEFINE = "#define";
    public static final String PML_MAIN = "main";
    public static final String PML_INLINE = "inline A1()";
    public static final String PML_STATE_ASSIGN = "stateA1 =";
    public static final String PML_STATE_DEFINITION = "stateA1 == ";
    public static final String PML_PROCTYPE_DEFINITION = "proctype Model()";
    public static final String PML_A1_CALL = "A1();";
    public static final String PML_INIT = "init";
    public static final String PML_RUN_MODEL = "run Model();";
    public static final String PML_BREAK = "break;";
    public static final String PML_PRINTF = "printf";

    public static final String PML_VARS_DEFINITION = "int stateA1;\nint lastEvent;\n";
}
