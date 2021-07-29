
public class ControleBonificacao {
	private double soma;
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificaco();
		this.soma += bonificacao; 
	}
	
	public double getSoma() {
		return soma;
	}
}
