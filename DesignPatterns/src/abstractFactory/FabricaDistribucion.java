package abstractFactory;

public class FabricaDistribucion extends AbstractFactory{

	@Override
	Distribucion getDistribucion(String distribucion) {
		if(distribucion==null)
			return null;
		else if(distribucion.equalsIgnoreCase("Camion")) {
			String[] ciudades= {"CDMX", "Queretaro", "Edo.Mex", "Ciudad Juárez"};
			
			return new Camion(ciudades, "Favorable", 50);
		}
		else if(distribucion.equalsIgnoreCase("Avion")) {
			String[] aeropuertos= {"CDX", "CUN", "CUU"};
			String[] horarios= {"5:30", "3:00", "9:00"};
			return new Avion(10, 5, aeropuertos, horarios);
		}
		else {
			String[] puertos= {"Yucatan", "Quintana Roo", "Baja California Sur", "Baja California Norte"};
			return new Barco("Favorable", puertos, 20,30);
		}
	}

	@Override
	BebidaEmbotellada getBebida(String bebida) {
		return null;
	}

}
