package entities;

public class Carro implements Comparable<Carro>{
	
	private int qPortas;
	private String modelo;
	
	public Carro(int qPortas, String modelo) {
		super();
		this.qPortas = qPortas;
		this.modelo = modelo;
	}

	public int getqPortas() {
		return qPortas;
	}

	public void setqPortas(int qPortas) {
		this.qPortas = qPortas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int compareTo(Carro car) {
		return this.getModelo().compareTo(car.getModelo());
	}
	
	
}
