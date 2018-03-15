package decorator;

public class Cerveza implements BebidaEmbotellada {

	private double[] materiaPrima;
	private double[] enExistencia;
	private String sabor;
	private int botellasProducidas=0;
	
	public Cerveza(double[] materiaPrima, double[] enExistencia, String sabor) {
		super();
		this.materiaPrima = materiaPrima;
		this.enExistencia = enExistencia;
		this.sabor = sabor;
	}

	@Override
	public boolean produce() {
		if(checaInventario()) {
			botellasProducidas++;
			System.out.println("Se hizo la caja de Cerveza "+botellasProducidas+" de: "+ sabor);
			return true;
		}
		
		System.out.println("No hay suficiente materia prima para producir la Cerveza");
		return false;
			
	}

	@Override
	public boolean checaInventario() {
		boolean status=false;
		int i=0;
		
		while(i<materiaPrima.length&&!status) {
			status=materiaPrima[i]>=enExistencia[i];
			enExistencia[i]-=enExistencia[i];
			i++;
		}
		
		return status;
	}

}
