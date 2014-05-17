import java.io.Serializable;


public class Message implements Serializable{
	int room;
	Player to;
	int what;
	Player from;
	Object o;
}
