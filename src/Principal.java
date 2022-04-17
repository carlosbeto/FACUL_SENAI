import model.Funcionario;
import controller.FuncionarioController;

public class Principal {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setIdFuncionario(1);
		f1.setNomeFuncionario("JOAO PAULO");

		Funcionario f2 = new Funcionario();
		f2.setIdFuncionario(2);
		f2.setNomeFuncionario("PEDRO PAULO");
		
		FuncionarioController controller = new FuncionarioController();
		try {
				controller.salvar(f1);
				controller.salvar(f2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Funcionario c : controller.listar()) {
			System.out.println(c.toString());
		}
		
	}
	
}
