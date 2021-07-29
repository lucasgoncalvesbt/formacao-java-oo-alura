
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("123456789-10");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificaco());
	}
	
}
