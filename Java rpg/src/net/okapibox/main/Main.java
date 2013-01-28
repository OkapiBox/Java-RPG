package net.okapibox.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String play = "";
		
		System.out.println("Welcome to Truffle's RPG.");
		System.out.println("Made by Truffle and Okapibox");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Enter 'play' to start!");
		play = sc.nextLine();
		if(play.equalsIgnoreCase("play")){
			System.out.println("Game started!");
			Begin.begin();
		}else{
			System.out.println("Please re-enter. You didn't say play!");
			main(args);
		}
	}
}
