package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Collections;
import java.util.HashSet;

public class Ejercicio4 {

	// listas de ejemplo, pueden variarse su contenido, 
	//static Integer[] valoresLista1 = {1, 2, 5, 8, 10, 30, 20, 8, 9, 10};
	static Integer[] valoresLista1 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};
	static Integer[] valoresLista2 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};

	/**	 
	 * Para ejecutar el método main se debe hacer boton derecho sobre la clase
	 * "Run As --> Java Application" 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("**** inicializando datos ****");
		
		List<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(valoresLista1));
		List<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(valoresLista2));
	
		System.out.println("**** inicializacion exitosa ****");

		informacion(lista1, 10);
		
		List<Integer> union = unionListas(lista1, lista2);
		System.out.println("union: " + union.toString());
		
		List<Integer> interseccion = interseccionListas(lista1, lista2);
		System.out.println("interseccion: " + interseccion.toString());
		
		List<Integer> orden1 = ordenaListaAscendente(lista1);
		System.out.println("orden asc: " + orden1);
		
		List<Integer> orden2 = ordenaListaDescendente(lista2);
		System.out.println("orden desc: " + orden2);

		boolean b = tienenMismoContenido(lista1, lista2);
		System.out.println("mismo contenido: " + b);
		
	}

	private static void informacion(List<Integer> lista1, Integer numero) {
		
		/*	1er System.out -- Muestra cantidad de numeros pares
		 * 	2do System.out -- Muestra lista de numeros impares en formato de string
		 * 	3er System.out -- Muestra el indice del numero impar (p) dentro de la lista, que tambien es la 'mitad' de la longitud del arreglo.
		 * 	4to System.out -- Deberia mostrarse si la cantidad de elementos, mayores que 'numero', supera la mitad de la longitud de la lista.
		 * 	5to System.out -- Simplemente se muestra si existe mas de un elemento, dentro de array, mayor que numero
		 */
		
		
		int pares = 0;
		int c = 0;
		
		List<Integer> impares = new ArrayList<Integer>();
		
		for (Integer n: lista1) {
			if (n % 2 == 0) {
				pares = pares + 1;
			} else if (n % 2 != 0) {
				impares.add(n);
			} else if (n > numero) {
				c = c + 1;
			}
		}
		
		System.out.println("1... " + pares);
		
		System.out.println("2... " + impares.toString());	
		
		System.out.println("3..." + lista1.indexOf(lista1.size() / 2));
				
		if (c > lista1.size() / 2) {
			System.out.println("4...");
		} else if (c < lista1.size() / 2) {
			System.out.println("5...");		
		}
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos de ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> unionListas(List<Integer> lista1, List<Integer> lista2) {
		
		List<Integer> union = new ArrayList<Integer>();
		
		union.addAll(lista1);
		
		for (Integer m: lista2) {
			if (!union.contains(m)) {
				union.add(m);
			}
		}
		
		return union;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * retornar una lista que contenga los elementos que estan presentes en ambas listas, sin elementos repetidos 
	 * 
	 */
	private static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2) {

		List<Integer> newList = new ArrayList<Integer>();
		newList.addAll(lista1);

		for(Integer item: lista2){
		    if(newList.contains(item))
		    	newList.remove(item);
		    else
		    	newList.add(item);
		}
		
		return newList;
	}

	/***
	 * @param lista1
	 * 
	 * retornar la lista recibida, ordenada en forma ascendente
	 * 
	 */
	private static List<Integer> ordenaListaAscendente(List<Integer> lista1) {

		List<Integer> newList = new ArrayList<Integer>();
		
		Collections.sort(lista1);

		for(Integer item: lista1){			
			if (!newList.contains(item)) {
				newList.add(item);
			}
			
		}
		
		return newList;
	}

	/***
	 * @param lista2
	 * 
	 * retornar la lista recibida, ordenada en forma descendente
	 * 
	 */
	private static List<Integer> ordenaListaDescendente(List<Integer> lista2) {

		List<Integer> newList = new ArrayList<Integer>();
		
		Collections.sort(lista2, Collections.reverseOrder());

		for(Integer item: lista2){			
			if (!newList.contains(item)) {
				newList.add(item);
			}
			
		}
		
		return newList;
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 * devuelve true si contienen los mismos elementos
	 * NO se considera valido que esten en diferente orden
	 * NO se considera valido que la cantidad de repeticiones de los elementos sea diferente
	 * 
	 */
	private static boolean tienenMismoContenido(List<Integer> lista1, List<Integer> lista2) {

		return Objects.equals(lista1, lista2);
	}

}
