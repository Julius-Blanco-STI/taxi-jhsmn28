
public class Main {

	public static void main (String[]args) {
		Taxi x = new Taxi ("LUV143");
		x.run("I will go to Makati"); 
		x.printCurrentdestination();
			//x:  , y: 
		x.book (10,10); 
		x.run("I am leaving on a jet Plane");
		//x.reachedDestination(); 
	}
}
