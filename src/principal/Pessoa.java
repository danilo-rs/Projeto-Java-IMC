package principal;

import java.util.Scanner;
import entidade.IMC;

public class Pessoa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome da pessoa: ");
		String nome = sc.nextLine();
		System.out.println("Digite seu peso em KG: ");
		double peso = sc.nextDouble();
		System.out.println("Digite sua altura em metros: ");
		double altura = sc.nextDouble();
		
		IMC imc = new IMC();
		
		double vIMC = (imc.medicao(peso, altura));
		
		
		if (vIMC < 18.5) {
			System.out.println("O IMC de " + imc.nome(nome) + " é " + String.format("%.2f", vIMC) + ". Sendo assim, está abaixo do peso");
		} else
				if (vIMC >= 18.5 && vIMC < 25) {
					System.out.println("O IMC de " + imc.nome(nome) + " é " + String.format("%.2f", vIMC) + ". Sendo assim, está com peso ideal");
				} else {
					System.out.println("O IMC de " + imc.nome(nome) + " é " + String.format("%.2f", vIMC) + ". Sendo assim, está com sobrepeso");
				}
		

		
		
		sc.close();
		}

	}

