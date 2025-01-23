package Encapsulation;

class MovieTicket
{
	//instance variables
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;
	
	
	//constructor
	 
	public MovieTicket(int movieId, int noOfSeats)
	{
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
		switch(movieId)
		{
			case 111:
				this.costPerTicket = 7;
				break;
			case 112:
				this.costPerTicket = 8;
				break;
			case 113:
				this.costPerTicket = 8.5;
			default:
				this.costPerTicket = 0;
		}
	}
	
	public double calculateTotalAmount()
	{
		double tax = 0;
		double totalCost = noOfSeats * costPerTicket;
			tax = (totalCost * 2) /100;
		return Math.round(totalCost + tax);		
		
	}
	
	//setters and getters
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getMovieId()
	{
		return this.movieId;
	}
	
	public void seNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getNoOfSeats()
	{
		return this.noOfSeats;
	}
	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}
	public double getCostPerTicket()
	{
		return this.costPerTicket;
	}
}

public class MovieTicketTester {

	public static void main(String[] args) {

		MovieTicket movieTicket = new MovieTicket(114, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
		
	

}
