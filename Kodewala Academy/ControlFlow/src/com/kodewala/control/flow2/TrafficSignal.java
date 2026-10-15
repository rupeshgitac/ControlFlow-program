package com.kodewala.control.flow2;

public class TrafficSignal {

	public static void main(String[] args) {

		TrafficSignal trafficSignal = new TrafficSignal();
		
		trafficSignal.checkSignal(3);
	}

	public void checkSignal(int signal) {

		switch (signal) {

		case 1:
			System.out.println("Red - Stop");
			break;
		case 2:
			System.out.println("Yellow - Wait");
			break;
		case 3:
			System.out.println("Green - Go");
			break;
		default:
			System.out.println("Invalid signal");
			break;

		}
	}

}
