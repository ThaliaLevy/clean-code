package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Veiculo;
import main.VeiculoException;
import main.VeiculoService;

public class VeiculoTeste {
	Veiculo veiculo;
	VeiculoService veiculoService;

	@Before
	public void setup() {
		veiculo = new Veiculo("Fiat", "Uno");
		veiculoService = new VeiculoService();
	}

	@Test
	public void deveAcelerarOVeiculo() throws VeiculoException {
		veiculo.setLigado(true);
		veiculo.setVelocidade(40);
		veiculoService.acelerar(veiculo);
		double velocidadeAtualDoVeiculo = veiculo.getVelocidade();

		assertEquals(60, velocidadeAtualDoVeiculo, 0.0001);
	}

	@Test
	public void deveLigarOVeiculo() throws VeiculoException {
		veiculo.setLigado(false);
		veiculoService.ligar(veiculo);
		boolean estadoAtualDoVeiculo = veiculo.isLigado();

		assertEquals(true, estadoAtualDoVeiculo);
	}

	@Test
	public void deveDesligarOVeiculo() throws VeiculoException {
		veiculo.setLigado(true);
		veiculo.setVelocidade(0);
		veiculoService.desligar(veiculo);
		boolean estadoAtualDoVeiculo = veiculo.isLigado();

		assertEquals(false, estadoAtualDoVeiculo);
	}
}
