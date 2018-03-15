package abstractFactory;

public abstract class AbstractFactory {
	abstract Distribucion getDistribucion(String distribucion);
	abstract BebidaEmbotellada getBebida(String bebida);
}
