package decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] materiaPrima= {50,30,20};
		double[] enInventario= {6,5,7};
		BebidaEmbotellada refresco=new Refresco(150, materiaPrima, enInventario);
		
		BebidaEmbotellada refrescoPorCamion=new CamionBotellaDecorator(new Refresco(150, materiaPrima, enInventario));
		refresco.produce();
		refrescoPorCamion.produce();
	}

}
