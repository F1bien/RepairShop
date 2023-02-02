
import java.util.*;

public class Macchine {

	private ArrayList<Lavorazione> lavrazioni; 

	protected int id;
	protected String marca;
	protected double price = 0;
	
	public Macchine( 
					String marca,
					int id ) {

		this.marca = marca;
		this.id = id;
		
	}
	
	public void Calc_Price () {

		double sum = 0;

		for ( Lavorazione i : lavrazioni ) {

			sum += i.get_price();

		}

		this.price = sum;
	}

	// GET & SET

	public int get_id () {
		return this.id;
	}
	
	

}
