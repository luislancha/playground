
public class Principal {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.nome = "Honda";
		c1.potencia = 10;
		c1.velocidade = 0;
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				c1.acelerar();
			} else {
				c1.frear();
			}
			
			c1.imprimir(i);
		}
	}
}
