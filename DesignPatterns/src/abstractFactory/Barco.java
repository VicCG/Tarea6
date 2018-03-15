package abstractFactory;

public class Barco implements Distribucion{
	private String clima;
	private String[] puertos;
	private int barcosDisponibles;
	private int numBarcos;

	public Barco(String clima, String[] puertos, int barcosDisponibles, int numBarcos) {
		super();
		this.clima = clima;
		this.puertos = puertos;
		this.barcosDisponibles = barcosDisponibles;
		this.numBarcos = numBarcos;
	}

	@Override
	public boolean disponibilidadDeEnvio() {
		return (this.clima.equals("Favorable")&&(barcosDisponibles<=numBarcos));
	}

	@Override
	public String imprimeDestinos() {
		String res="El clima es "+this.clima+" para el día de hoy\n";
		res+="Los puertos abiertos para hoy: ";
		
		for(int i=0; i<this.puertos.length;i++) {
			res+=this.puertos[i]+"\n";
		}
		
		return res;
	}

}
