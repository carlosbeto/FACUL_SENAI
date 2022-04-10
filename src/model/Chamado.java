package model;

public class Chamado {
	//public LocalDate dataChamado;
	private double kmPercorrido;
	private double consumo;
	private Veiculo veiculo; //cria associação com a classe Veiculo
	private Funcionario funcionario; //cria uma associação com a classe Funcionario

	//criando o construtor da classe
	public Chamado(double kmPercorrido, double consumo) {
		this.kmPercorrido = kmPercorrido;
		this.consumo = consumo;
		
	}
	
	
	public double getKmPercorrido() {
		return kmPercorrido;
	}


	public void setKmPercorrido(double kmPercorrido) {
		this.kmPercorrido = kmPercorrido;
	}


	public double getConsumo() {
		return consumo;
	}


	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}


	public double CalculoCO2() {
		double co2 = ((kmPercorrido/consumo) * 0.75 *3.7);
		return co2;
	}
}
