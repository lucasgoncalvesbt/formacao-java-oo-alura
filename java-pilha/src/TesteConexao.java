
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()) {
			con.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Deu erro na conexao");
		}
		
		//----------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException e) {
//			System.out.println("De erro na conex�o");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//		}
		
	}
	
}
