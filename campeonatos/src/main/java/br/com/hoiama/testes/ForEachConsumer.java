package br.com.hoiama.testes;

import java.util.function.Consumer;

class ForEachConsumer implements Consumer<String>{

	@Override
	public void accept(String s1) {
		System.out.println("Class consumer: " + s1);
	}
	
}
