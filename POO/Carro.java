package model;

public class Carro {
	//atributos
	public int ano;
	public String cor;
	
	//copnstrutorres
	public Carro() {
		System.out.println("==============voiture==================");
	}
		//m�todos
		public void ligar() {
			System.out.println("car turn on");
		}
		public void desligar() {
			System.out.println("Start stop");
		}
		public void acelerar() {
			System.out.println("speed up");
		}
	}
