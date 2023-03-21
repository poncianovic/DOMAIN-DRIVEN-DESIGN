package br.com.fiap.motors.model;

public class View {

	//main -> CTRL + espaco
	public static void main(String[] args) {
		//Instanciar o Carro
		Carro gol = new Carro();
		
		//Colocar informacoes nos atributos
		gol.ano = 1999;
		gol.modelo = "Gol Bola";
		gol.valor = 15000;
		
		//Calcular a idade do carro
		int i = gol.calcularIdade(2023);
		
		//Exibir a idade
		System.out.println("Idade do carro: " + i);
		
		//Aumentar o valor do carro em 20%
		gol.atualizarValor(0.2); 
		
		
		//Exibir o valor 
		System.out.println("Valor do carro: " + gol.valor);
		
		double x = gol.calcularSeguro();
		 System.out.println("Valor do Seguro: " + x);
		 
		 //Exibir o valor da parcela do seguro em 3x
		 double parcela = gol.calcularValorParcelaSeguro(3);
		 System.out.println("Valor da parcela do seguro (3x): " + parcela); 
		 
		 

		
		
		
		
	}

   
    
    

}