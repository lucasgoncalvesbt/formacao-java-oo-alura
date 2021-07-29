
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 22546);		
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 22527);		
		Conta conta3 = new Conta(1337, 22789);
		
		System.out.println(Conta.getTotal());
	}
}
