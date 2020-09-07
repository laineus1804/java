package model;

public class voiture {

	public static void main(String[] args) {
		// objeto 1
		Carro oneCarro = new Carro();
		oneCarro.ano = 2017;
		oneCarro.cor ="black";
		System.out.println("Carro: " + oneCarro.ano);
		System.out.println("Cor: " + oneCarro.cor);
		oneCarro.ligar();
		oneCarro.acelerar();
	
		//objetos 2
		Carro twoCarro = new Carro();
		twoCarro.ano = 2019;
		twoCarro.cor =" white";
		System.out.println("Carro: " + twoCarro.ano);
		System.out.println("Cor: " + twoCarro.cor);		
		twoCarro.acelerar();
		twoCarro.desligar();
		
		
	}

}
