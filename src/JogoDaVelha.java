public class JogoDaVelha {

		
	public static String[][] inicializar() {
		String tabuleiro [][] = {{"", "", ""}, 
								 {"", "", ""}, 
								 {"", "", ""}};
		
		return tabuleiro;
	}

	public static void jogar(String[][] tabuleiro, int i, int j, String jogador) throws JogoDaVelhaException {
		    
		
		verificaSeExiste(tabuleiro, i, j, jogador);
		    	 
		
		     
		if(tabuleiro[i][j].equals("")){
			tabuleiro[i][j]=jogador;
		} else if(!tabuleiro[i][j].equals("")){
			throw new JogoDaVelhaException("Ja esta marcado!");
			
		}
	
	}
	public static void verificaSeExiste(String[][] tabuleiro, int i, int j, String jogador) throws JogoDaVelhaException {
		if(i>=tabuleiro.length||j>=tabuleiro.length){
			throw new JogoDaVelhaException("Ja esta marcado!");
		}
	}
	
	
	
	
	public static boolean existeGanhador(String[][] tabuleiro, String jogador) {
		return false;
	}
	
}
