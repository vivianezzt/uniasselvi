package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		
		Carro car_1 = new Carro(2, "Fusion");
		Carro car_2 = new Carro(3, "Creta");
		Carro car_3 = new Carro(4, "Onix");
		Carro car_4 = new Carro(5, "Pálio");
		
		List<Carro> list = new ArrayList<Carro>();
		
		list.add(car_1);
		list.add(car_2);
		list.add(car_3);
		list.add(car_4);
		
		Collections.sort(list);
		for(Carro carro : list) {
			System.out.println("Modelo do Carro: " + carro.getModelo());
		}

	}

}
