
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Lucas");
		g1.setCpf("12345678910");
		g1.setSalario(10000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificaco());
		
		g1.setSenha(1234);
		
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);
	}	
}
