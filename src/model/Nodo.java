package model;

import java.util.ArrayList;

public class Nodo implements INodo{
	
	public static ArrayList<Integer> arrayNodos=new ArrayList<Integer>();
	
	private Integer data;
	private String name;
	private Nodo left;
	private Nodo right;
	
	
	public Nodo(Integer data, String name){
		this.data=data;
		this.name=name;
	}
	
	public Integer getData() {
		return data;
	}
	
	public String getName() {
		return name;
	}
	
	public Nodo getNodoLeft() {
		return left;
	}
	public void setNodoLeft(Nodo nodo) {
		this.left = nodo;
	}

	public Nodo getNodoRight() {
		return right;
	}
	public void setNodoRight(Nodo nodo) {
		this.right = nodo;
	}
	
	
}
