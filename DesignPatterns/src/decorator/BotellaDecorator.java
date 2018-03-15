package decorator;

public abstract class BotellaDecorator implements BebidaEmbotellada{
	protected BebidaEmbotellada botella;

	public BotellaDecorator(BebidaEmbotellada botella) {
		super();
		this.botella = botella;
	}
	
	public boolean produce() {
		return botella.produce();
	}
	public boolean checaInventario() {
		return botella.checaInventario();
	}
}
