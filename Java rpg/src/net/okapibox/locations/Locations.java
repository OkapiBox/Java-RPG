package net.okapibox.locations;

public class Locations {
	public static boolean watersource;
	public static boolean foodsource;
	public static boolean monster;
	
	public static void loca(int x, int y){
		if(x == 1 && y == 1){
			
		}else if(x == 1 && y == 2){
			watersource = true;
			foodsource = true;
			monster = false;
		}else if(x == 1 && y == 3){
			watersource = false;
			foodsource = true;
			monster = true;
		}else if(x == 1 && y == 4){
			watersource = false;
			foodsource = true;
			monster = false;
		}else if(x == 1 && y == 5){
			watersource = true;
			foodsource = false;
			monster = true;
		}else if(x == 2 && y == 1){
			watersource = true;
			foodsource = false;
			monster = true;
		}else if(x == 2 && y == 2){
			watersource = true;
			foodsource = true;
			monster = false;
		}else if(x == 2 && y == 3){
			watersource = false;
			foodsource = true;
			monster = false;
		}else if(x == 2 && y == 4){
			watersource = true;
			foodsource = true;
			monster = false;
		}else if(x == 2 && y == 5){
			watersource = true;
			foodsource = false;
			monster = true;
		}else if(x == 3 && y == 1){
			watersource = false;
			foodsource = true;
			monster = true;
		}else if(x == 3 && y == 2){
			watersource = true;
			foodsource = true;
			monster = false;
		}else if(x == 3 && y == 3){
			watersource = false;
			foodsource = true;
			monster = false;
		}else if(x == 3 && y == 4){
			watersource = true;
			foodsource = false;
			monster = false;
		}else if(x == 3 && y == 5){
			watersource = false;
			foodsource = false;
			monster = true;
		}else if(x == 4 && y == 1){
			watersource = true;
			foodsource = true;
			monster = false;
		}else if(x == 4 && y == 2){
			watersource = false;
			foodsource = true;
			monster = false;
		}else if(x == 4 && y == 3){
			watersource = true;
			foodsource = false;
			monster = true;
		}else if(x == 4 && y == 4){
			watersource = true;
			foodsource = true;
			monster = false;
		}else if(x == 4 && y == 5){
			watersource = false;
			foodsource = true;
			monster = true;
		}else if(x == 5 && y == 1){
			watersource = false;
			foodsource = false;
			monster = false;
		}else if(x == 5 && y == 2){
			watersource = true;
			foodsource = false;
			monster = true;
		}else if(x == 5 && y == 3){
			watersource = false;
			foodsource = false;
			monster = false;
		}else if(x == 5 && y == 4){
			watersource = true;
			foodsource = false;
			monster = true;
		}else if(x == 5 && y == 5){
			watersource = true;
			foodsource = true;
			monster = true;
		}
	}
}
