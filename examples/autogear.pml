int stateA1;
int lastEvent;

inline A1(){
	stateA1 = 1;
	do
		:: (stateA1 == 1) ->
			printf("main\n");
			if 
				:: stateA1 = 2;
				lastEvent = 1;
			fi;
		:: (stateA1 == 2) ->
			printf("SLEEP\n");
			if
				:: stateA1 = 3;
				lastEvent = 2;
			fi;	
		:: (stateA1 == 3) ->
			printf("NEUTRAL\n");
			if
				:: stateA1 = 4;
				lastEvent = 4;
				:: stateA1 =  5;
				lastEvent = 6;
				:: stateA1 = 10;
				lastEvent = 3;
			fi;
		:: (stateA1 == 4) ->
			printf("REVERSE\n");
			if
				:: stateA1 = 3;
				lastEvent = 5;
			fi;
		:: (stateA1 == 5) ->
			printf("GEAR1\n");
			if 
				::stateA1 = 6;
				lastEvent = 8;
				::stateA1 = 3;
				lastEvent = 7;
			fi;
		:: (stateA1 == 6) ->
			printf("GEAR2\n");
			if
				::stateA1 = 7;
				lastEvent = 10;
				::stateA1 = 5;
				lastEvent = 9;
			fi;
		:: (stateA1 == 7) ->
			printf("GEAR3\n");
			if
				::stateA1 = 8;
				lastEvent = 12;
				::stateA1 = 6;
				lastEvent = 11;
			fi;
		:: (stateA1 == 8) ->
			printf("GEAR4\n");
			if
				::stateA1 = 9;
				lastEvent = 14;
				::stateA2 = 7;
				lastEvent = 13;
			fi;
		:: (stateA1 == 9) ->
			printf("GEAR5\n");
			if
				::stateA1 = 8;
				lastEvent = 15;
			fi;
		:: (stateA1 == 10) ->
			printf("FINISH WORK\n");
			break;
	od;
}

proctype Model(){
	A1();
}

init {
	run Model();
}

never  {    /* !(<>{stateA1==10}) */
accept_init:
T0_init:
	if
	:: (! ((stateA1==10))) -> goto T0_init
	fi;
}
