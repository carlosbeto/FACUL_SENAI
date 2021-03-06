package model;
import java.time.LocalDate;

public class Funcionario {

	private int idFuncionario;
	private String nomeFuncionario; 
	private LocalDate dataNascFuncionario;
	private String sexoFuncionario;
	private String habilitado;
	
	//criando construtor da classe
	public Funcionario(String nomeFuncionario, 
			LocalDate dataNascFuncionario, 
			String sexoFuncionario,
			String habilitado) {
		this.nomeFuncionario = nomeFuncionario;
		this.dataNascFuncionario = dataNascFuncionario;
		this.sexoFuncionario = sexoFuncionario;
		this.habilitado = habilitado;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public LocalDate getDataNascFuncionario() {
		return dataNascFuncionario;
	}
	
	public void setDataNascFuncionario(LocalDate dataNascFuncionario) {
		this.dataNascFuncionario = dataNascFuncionario;
	}
	
	public String getSexoFuncionario() {
		return sexoFuncionario;
	}
	
	public void setSexoFuncionario(String sexoFuncionario) {
		this.sexoFuncionario = sexoFuncionario;
	}
	
	public String getHabilitado() {
		return habilitado;
	}
	
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
}
