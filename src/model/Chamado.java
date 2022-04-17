package model;

public class Chamado {
	//public LocalDate dataChamado;
	private int idChamado;
	private double kmPercorrido;
	private double consumo;
	private Veiculo veiculo; //cria associação com a classe Veiculo
	private Funcionario funcionario; //cria uma associação com a classe Funcionario

	//criando o construtor da classe
	public Chamado(double kmPercorrido, double consumo) {
		this.kmPercorrido = kmPercorrido;
		this.consumo = consumo;
		
	}
	
	public int getIdChamado() {
		return idChamado;
	}


	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
