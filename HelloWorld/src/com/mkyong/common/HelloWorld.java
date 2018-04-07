package com.mkyong.common;

public class HelloWorld {
	
	private printMessage message;
	


		
		private String name;

		public void setMessage(printMessage message) {
		this.message = message;
	}

		public void setName(String name) {
			this.name = name;
		}

		public void printHello() {
			System.out.println("Hello ! " + name);
		}
		
		public void printMessage() {
			
			System.out.println(message.getWelcomeMessage());
		}
		
		



}
