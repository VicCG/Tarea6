package abstractFactory;

public class Camion implements Distribucion{
	private String[] ciudades;
	private String trafico;
	private int repartidores;
	
	public Camion(String[] ciudades, String trafico, int repartidores) {
		super();
		this.ciudades = ciudades;
		this.trafico = trafico;
		this.repartidores = repartidores;
	}
	
	@Override
	public boolean disponibilidadDeEnvio() {
		return (repartidores<=this.ciudades.length && this.trafico.equals("Ligero"));
	}
	@Override
	public String imprimeDestinos() {
		String res="El tráfico de hoy es "+this.trafico+"\n";
		res+="El numero de empleados es de "+this.repartidores;
		
		for(int i=0; i<this.ciudades.length;i++)
			res+=ciudades[i]+"\n";
		return res;
	}
	
	

}
