package controller;

import java.util.*;

import DAO.FuncionarioDao;
import model.Funcionario;

public class FuncionarioController {
		
	private static FuncionarioDao instance;
	private List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	/*
	 * usando modelo Singleton para simular CRUD no banco de dados 
	 */
	
	public static FuncionarioDao getInstance() {
		if(instance == null) {
			instance = new FuncionarioDao();
		}
		return instance;
	}	//Fim do Singleton
	
	public void salvar(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
		
	}
	
	public void atulizar(Funcionario funcionario) {
		listaFuncionarios.set(funcionario.getIdFuncionario(), funcionario);
	}
	
	public void excluir(int idFuncionario) {
		listaFuncionarios.remove(idFuncionario);
	}
	
	public List<Funcionario> listar(){
		return listaFuncionarios;
	}	

}
