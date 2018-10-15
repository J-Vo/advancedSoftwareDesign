package lab5;

public class PieceWorker extends Employee {
	
	private double wage;
	private int pieces;

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(wage < 0) {
			throw new IllegalArgumentException("Invalid wage.");
		}
		this.wage = wage;
	}

	public int getPieces() {
		
		return pieces;
	}

	public void setPieces(int pieces) {
		if(pieces < 0) {
			throw new IllegalArgumentException("Invalid number of pieces");
		}
		this.pieces = pieces;
	}

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		
		this.wage = wage;
		this.pieces = pieces;
	}

	@Override
	public double earnings() {
		
		return getWage() * getPieces();
	}
	   @Override                                                             
	   public String toString() {                                            
	      return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,d", 
	         super.toString(), "hourly wage", getWage(),                     
	         "pieces made", getPieces());                                    
	   }     

		
}
