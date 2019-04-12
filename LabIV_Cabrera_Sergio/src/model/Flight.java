package model;

public class Flight {
	private String hour;
	private boolean morning;
	private String airline;
	private int id;
	private String destination;
	private char terminal;
	private int gate;
	private String remark;
	
	public Flight(String h, boolean m, String a, int i, String d, char t, int g, String r) {
		hour = h;
		morning = m;
		airline = a;
		id = i;
		destination = d;
		terminal = t;
		gate = g;
		remark = r;
	}

	public String getAirline() {
		return airline;
	}

	public String getHour() {
		return hour;
	}

	public boolean isMorning() {
		return morning;
	}

	public int getId() {
		return id;
	}

	public String getDestination() {
		return destination;
	}

	public char getTerminal() {
		return terminal;
	}

	public int getGate() {
		return gate;
	}

	public String getRemark() {
		return remark;
	}
	
}
