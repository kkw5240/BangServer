import java.io.Serializable;

import ocsf.server.ConnectionToClient;

public class Player implements Serializable{
	String id;
	int hp;
	ConnectionToClient c;
	public Player(ConnectionToClient c) {
		this.c = c;
	}
	String getId(){
		return id;
	}
	void setId(String id){
		this.id = id;
	}
	int getHp(){
		return hp;
	}
	void setHp(int hp){
		this.hp = hp;
	}
	void hp_up(){
		hp++;
	}
	void hp_down(){
		hp--;
	}
}
