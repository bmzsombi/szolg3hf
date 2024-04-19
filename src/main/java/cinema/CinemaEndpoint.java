package cinema;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/cinema")
public class CinemaEndpoint {

	@OnOpen
	public void open(Session session) {
		System.out.println("WebSocket opened: " + session.getId());
	}
	
	@OnClose
	public void close(Session session) {
		System.out.println("WebSocket closed: " + session.getId());
	}
	
	@OnError
	public void error(Throwable t) {
		System.out.println("WebSocket error: " + t.getMessage());
	}
	
	@OnMessage
	public String message(String msg) {
		System.out.println("WebSocket message: " + msg);
		return "Hello: "+msg;
	}
	
}
