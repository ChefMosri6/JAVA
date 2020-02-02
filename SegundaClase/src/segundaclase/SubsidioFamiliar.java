package segundaclase;
import java.util.Scanner;

public class SubsidioFamiliar {
	
	public int hijos;
	public int hijosEscolar;
	public int edad;
	public int monto;
	public int viuda;

	public int i;
	static Scanner leer = new Scanner(System.in); 
	
	SubsidioFamiliar(){
		hijos = 0;
		hijosEscolar = 0;
		edad = 0;
		monto = 0;
		viuda = 0;
		i=0;
	}
	
	public int montoMensual() {
		 System.out.println("Favor de ingresar el numero de hijos (0 para salir): ");
		 hijos = leer.nextInt();
		 if (hijos !=0) {
			 if(hijos<=2){ 
				 monto += 70;
		     }else{
		    	 if(hijos<=5 && hijos>2){
		    		 monto += 90;
		    	 }else{
		    		 monto += 120;
		    	 }
		     }
			 for(i=0;i<hijos;i++){
				 System.out.println("Favor de ingresar la edad del hijo "+(i+1)+" : ");
				 edad = leer.nextInt();
				 if(edad>=6 && edad <= 18) {
					 monto +=10;
				 }
		     }
			 System.out.println("Si la madre es viuda favor de ingresar 1: ");
			 viuda = leer.nextInt();
			 if(viuda == 1) {
				 monto +=20;
			 }
		 }
		return monto;
	}

}
