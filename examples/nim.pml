int stateA1;
int lastEvent;

inline A1(){
	stateA1 = 1;
	do
		:: (stateA1 == 1) ->
			printf("init\n");
			if
				:: stateA1 = 2;
				lastEvent = 1;
			fi;
		:: (stateA1 == 2) ->
			printf("main\n");
			if 
				:: stateA1 = 3;
				lastEvent = 2;
				:: stateA1 = 4;
				lastEvent = 3;
			fi;
		:: (stateA1 == 3) ->
			printf("First player's turn\n");
			if
				:: stateA1 = 5;
				lastEvent = 6;
				:: stateA1 = 2;
				lastEvent = 4;
			fi;
		:: (stateA1 == 4) ->
			printf("Second player' turn\n");
			if
				:: stateA1 = 6;
				lastEvent = 7;
				:: stateA1 = 2;
				lastEvent = 5;
			fi;
		:: (stateA1 == 5) ->
			printf("First player won!\n");
			printf("END GAME\n");
			break;
		:: (stateA1 == 6) ->
			printf("Second player won!\n");
			printf("END GAME\n");
			break;
	od;
}

proctype Model(){
	A1();
}

init {
	run Model();
}

never  {    /* !(<>{stateA1 != 5}||{stateA1 != 6}) */
accept_init:
T0_init:
	if
	:: (! ((stateA1 != 5)) && ! ((stateA1 != 6))) -> goto accept_S3
	fi;
accept_S3:
T0_S3:
	if
	:: (! ((stateA1 != 5))) -> goto accept_S3
	fi;
}
