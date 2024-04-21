package cinema;

import java.util.ArrayList;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/cinema")
public class CinemaEndpoint {
	static Cinema cinema = new Cinema();
	static ArrayList<Session> sessions = new ArrayList<>();

	@OnOpen
	public void open(Session session) {
		sessions.add(session);
	}
	
	@OnClose
	public void close(Session session) {
		sessions.remove(session);
	}
	
	@OnError
	public void error(Throwable t) {
		System.out.println("WebSocket error: " + t.getMessage());
	}
	
	@OnMessage
	public String message(String msg) {
		if (msg.equals("4")) {
			return "Hello: "+msg;
		}
		else {
			return "ERROR";
		}
		//return "Hello: "+msg;
	}
	
}
