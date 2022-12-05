package main;

public class Main {

	/* Boas práticas demonstradas: 
	 * - Exemplo sobre nomes intuitivos de funções;
	 * - Código pode ser lido como uma narrativa;
	 * - Parâmetros foram reduzidos a um objeto;
	 * - Validações extraídas para outras funções;
	 * - Alterar valor de um atributo somente depois de validar corretamente; 
	 * - Nome de booleano deve estar fazendo uma pergunta;
	 * - Indentação até nível 2;
	 * - Tratamento de erro chamando exceções;
	 * - Possível pegadinha: testes unitários.
	 */

	public static void main(String[] args) throws VeiculoException {
		Veiculo veiculo = new Veiculo("Fiat", "Uno");
		VeiculoService veiculoService = new VeiculoService();

		veiculoService.ligar(veiculo);
		veiculo.setVelocidade(10);
		veiculoService.desligar(veiculo);
	}
}
