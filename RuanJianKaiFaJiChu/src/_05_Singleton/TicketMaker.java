package _05_Singleton;

/**
 * 
 * @author songzy
 *
 */
public class TicketMaker {
	private static TicketMaker tm = new TicketMaker();
	private int ticket = 100;

	private TicketMaker() {

	}
	public static TicketMaker getInstance(){
		return tm;
	}

	public void getTicketNumber() {
		System.out.println(tm.ticket++);
	}
}
