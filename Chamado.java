
public class Chamado {
	//public LocalDate dataChamado;
	public double kmPercorrido;
	public double consumo;


	public double CalculoCO2() {
		double co2 = ((kmPercorrido/consumo) * 0.75 *3.7);
		return co2;
	}
}
