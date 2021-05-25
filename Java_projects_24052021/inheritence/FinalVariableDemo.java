package com.onebill.corejava.inheritence;

class ErrorMsg {
	final int OUTERR = 0; //Reassigning to the variable will cause error
	final int INERR = 1;
	final int DISKERR =2;
	final  int INDEXERR = 3;
	
	String[] msgs = {"OUTERR","INEER","DISKERR","INDEXERR"};
	String getErrorMsg(int i) {
		if(i>=0 & i<msgs.length)
			return msgs[i];
			else
				return "Invalid";
	}
}
	

public class FinalVariableDemo {
	public static void main(String[] args) {
		ErrorMsg errorMsg = new ErrorMsg();
		System.out.println(errorMsg.getErrorMsg(errorMsg.DISKERR));
	}
}
		