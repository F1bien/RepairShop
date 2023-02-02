
import java.util.*;

public class Aggiusteria {

    private ArrayList<Macchine> Posti; 
    private int num_posti; // posti liberi

    private int id_ordine;

    public Aggiusteria() {





	
    }


    public void add_work ( 
                            String marca,
                            int opzione,
                            Object input
                             ) {
    	
        if ( num_posti < 10 ) {
            if ( opzione == 0 ) {
                Posti.add(new Decespugliatore((boolean)input, marca, id_ordine));
            }
            if ( opzione == 1 ) {
                Posti.add(new Tosa_erba((int)input, marca, id_ordine));
            }
            if ( opzione == 2 ) {
                Posti.add(new Motozappe((int)input, marca, id_ordine));
            }

            id_ordine += 1;

        }
    }

    public void remove_work ( int id ) {

        int i;

        for ( i = 0 ; i < Posti.size() ; i += 1 ) {

            if ( Posti.get(i).get_id() == id ) {
                Posti.remove(i);
            }

        }

    }




}
