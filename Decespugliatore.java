
public class Decespugliatore extends Macchine {

	private Boolean EnegineType;

	public Decespugliatore( 
							boolean EnegineType,
							String marca,
							int id ) {
		
		super(marca, id);
		this.EnegineType = EnegineType;
		
	}

}
