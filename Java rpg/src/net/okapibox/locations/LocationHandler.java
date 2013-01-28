package net.okapibox.locations;

import java.util.Random;

import net.okapibox.main.Continue;
import net.okapibox.main.PlayerInfo;

public class LocationHandler {
	public static String enemy;
	public static void handleLoc(){
		Random r = new Random();
		Locations.loca(PlayerInfo.x, PlayerInfo.y);
		int monster = r.nextInt(4);
		if(monster == 0){
			enemy = "Troll";
		}else if(monster == 1){
			enemy = "Tainted Giraffe";
		}else if(monster == 2){
			enemy = "Evil Sheep";
		}else if(monster == 3){
			enemy = "Honey Badger";
		}
		if(Locations.foodsource == true && Locations.watersource  == true && Locations.monster == true){
			System.out.println("You are in a lush grove with banana trees and a stream nearby.");
			System.out.println("Sadly, an evil " + enemy + " blocks your path.");
		}else if(Locations.foodsource == false && Locations.watersource  == true && Locations.monster == true){
			System.out.println("You are next to a river in a clearing.");
			System.out.println("Sadly, a fishmonster blocks your path.");
		}else if(Locations.foodsource == false && Locations.watersource  == false && Locations.monster == true){
			System.out.println("You are in the middle of a field.");
			System.out.println("Sadly, a " + enemy + " blocks your path.");
		}else if(Locations.foodsource == true && Locations.watersource  == true && Locations.monster == false){
			System.out.println("You are in a river full of easily caught fish.");
		}else if(Locations.foodsource == true && Locations.watersource  == false && Locations.monster == false){
			System.out.println("You are in some water-less hills, but food is plentiful.");
		}else if(Locations.foodsource == false && Locations.watersource  == true && Locations.monster == false){
			System.out.println("You are in a river. No fishmonsters will attack.");
		}else if(Locations.foodsource == false && Locations.watersource  == false && Locations.monster == false){
			System.out.println("You are in the middle of nowhere. All is safe, but ");
			System.out.println("there is no food or water.");
		}else if(Locations.foodsource == true && Locations.watersource  == false && Locations.monster == true){
			System.out.println("You see a tree with tons of fruit, but ");
			System.out.println("a " + enemy + " blocks your path.");
		}
		Continue.begin();
	}
}
