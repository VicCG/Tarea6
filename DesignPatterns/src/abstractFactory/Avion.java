package abstractFactory;

public class Avion implements Distribucion{
	private int numVuelos;
	private int vuelosDisponibles;
	private String[] aeropuertos;
	private String[] horarioLlegadas;
	

	public Avion(int numVuelos, int vuelosDisponibles, String[] aeropuertos, String[] horarioLlegadas) {
		super();
		this.numVuelos = numVuelos;
		this.vuelosDisponibles = vuelosDisponibles;
		this.aeropuertos = aeropuertos;
		this.horarioLlegadas = horarioLlegadas;
	}

	@Override
	public boolean disponibilidadDeEnvio() {
		return this.numVuelos<=this.vuelosDisponibles;
	}

	@Override
	public String imprimeDestinos() {
		String res="";
		
		for(int i=0;i<this.aeropuertos.length;i++) {
			res+=this.aeropuertos[i]+" llega a las "+this.horarioLlegadas[i]+"\n";
		}
		
		return res;
	}

}
