package ProjetoAP;

import java.time.LocalDate;

public class Veiculos {
	private String placaVeiculo;
	private LocalDate anoVeiculo;
	private String marca;
	private String modelo;
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public LocalDate getAnoVeiculo() {
		return anoVeiculo;
	}
	public void setAnoVeiculo(LocalDate anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
