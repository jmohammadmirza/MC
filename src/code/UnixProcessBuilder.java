/**
 * 
 */
package com.something.eight;

import java.util.Map;

/**
 * @author mjaved
 *
 */
public class UnixProcessBuilder {


	public UnixProcessBuilder() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UnixProcessBuilder unixProcessBuilder= new UnixProcessBuilder();
		//unixProcessBuilder.executeUnixProcess("ls -ltr");
		test();
	}  
	 public static void test(){
		 Map<String, String> envmap=CommonUtils.getEnvVariableMap();
		 System.out.println(envmap.get("PUBLIC"));
	 }
	 
	/**
	 * method to execute unix process
	 * accepts arguments
	 * returns int
	 */
	public int executeUnixProcess(String... arguments){
		ProcessBuilder  processBuilder=null;
		int executionResult=-1;
		try {
			Process process=processBuilder.start();
			process.waitFor();
			executionResult=process.exitValue();

		}catch(Exception e){
			System.err.print("Failed to execute error"+e);
		}

		return executionResult;

	}
}
