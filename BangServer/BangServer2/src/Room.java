import java.io.Serializable;
import java.util.ArrayList;

import ocsf.server.AbstractServer;


public class Room implements Serializable{
	ArrayList<Player> players;
	int number;
	AbstractServer server;
	String title;
	
	public Room(int number,String title,AbstractServer server) {
		this.number = number;
		this.server = server;
		this.title = title;
	}
	int getMan(){
		return players.size();
	}
	int getNumber(){
		return number;
	}
	protected void handleMessageFromClient(Message m) {
		Thread t = new Thread(new HandleRoom(this,m));
		t.start();
	}
}
