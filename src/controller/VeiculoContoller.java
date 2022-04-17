package controller;

import java.util.*;


import DAO.VeiculoDao;
import model.Veiculo;

public class VeiculoContoller {
	
	private static VeiculoDao instance;
	private List<Veiculo> listaVeiculos = new ArrayList<>();
	
	/*
	 * usando modelo Singleton para simular CRUD no banco de dados 
	 */
	
	public static VeiculoDao getInstance() {
		if(instance == null) {
			instance = new VeiculoDao();
		}
		return instance;
	}	//Fim do Singleton
	
	
	public void salvar(Veiculo veiculo) {
		listaVeiculos.add(veiculo);
	}
	
	public void atualizar(Veiculo veiculo) {
		listaVeiculos.set(veiculo.getIdVeiculo(), veiculo);
	}
	
	public void excluir(int id_veiculo) {
		listaVeiculos.remove(id_veiculo);
	}
	
	public List<Veiculo> listar(){
		return listaVeiculos;
	}

}
