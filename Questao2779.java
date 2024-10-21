package Revisao.Colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2779 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Album album = new Album(input.nextInt());
		int compradas = input.nextInt();
		
		for(int i = 0; i < compradas;i++) {
			album.add(input.nextInt());
		}
		
		System.out.println(album.figurinhasRestantes());
		
	}
}

class Album{
	
	private int numeroEspacos;
	private ArrayList<Integer> album = new ArrayList<Integer>();
	
	public Album(int numeroEspacos) {
		this.setNumeroEspacos(numeroEspacos);
	}
	
	public void add(int valor) {
		if(!album.contains(valor)) {
			album.add(valor);
		}
	}
	
	public int figurinhasRestantes() {
		return getNumeroEspacos()-album.size();
	}

	public int getNumeroEspacos() {
		return numeroEspacos;
	}

	public void setNumeroEspacos(int numeroEspacos) {
		this.numeroEspacos = numeroEspacos;
	}
}