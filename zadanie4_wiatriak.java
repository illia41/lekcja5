package com.company;

public class Wiatriak{
	wiatriak(medium, speed, if_wlaczony, radius, color)
	{
		this.medium = medium;
		this.speed = speed;
		this.if_wlaczony = if_wlaczony;
		this.radius = radius;
		this.color = color;
	}
	void info()
	{
		System.out.println("tryb" + medium + "predkosc" + speed + "wlaczony"+ if_wlaczony + "wielkosc skrzydla" + radius + "kolor" + color);
	}
}