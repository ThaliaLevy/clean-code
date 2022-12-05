package main;

public class VeiculoService {

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
