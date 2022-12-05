package main;

public class VeiculoService {

	/* Boas práticas demonstradas: 
	 * - Exemplo sobre nomes intuitivos de funções;
	 * - Código pode ser lido como uma narrativa;
	 * - Parâmetros foram reduzidos a um objeto;
	 * - Validações extraídas para outras funções;
	 * - Alterar valor de um atributo somente depois de validar corretamente; 
	 * - Nome de booleano deve estar fazendo uma pergunta;
	 * - Indentação até nível 2;
	 * - Possível pegadinha: testes unitários.
	 */
	
	public void ligar(Veiculo veiculo) throws VeiculoException {
		if (estaLigado(veiculo))
			throw new VeiculoException("Veículo já está ligado.");
		
		veiculo.setLigado(true);
	}

	public void desligar(Veiculo veiculo) throws VeiculoException {
		if (!estaLigado(veiculo))
			throw new VeiculoException("Veículo já está desligado.");

		if (veiculo.getVelocidade() != 0)
			throw new VeiculoException("Não é possível desligar o veículo em movimento.");

		veiculo.setLigado(false);
	}

	public void acelerar(Veiculo veiculo) throws VeiculoException {
		if (!estaLigado(veiculo))
			throw new VeiculoException("Veículo está desligado.");

		veiculo.setVelocidade(veiculo.getVelocidade() + 20);
	}

	private boolean estaLigado(Veiculo veiculo) {
		if (veiculo.isLigado())
			return true;
		return false;
	}
}
