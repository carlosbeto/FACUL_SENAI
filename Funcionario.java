import java.time.LocalDate;

public class Funcionario {

	private String nomeFuncionario; 
	private LocalDate dataNascFuncionario;
	private String sexoFuncionario;
	private String habilitado;

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
}
