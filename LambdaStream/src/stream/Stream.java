package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream {
	
	public static void main(String[] args) {
		// Usando Reduce: Obtener la suma de todos los números
		int[] lst = { 1,5,8 };
		IntStream streamInt=Arrays.stream(lst);
		int sum = streamInt.sum();
		System.out.println("Suma total: "+sum);
		
		// Usando Map: Obtener el cuadrado de los números
		double[] lstStr = {1,2,4,6,8,10};
		lstStr = Arrays.stream(lstStr).map(s-> s*s).toArray();
		System.out.println("Cuadrado de los números:");
		for(Double elem:lstStr)
			System.out.println(elem);
			
	}

}
