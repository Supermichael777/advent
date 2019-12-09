package advent;

import java.util.ArrayList;

public class Computer {

public static void main(String[] args){
		Computer com1 = new Computer("1102,34463338,34463338,63,1007,63,34463338,63,1005,63,53,1101,3,0,1000,109,988,209,12,9,1000,209,6,209,3,203,0,1008,1000,1,63,1005,63,65,1008,1000,2,63,1005,63,904,1008,1000,0,63,1005,63,58,4,25,104,0,99,4,0,104,0,99,4,17,104,0,99,0,0,1102,1,31,1018,1102,352,1,1023,1101,0,1,1021,1101,0,33,1003,1102,1,36,1007,1102,21,1,1005,1101,359,0,1022,1101,0,787,1024,1102,1,24,1011,1101,30,0,1014,1101,22,0,1016,1101,0,0,1020,1102,1,29,1000,1101,778,0,1025,1102,23,1,1017,1102,1,28,1002,1101,38,0,1019,1102,1,27,1013,1102,1,32,1012,1101,0,37,1006,1101,444,0,1027,1102,1,20,1009,1101,0,447,1026,1101,0,39,1008,1101,35,0,1010,1102,559,1,1028,1102,26,1,1004,1102,1,25,1015,1102,1,34,1001,1101,0,554,1029,109,-3,2101,0,9,63,1008,63,34,63,1005,63,205,1001,64,1,64,1105,1,207,4,187,1002,64,2,64,109,23,21107,40,39,-7,1005,1013,227,1001,64,1,64,1106,0,229,4,213,1002,64,2,64,109,-17,1202,-2,1,63,1008,63,36,63,1005,63,249,1106,0,255,4,235,1001,64,1,64,1002,64,2,64,109,-6,1202,10,1,63,1008,63,36,63,1005,63,277,4,261,1106,0,281,1001,64,1,64,1002,64,2,64,109,-2,1208,9,26,63,1005,63,303,4,287,1001,64,1,64,1106,0,303,1002,64,2,64,109,32,1206,-7,321,4,309,1001,64,1,64,1106,0,321,1002,64,2,64,109,-29,1207,7,20,63,1005,63,337,1105,1,343,4,327,1001,64,1,64,1002,64,2,64,109,27,2105,1,-2,1001,64,1,64,1106,0,361,4,349,1002,64,2,64,109,-25,2108,39,7,63,1005,63,377,1106,0,383,4,367,1001,64,1,64,1002,64,2,64,109,1,1201,6,0,63,1008,63,36,63,1005,63,409,4,389,1001,64,1,64,1105,1,409,1002,64,2,64,109,1,2102,1,1,63,1008,63,33,63,1005,63,435,4,415,1001,64,1,64,1105,1,435,1002,64,2,64,109,28,2106,0,-3,1106,0,453,4,441,1001,64,1,64,1002,64,2,64,109,-13,21101,41,0,1,1008,1018,44,63,1005,63,477,1001,64,1,64,1106,0,479,4,459,1002,64,2,64,109,4,21108,42,42,-2,1005,1019,501,4,485,1001,64,1,64,1106,0,501,1002,64,2,64,109,-21,2101,0,2,63,1008,63,28,63,1005,63,523,4,507,1105,1,527,1001,64,1,64,1002,64,2,64,109,26,1205,-5,545,4,533,1001,64,1,64,1105,1,545,1002,64,2,64,109,3,2106,0,-1,4,551,1106,0,563,1001,64,1,64,1002,64,2,64,109,-33,1201,4,0,63,1008,63,28,63,1005,63,583,1105,1,589,4,569,1001,64,1,64,1002,64,2,64,109,11,2107,27,-3,63,1005,63,609,1001,64,1,64,1106,0,611,4,595,1002,64,2,64,109,8,21102,43,1,3,1008,1018,43,63,1005,63,637,4,617,1001,64,1,64,1105,1,637,1002,64,2,64,109,-5,21108,44,41,0,1005,1010,653,1105,1,659,4,643,1001,64,1,64,1002,64,2,64,109,-13,2108,21,8,63,1005,63,681,4,665,1001,64,1,64,1106,0,681,1002,64,2,64,109,6,1207,0,34,63,1005,63,703,4,687,1001,64,1,64,1105,1,703,1002,64,2,64,109,7,1208,-7,35,63,1005,63,723,1001,64,1,64,1106,0,725,4,709,1002,64,2,64,109,-13,2102,1,7,63,1008,63,23,63,1005,63,745,1105,1,751,4,731,1001,64,1,64,1002,64,2,64,109,13,1205,10,767,1001,64,1,64,1105,1,769,4,757,1002,64,2,64,109,14,2105,1,0,4,775,1001,64,1,64,1106,0,787,1002,64,2,64,109,-20,21107,45,46,7,1005,1011,809,4,793,1001,64,1,64,1105,1,809,1002,64,2,64,109,-3,2107,25,3,63,1005,63,827,4,815,1106,0,831,1001,64,1,64,1002,64,2,64,109,13,1206,7,847,1001,64,1,64,1106,0,849,4,837,1002,64,2,64,109,-11,21101,46,0,7,1008,1010,46,63,1005,63,871,4,855,1106,0,875,1001,64,1,64,1002,64,2,64,109,15,21102,47,1,-4,1008,1014,48,63,1005,63,895,1106,0,901,4,881,1001,64,1,64,4,64,99,21102,27,1,1,21101,0,915,0,1106,0,922,21201,1,63208,1,204,1,99,109,3,1207,-2,3,63,1005,63,964,21201,-2,-1,1,21102,1,942,0,1106,0,922,21202,1,1,-1,21201,-2,-3,1,21101,957,0,0,1105,1,922,22201,1,-1,-2,1106,0,968,21201,-2,0,-2,109,-3,2106,0,0");
		com1.run();
		com1.setInput((long) 1);
		System.out.println(com1.getOutput());
	}

