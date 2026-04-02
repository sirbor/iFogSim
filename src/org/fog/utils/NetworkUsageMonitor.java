package org.fog.utils;

public class NetworkUsageMonitor {

	private static double networkUsage = 0.0;
	private static double totalDataTransferred = 0.0;
	
	public static void sendingTuple(double latency, double tupleNwSize){
		networkUsage += latency*tupleNwSize;
		totalDataTransferred += tupleNwSize;
	}
	
	public static void sendingModule(double latency, long moduleSize){
		networkUsage += latency*moduleSize;
		totalDataTransferred += moduleSize;
	}
	
	public static double getNetworkUsage(){
		return networkUsage;
	}
	
	public static double getTotalDataTransferred(){
		return totalDataTransferred;
	}
	
	public static void reset(){
		networkUsage = 0.0;
		totalDataTransferred = 0.0;
	}
}
