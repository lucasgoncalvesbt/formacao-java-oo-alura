
public class Gerente extends FuncionarioAutenticavel {
	
	
	public double getBonificaco() {
		System.out.println("Chamado do Gerente");
		return super.getSalario();
	}		
}
