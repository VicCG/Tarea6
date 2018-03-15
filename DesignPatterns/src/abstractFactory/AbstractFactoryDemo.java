package abstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory fab1=FactoryProducer.getFabrica("Botellas");
		BebidaEmbotellada botella1=fab1.getBebida("Cerveza");
		botella1.produce();
		
		AbstractFactory fab2=FactoryProducer.getFabrica("Distribucion");
		Distribucion medio1=fab2.getDistribucion("Barco");
		System.out.println(medio1.imprimeDestinos());
	}

}
