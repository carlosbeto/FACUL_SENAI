package controller;

import java.util.*;

import DAO.ChamadoDao;
import model.Chamado;

public class ChamadoController {
	
	public void salvar(Chamado chamado) throws Exception {
		if(chamado.getIdChamado() = null) {
			throw new Exception();
		}
		ChamadoDao.getInstance().salvar(chamado);
	}

	//upDate
	public void atulizar(Chamado chamado) throws Exception {
		if(chamado.getIdChamado() = null){
			throw new Exception("Id inválido");
		}
		ChamadoDao.getInstance().atulizar(chamado);
	}
	
	//Delet
	public void excluir(int idChamado) throws Exception {
		if(idChamado == 0) {
			throw new Exception("Nenum chamado selecionado");
		}
		ChamadoDao.getInstance().excluir(idChamado);
	}
	
	//consultar uma lista de camados
	public List<Chamado> listar(){
		return ChamadoDao.getInstance().listar();
		
	}
}
