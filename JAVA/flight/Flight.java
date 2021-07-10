package flight;

class Passenger {
	
	private String name;
	
	private String destination;
	
	private String status;

	public Passenger(String name, String destination, String status) {
		super();
		this.name = name;
		this.destination = destination;
		this.status = status;
	}
	
	
}


 class Flight {

	private Passenger passenger;
    
	private String destination;
	
	private int duration;
	
	private static int id=0;

	public Flight(Passenger passenger, String destination, int duration) {
		super();
		this.passenger = passenger;
		this.destination = destination;
		this.duration = duration;
		this.id+=1;
	}
	
	

}
