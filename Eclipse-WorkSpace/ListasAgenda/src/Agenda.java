import java.util.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	List <Contacto> registro = new ArrayList();
		
	//	for(int i = 1; i<=10; i++) {
	//		Contacto reg = new Contacto();
	//		registro.add(reg);
	//		reg.setNombre("Contacto"+i);
	//	}
		
	//	for(Contacto reg: registro) {
	//		System.out.println(reg.getNombre());
	//	}
	
	
	HashMap<Integer,String> listaContactos = new HashMap<Integer,String>();
	
		for(int i = 1; i<=10; i++) {
				Contacto reg = new Contacto();
				reg.setNombre("Contacto"+i);
				listaContactos.put(i, reg.getNombre());
				
		}
		
		for(Map.Entry<Integer, String> entry: listaContactos.entrySet()) {
			System.out.println("Key="+ entry.getKey() + ", Value=" + entry.getValue());

		}
		

	}
}
