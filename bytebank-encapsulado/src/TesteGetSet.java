
public class TesteGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 45671);
		conta.setNumero(200);		
		System.out.println(conta.getNumero());
		
		Cliente paulo =  new Cliente();
		paulo.setNome("Paulo");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
	}
}
