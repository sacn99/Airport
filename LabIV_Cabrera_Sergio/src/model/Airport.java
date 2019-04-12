package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Airport {
	private List<Flight> flights;
	private Random r = new Random();
	public Airport() {
		flights = new ArrayList<Flight>();
	}

	public String randomHour() {
		String msg = "";
		int hour[] = new int[4];
		hour[1] = r.nextInt(2);
		hour[2] = hour[1]==0? r.nextInt(10): r.nextInt(3);
		hour[3] = r.nextInt(6);
		hour[4] = r.nextInt(10);
		 msg = hour[1]+hour[2]+":"+hour[3]+hour[4];
		return msg;
	}

	public boolean randomDayPart() {
		return r.nextBoolean();
	}

	public String randomDestination() {
		String locations[] = {"Madrid", "Barcelona", "Medellin", "Cali", "Bogota", "San Sebastian"};
		return locations[r.nextInt(locations.length)];
	}

	public char randomTerminal() {
		return (char) (65+r.nextInt(90-64));
	}

	public int randomGate() {
		return r.nextInt(100);
	}

	public String randomRemark() {
		String remarks[] = {"CANCELLED", "ON TIME", "BOARDING", "DELAYED"};
		return remarks[r.nextInt(remarks.length)];
	}
	public int randomId() {
			int start = 0;
			if(flights != null) {
				start = flights.size()+1;
			}
			return start;
	}
	
	public String randomAirline() {
		String airlines[] = {"Avianca", "Iberia", "SpaceX", "Betnia"};
		return airlines[r.nextInt(airlines.length)];
	}
	public void addFlight(String h, boolean m, String a,int i, String d, char t, int g, String r) {
		flights.add(new Flight(h, m, a, i, d, t, g, r));
	}
}
