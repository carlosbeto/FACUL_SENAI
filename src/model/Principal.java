package model;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//cria o objeto sc da classe Scanner que serve para receber informações do 
		//usuário via teclado
		Scanner sc = new Scanner(System.in);
		
		//cira o abjeto ch instanciado da classe Chamado
		Chamado ch = new Chamado(0, 0);
		
		//ch.dataChamado = sc.locale();
		
		System.out.println("Entre com os dados para calculo CO2: ");
		System.out.println("Entre com consumo do veículo: ");
		ch.setConsumo(sc.nextDouble());
		System.out.println("Entre com os Kilometros percorridos: ");
		ch.setKmPercorrido(sc.nextDouble());
		
		double cg = ch.CalculoCO2();
		System.out.printf("O CO2 desse chamado é: %.3f%n ", cg);
		
		sc.close();
	}
}
