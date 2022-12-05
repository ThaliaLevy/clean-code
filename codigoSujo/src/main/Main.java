package main;

public class Main {

	public static void main(String[] args) {
		
	String MARCA;
	String MODELO;
	int VEL = 0;
	boolean LIGADO = false;
			
	VeiculoService veiculoService = new VeiculoService();

	LIGADO = veiculoService.ligando(LIGADO);
	LIGADO = veiculoService.desativar(LIGADO, VEL);
	veiculoService.acelerar(LIGADO, VEL);

	}
}
