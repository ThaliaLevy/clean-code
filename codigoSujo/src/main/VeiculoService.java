package main;

public class VeiculoService {

	public boolean ligando(boolean ligado) {
		if (!ligado) {
			return true;
		} else {
			System.out.println("Veículo já está ligado.");
			return true;
		}
	}

	public boolean desativar(boolean ligado, int vel) {
		if (ligado) {
			if (vel == 0) {
				return false;
			} else {
				System.out.println("Não é possível desligar o veículo em movimento.");
				return true;
			}
		} else {
			System.out.println("Veículo já está desligado.");
			return false;
		}
	}
	
	public int acelerar(boolean ligado, int vel) {
		if (ligado) {
			return vel + 20;
		} else {
			System.out.println("Veículo está desligado.");
			return 0;
		}
	}
}
