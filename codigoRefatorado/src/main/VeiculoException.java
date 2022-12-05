package main;

public class VeiculoException extends Exception {
	private static final long serialVersionUID = 1L;

	public VeiculoException(String mensagem) {
		System.out.println(mensagem);
	}
}
