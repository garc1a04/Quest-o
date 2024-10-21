package Revisao.Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao1766 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repeticoes = input.nextInt();
		for(int i = 0; i < repeticoes;i++) {
			ArrayList<Renas> qtdRenas = new ArrayList<Renas>();
			int totalRenas = input.nextInt();
			int totalTreno = input.nextInt();
			
			for(int j = 0; j < totalRenas;j++) {
				qtdRenas.add(new Renas(input.next(), input.nextInt(), input.nextInt(),input.nextDouble()));
			}
			
			Collections.sort(qtdRenas);
			
			System.out.printf("Cenario {%d}\n", i+1);
			
			for(int j = 0; j < totalTreno;j++) {
				System.out.printf("%d - %s\n", j+1, qtdRenas.get(j).getNome());
			}
			
		}
		
		
		
	}
}

class Renas implements Comparable<Renas>{
	
	private String nome;
	private int peso;
	private int idade;
	private double altura;
	
	public Renas(String nome, int peso, int idade, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public int compareTo(Renas o) {
		int comparador = o.peso - this.peso; //decrescente
		
		if(comparador == 0) {
			comparador = this.idade - o.idade;
		}
		
		if(comparador == 0) {
			comparador = (int) ((this.altura*100)-(o.altura*100));
		}
		
		if(comparador == 0) {
			comparador = this.nome.compareTo(o.nome);
		}
		
		return comparador;
	}
}
/*
 	Questão Resumida
 	
 	Ordenacao
 	
		Elas devem ser ordenadas primeiramente de forma decrescente por peso. 
		Caso duas ou mais apresentarem o mesmo peso elas devem ser ordenadas de forma 
		ascendente pela idade, após pela altura e caso ainda persista empate, 
		pelo nome.
 	
 	Entrada de dados
 	
 	- Numero de casos
 	- Número total de renas e o número de renas que irão puxar o trenó
 	- O nome, o peso, a idade e a altura de cada uma das renas
 	
 	Saida de dados
 	
 	- M renas deverão aparecer no console(De acordo com o número de renas que irão puxar o treno)
 	
 	EXEMPLO DE SAIDA
 	
 	CENARIO {1}
	1 - Rudolph
	2 - Cupid
	3 - Vixen
	4 - Comet
	5 - Blitzen 	
 */