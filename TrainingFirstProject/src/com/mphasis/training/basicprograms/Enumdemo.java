package com.mphasis.training.basicprograms;
enum TrafficSignal{
		RED("STOP"), ORANGE("READY"), GREEN("GO");
	private String value;
		 TrafficSignal(String value){
			 this.value=value;	
		}
		public String getValue() {
			return value;
		} 
}
public class Enumdemo {
	public static void main(String[] args) {
		
		for(TrafficSignal s:TrafficSignal.values()) {
			System.out.println(s+" "+s.getValue()+" "+s.ordinal());
		}
		
	}

}
