package com.something.eight;

import java.util.HashMap;
import java.util.Map;

public class  CommonUtils {

	public static Map<String,String> envVariableMap;
	
	static {
			setEnvVariableMap();
	}

	public static Map<String, String> getEnvVariableMap() {
		return envVariableMap;
	}

	public static void setEnvVariableMap() {
		Map<String,String> envVarMap=new HashMap<String,String>();

		for(Map.Entry<String, String> entry: System.getenv().entrySet()){

			System.out.println("syout key "+entry.getKey()+" value "+entry.getValue());

			envVarMap.put(entry.getKey(), entry.getValue());

		}
		if(envVarMap==null|| envVarMap.size()<=0){
			throw new RuntimeException(" System variable not found");
		}
		envVariableMap=envVarMap;

	}

}