	private boolean halt = false;
	private int currentIndex = 0;
	private long indexIterate = 4;
	private long baseoffset = 0;
	private ArrayList<Long> Program;
	private long outBuffer;
	
	Computer(String inputProgram){
		Program = new ArrayList<Long>(100000000);
		
		String[] inputholder = inputProgram.split(",");
		//breaks the inputProgram String into a usable format
		for(int i = 0; i<=100000000; i++){
			Program.add(i, (long) 0);
		}
		for(int i = 0; i < inputholder.length ; i++) {
			Program.set(i, Long.parseLong(inputholder[i]));
		}
	}
	
	void run() throws NumberFormatException{
		
		while(!halt) {
			long value1;
			long value2;
			int target;
			String paramMode= "000"+Program.get(currentIndex);
			int opcode = Integer.parseInt(paramMode.substring(paramMode.length()-2));
			System.out.println("now: "+currentIndex+" "+paramMode);
			switch(opcode) {			//tells program to add
			case 1: 
				value1 = setMode(paramMode, 1);
				value2 = setMode(paramMode, 2);
				target = setTarget(paramMode, 3);
				
				Program.set(target, new Long(value1+value2)); 
				
				indexIterate = 4;
				break;
			case 2:	//tells program to multiply
				value1 = setMode(paramMode, 1);
				value2 = setMode(paramMode, 2);
				target = setTarget(paramMode, 3);
				
				Program.set(target, new Long(value1*value2));
				
				indexIterate = 4;
			 	break;
			case 3:	//tells program to effectivly wait and take input
				return;
				/*
				See: setInput() @168
			 	*/
			case 4:	//tells program to set output
				value1 = setMode(paramMode, 1);

				outBuffer = value1;
				//for non waiting (multi-output)
				System.out.println(outBuffer);
			 	indexIterate = 2;
			 	break;
			case 5:
				value1 = setMode(paramMode, 1);
				value2 = setMode(paramMode, 2);
				
				if(!(value1 == 0)){
					currentIndex = new Long(value2).intValue();
					indexIterate = 0;
					break;
				}
				
				indexIterate = 3;
				break;
			case 6:
				value1 = setMode(paramMode, 1);
				value2 = setMode(paramMode, 2);
				
				if((value1 == 0)){
					currentIndex = new Long(value2).intValue();
					indexIterate = 0;
					break;
				}
				
				indexIterate = 3;
				break;
			case 7:
				value1 = setMode(paramMode, 1);
				value2 = setMode(paramMode, 2);
				target = setTarget(paramMode, 3);
				
				if((value1 < value2)){
					Program.set(target, (long) 1);
				}else{
					Program.set(target, (long) 0);
				}
				
				indexIterate = 4;
				break;
			case 8:
				value1 = setMode(paramMode, 1);
				value2 = setMode(paramMode, 2);
				target = setTarget(paramMode, 3);
				
				if((value1 == value2)){
					Program.set(target, (long) 1);
				}else{
					Program.set(target, (long) 0);
				}
				
				indexIterate = 4;
				break;
			case 9:
				baseoffset += setMode(paramMode, 1);
				indexIterate = 2;
				break;
			case 99:    //ends the program 'cleanly'
				halt = true;
				break;
			default://tells you about the mistake in your code, or that the combination never reaches the end state, probably should throw an error
				System.out.print("Operator invalid: " + currentIndex + ", value index 0: "+Program.get(0).intValue());
				halt = true;  //if you got an opcode wrong you don't know what your doing and your results are garbage anyway
			}
			currentIndex+=indexIterate;
		}
		return;
	}
	private Long setMode(String paramMode, int offset){
		switch(paramMode.charAt(paramMode.length()-(offset+2))) {
		case '0':
			return Program.get(Program.get(currentIndex+offset).intValue());
		case '1':
			return Program.get(currentIndex+offset);
		case '2':
			return Program.get(new Long(Program.get(new Long(currentIndex+offset).intValue())+baseoffset).intValue());
		default:
			System.out.println("Bad opcode mode switch: "+paramMode+" at "+ (currentIndex+offset));
			halt = true;
			return (long) 0;
		}
	}
	private int setTarget(String paramMode, int offset){
		switch(paramMode.charAt(paramMode.length()-(offset+2))) {
		case '0':
		case '1':
			return Program.get(currentIndex+offset).intValue();
		case '2':
			
			return new Long(Program.get(new Long(currentIndex+offset).intValue())+baseoffset).intValue();
		default:
			System.out.println("Bad opcode mode switch: "+paramMode+" at "+ (currentIndex+offset));
			halt = true;
			return 0;
		}
	}
	void setInput(long currentInput){
		int target = new Long(setTarget(("000"+Program.get(currentIndex)), 1)).intValue();
		Program.set(target, currentInput); //make sure to take proper inputs from the needed input source
		currentIndex+=2;
		try {
			run();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	long getOutput() {
		return outBuffer;
	}
	boolean isHalt() {
		return halt;
	}
}
