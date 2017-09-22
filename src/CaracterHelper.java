import java.util.HashMap;
import java.util.Map;

public class CaracterHelper {

	
	LetraO letrao = new LetraO();
	LetraC letrac = new LetraC();
	LetraS letraese = new LetraS();
	LetraA letraa = new LetraA();
	HashMap<String, CaracterDibujable> letras = new HashMap<String, CaracterDibujable>();
	
	public CaracterHelper() {
		// TODO Auto-generated constructor stub
		this.letras.put("O", letrao);
		this.letras.put("C", letrac);
		this.letras.put("S", letraese);
		this.letras.put("A", letraa);
	}
	

	//CaracterDibujable[] letrasq	 = new CaracterDibujable[1];
	//letras[0] = letrao;
	public void showLetras(String cadena){
		for (int i = 0; i< cadena.length(); i++){
			//letras[i].dibujar();
			
			for (Map.Entry<String, CaracterDibujable> hletras : letras.entrySet()) {
				if(hletras.getKey().equals(String.valueOf(cadena.charAt(i)))) {
				hletras.getValue().dibujar();}
			}
							
			}
	
		}
		
	}

