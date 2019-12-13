
public class Taxi {
	private int x = 0; 
	private int y = 0; 
	private String name = null; 
	private int dest_x, dest_y;
	private String ride; 
	

	public void run (String ride) {
		this.ride = ride; 

		for (int p = 0; p<ride.length(); p++) {
		char c = ride.charAt(p);
		
		if (c=='l') {
			x--;
				
		}
		else if (c=='d') {
			y--; 
		}
	
	}
	
	public void book (int x, int y) {
		this.dest_x = x;
		this.dest_y = y; 
	}
	
	public void reachedDestination(int x, int y) {
		this.dest_x = x; 
		this.dest_y = y; 
	}
	
	public void printCurrentdestination() {
		System.out.println(x + " " + y);
	
	}
}
	
	
	public Taxi (String Taxi) {
		this.name = Taxi ; 
	
	}
	
}
