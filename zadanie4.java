package com.company;

public class Zadanie4{
	public static void main(){
		public int slow = 1;
		public int medium = 2;
		public int fast = 3;
		public float speed = 180;
		public boolean if_wlaczony = false;
		public int radius = 30;
		public string color = "bialy";

		wiatriak wiatriak1 = new wiatriak(medium, speed, if_wlaczony, radius, color);
		
		wiatriak wiatriak2 = new wiatriak(medium, speed, if_wlaczony, radius, color);

		wiatriak1.info();
		wiatriak2.info();
		
	}
}