package factory;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BebidaEmbotelladaFactory fabrica=new BebidaEmbotelladaFactory();
		
		double[] materiaPrima= {1,23,5,76};
		double[] enExistencia= {2,40,8,90};
		BebidaEmbotellada botella1=fabrica.getBebidas("Refresco",materiaPrima,
				enExistencia, 200, null);
		botella1.produce();
		
		double[] materiaPrima2= {4,20,34,1};
		double[] enExistencia2= {2,21,30,9};
		BebidaEmbotellada botella2=fabrica.getBebidas("Cerveza", materiaPrima2,
				enExistencia2, 0, "Malta con chocoalte");
		botella2.produce();
	}

}
