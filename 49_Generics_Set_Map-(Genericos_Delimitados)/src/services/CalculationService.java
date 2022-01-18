package services;

import java.util.List;

public class CalculationService {

	// List<T> - Tipo T qualquer 
	// T max - Retorna objeto do tipo T
	// <T> -  Vou trabalhar com elemento do tipo T. ( não estou parametrizando a classe)
	// <T extends Comparable<T>> - Especifica que o tipo T é um tipo comparable (para usar compareTo)
	// public static <T extends Comparable<? super T>> T max(List<T> list) - versao completa - serve para que a  super classe de produto herde o compareTo  
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		} 
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}