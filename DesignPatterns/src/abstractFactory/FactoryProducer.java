package abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFabrica(String decision) {
		if(decision.equalsIgnoreCase("Botellas"))
			return new FabricaBotellas();
		else if(decision.equalsIgnoreCase("Distribucion"))
			return new FabricaDistribucion();
		return null;
	}
}
