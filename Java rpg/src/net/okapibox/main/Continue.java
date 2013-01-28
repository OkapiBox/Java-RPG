package net.okapibox.main;

public class Continue {
	public static void begin(){
		ActionHandler.action();
		begin();
	}
}
