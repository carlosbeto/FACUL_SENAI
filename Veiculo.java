import java.time.LocalDate;

public class Veiculo {
	private String placaVeiculo;
	private LocalDate anoVeiculo;
	private String marca;
	private String modelo;
	private double consumo;
	
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
	
	public double getConsumo() {
		return consumo;
	}
	
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
}
