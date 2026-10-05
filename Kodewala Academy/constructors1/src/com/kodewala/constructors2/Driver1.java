package com.kodewala.constructors2;

//24.09.2026
public class Driver1 {

	public static void main(String[] args) {

		NotificationService ntf = new NotificationService();
		ntf.sendNotification("sms");
		ntf.sendNotification("email");
		ntf.sendNotification("whatsapp");

	}

}
