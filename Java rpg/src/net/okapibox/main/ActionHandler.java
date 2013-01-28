package net.okapibox.main;

import java.util.Scanner;

public class ActionHandler {
	public static void action(){
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you like to do?");
		String act = sc.nextLine();
		
		if(act.equalsIgnoreCase("move") || act.equalsIgnoreCase("go") || act.equalsIgnoreCase("travel") || act.equalsIgnoreCase("run") || act.equalsIgnoreCase("walk")){
			Move.move();
		}else if(act.equalsIgnoreCase("attack") || act.equalsIgnoreCase("fight") || act.equalsIgnoreCase("hit") || act.equalsIgnoreCase("bash") || act.equalsIgnoreCase("bonk") || act.equalsIgnoreCase("slap")){
			Attack.attack();
		}else if(act.equalsIgnoreCase("eat") || act.equalsIgnoreCase("munch") || act.equalsIgnoreCase("bite") || act.equalsIgnoreCase("chomp") || act.equalsIgnoreCase("devour")){
			Eat.eat();
		}else if(act.equalsIgnoreCase("rest") || act.equalsIgnoreCase("sleep") || act.equalsIgnoreCase("nap") || act.equalsIgnoreCase("heal") || act.equalsIgnoreCase("reinvigorate")){
			Rest.rest();
		}else if(act.equalsIgnoreCase("slurp") || act.equalsIgnoreCase("drink") || act.equalsIgnoreCase("gulp") || act.equalsIgnoreCase("sip") || act.equalsIgnoreCase("siphon")){
		Rest.rest();
	}else{
			System.out.println("Invalid action. Try again!");
			action();
		}
	}
}
