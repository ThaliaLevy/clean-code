package main;

public class Main {

	public static void main(String[] args) throws VeiculoException {
		Veiculo veiculo = new Veiculo("Fiat", "Uno");
		VeiculoService veiculoService = new VeiculoService();

		veiculoService.ligar(veiculo);
		veiculo.setVelocidade(10);
		veiculoService.desligar(veiculo);
	}
}
