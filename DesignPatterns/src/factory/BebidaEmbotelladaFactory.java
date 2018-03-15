package factory;

public class BebidaEmbotelladaFactory {
	public BebidaEmbotellada getBebidas(String bebida, double[] materiaPrima,
				double[] enExistencia, double medida, String sabor) {
		if(bebida == null)
			return null;
		else if(bebida.equalsIgnoreCase("Refresco"))
	        return new Refresco(medida, materiaPrima, enExistencia);
        else if(bebida.equalsIgnoreCase("Cerveza"))
    	 	return new Cerveza(materiaPrima,enExistencia, sabor);
		return null;
	}
}
