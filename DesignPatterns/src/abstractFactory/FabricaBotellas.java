package abstractFactory;

public class FabricaBotellas extends AbstractFactory{

	@Override
	Distribucion getDistribucion(String distribucion) {
		return null;
	}

	@Override
	BebidaEmbotellada getBebida(String bebida) {
		if(bebida == null){
         return null;
      }		
      
      if(bebida.equalsIgnoreCase("Refresco")){
    	 double[] materiaPrima= {1,2,3};
    	 double[] enExistencia= {4,5,6};
         return new Refresco(150, materiaPrima, enExistencia);
         
      }else{
    	 double[] materiaPrima= {1,2,3};
     	 double[] enExistencia= {4,5,6};
         return new Cerveza(materiaPrima, enExistencia, "Menta y Vainilla"); 
      }
	}

}
