package DAO;

import java.util.*;
import model.Chamado;

public class ChamadoDao {

	private static ChamadoDao instance;
	private List<Chamado> listaChamados = new ArrayList<>();
	
	/*
	 * usando modelo Singleton para simular CRUD no banco de dados 
	 */
	
	public static ChamadoDao getInstance() {
		if(instance == null) {
			instance = new ChamadoDao();
		}
		return instance;
	}	//Fim do Singleton
	
	public void salvar(Chamado chamado) {
		listaChamados.add(chamado);
	}

	//upDate
	public void atulizar(Chamado chamado) {
		listaChamados.set(chamado.getIdChamado(), chamado);
	}
	
	//Delet
	public void excluir(int idChamado) {
		listaChamados.remove(idChamado);
	}
	
	//consultar uma lista de camados
	public List<Chamado> listar(){
		return listaChamados;
	}
	
}
