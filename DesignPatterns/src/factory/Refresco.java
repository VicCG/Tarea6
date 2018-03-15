package factory;

public class Refresco implements BebidaEmbotellada {

	private double medida;
	private double[] materiaPrima;
	private double[] enExistencia;
	private int botellasProducidas=0;
	
	public Refresco(double medida, double[] materiaPrima, double[] enExistencia) {
		super();
		this.medida = medida;
		this.materiaPrima = materiaPrima;
		this.enExistencia = enExistencia;
	}

	@Override
	public boolean produce() {
		if(checaInventario()) {
			botellasProducidas++;
			System.out.println("Se hizo la botella "+botellasProducidas+" de la presentación: "+medida);
			return true;
		}
		
		System.out.println("Con esa materia prima no se puede producir el refresco");
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
