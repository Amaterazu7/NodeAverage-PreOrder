package controller;
import java.util.ArrayList;

import model.Nodo;


public class PruebaArbol {
	/*
	 * @param args
	 * */
	private static ArrayList<Integer> arrayNodos=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Nodo root=new Nodo(100,"Root");
		Nodo nodo2i=new Nodo(150, "Nodo Level2");	
		Nodo nodo2d=new Nodo(50, "Nodo Level2");
		
		root.setNodoLeft(nodo2i);
		root.setNodoRight(nodo2d);

		nodo2i.setNodoLeft(new Nodo(25, "Nodo Level3"));
		nodo2i.setNodoRight(new Nodo(75, "Nodo Level3"));
		
		nodo2d.setNodoLeft(new Nodo(125, "Nodo Level3"));
		nodo2d.setNodoRight(new Nodo(175, "Nodo Level3"));
		
		
		preOrden(root);
		System.out.print("Promedio: - ");
		System.out.print(calculateAverageNodos(arrayNodos));
	}
	
	private static void preOrden(Nodo root){
		if(root!=null){
			arrayNodos.add(root.getData());
			System.out.println(root.getData() +" - " + root.getName());
			preOrden(root.getNodoLeft());
			preOrden(root.getNodoRight());
		}
	}
	
	public static Integer calculateAverageNodos(ArrayList array){
		Integer average=0;
		Integer sum=0;
		if(!array.isEmpty()){
			for (int i = 0; i < array.size(); i++) {
				sum=sum+(Integer)array.get(i); 	
			}
			System.out.println("Cantidad de nodos: "+array.size());
			System.out.println("Sumatoria de Nodos: "+ sum);	
			average=sum/array.size();
			System.out.println("AVERAGE de Nodos: "+average);
		}	
		return average;
	}


}
