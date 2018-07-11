
public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar () {
		velocidade = velocidade + potencia;
	}
	
	void frear () {
		velocidade = velocidade/2;
	}
	
	int getVelocidade () {
		return velocidade;
	}
	
	void imprimir (int i) {
		System.out.println("O carro \"" + nome + "\" está na velocidade: " + getVelocidade() + " km/h na volta " + i);
	}
	
}
