package net.okapibox.main;

import java.util.Scanner;

import net.okapibox.locations.LocationHandler;
import net.okapibox.locations.Locations;

public class Move {
	public static void move(){
		Scanner sc = new Scanner(System.in);
		System.out.println("What direction?");
		String dir = sc.nextLine();
		
		if(dir.equalsIgnoreCase("east")){
			if(PlayerInfo.x < 5){
				System.out.println("You moved East.");
				++PlayerInfo.x;
				Locations.loca(PlayerInfo.x, PlayerInfo.y);
				LocationHandler.handleLoc();
			}else{
				System.out.println("A giant cliff blocks your path.");
			}
		}else if(dir.equalsIgnoreCase("north")){
			if(PlayerInfo.y < 5){
				System.out.println("You moved North.");
				++PlayerInfo.y;
				Locations.loca(PlayerInfo.x, PlayerInfo.y);
				LocationHandler.handleLoc();
			}else{
				System.out.println("A giant cliff blocks your path.");
			}
		}else if(dir.equalsIgnoreCase("south")){
			if(PlayerInfo.y > 1){
				System.out.println("You moved South.");
				--PlayerInfo.y;
				Locations.loca(PlayerInfo.x, PlayerInfo.y);
				LocationHandler.handleLoc();
			}else{
				System.out.println("A giant cliff blocks your path.");
			}
		}else if(dir.equalsIgnoreCase("west")){
			if(PlayerInfo.x > 1){
				System.out.println("You moved West.");
				--PlayerInfo.x;
				Locations.loca(PlayerInfo.x, PlayerInfo.y);
				LocationHandler.handleLoc();
			}else{
				System.out.println("A giant cliff blocks your path.");
			}
		}else{
			System.out.println(dir + "Is not a direction! Try North, South, East, or West.");
		}
	}
}
