package decorator;

public class CamionBotellaDecorator extends BotellaDecorator{

	public CamionBotellaDecorator(BebidaEmbotellada botella) {
		super(botella);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean produce() {
		// TODO Auto-generated method stub
		if(envioPorCamion(botella.getClass().getName()))
			System.out.print("Se puede enviar por camion\n");
		return super.botella.produce();
	}

	public boolean envioPorCamion(String nombre) {
		return nombre.equalsIgnoreCase("decorator.Refresco");
	}
	
	

}
