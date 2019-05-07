package model;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

	private int num1;
	private int num2;
	private List<Integer> resultados = new ArrayList<Integer>();
	
	public int getNumero1() {
		return num1;
	}

	public int getNumero2() {
		return num2;
	}

	public void setNumero1(int num1) {
		this.num1 = num1;
	}

	public void setNumero2(int num2) {
		this.num2 = num2;
	}
	
	public void soma() {
		resultados.add(num1 + num2);
	}
	
	public List<Integer> getResultados() {
		return resultados;
	}

}
