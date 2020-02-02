package segundaclase;

public class calcularMonto {
	
	public static void main(String argo[]) {
		int opt = 0;
		do{
			SubsidioFamiliar sb = new SubsidioFamiliar();
			opt = sb.montoMensual();
			if(opt!=0) {
				System.out.println("El monto mensual es "+opt);
			}
	    }while(opt!= 0);
		
	}
}
