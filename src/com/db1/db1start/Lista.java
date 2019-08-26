package com.db1.db1start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Lista {

	public List<String> retornarListaCores() {
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Branco");
		return cores;
	}

	public int retornarQuantidadeDeItens(List<String> listaDeItens) {
		return listaDeItens.size();
	}

	public List<String> removerValorDaSegundaPosicaoDeUmaLista(String palavra1, String palavra2, String palavra3) {
		List<String> listaDeString = new ArrayList<String>();
		listaDeString.add(palavra1);
		listaDeString.add(palavra2);
		listaDeString.add(palavra3);
		listaDeString.remove(1);
		return listaDeString;
	}

	public List<String> ordenarNomeCores(List<String> listaDeCores) {
		Collections.sort(listaDeCores);
		return listaDeCores;
	}

	public List<String> deveRetornarListaDeCoresSemUmaCor(List<String> listaDeCores, String cor) {
		listaDeCores.remove(cor);
		return listaDeCores;
	}

	public List<String> retornarListaDecrescente(List<String> listaDeStrings) {
		Collections.reverse(listaDeStrings);
		return listaDeStrings;
	}

	public List<List<Integer>> retornarListaParImpar(List<Integer> listaDeNumerosInteiros) {
		List<Integer> listaNumerosPares = new ArrayList<>();
		List<Integer> listaNumerosImpares = new ArrayList<>();
		List<List<Integer>> listaDeNumerosParesImpares = new ArrayList<>();

		// Exemplificando o funcionamento: Integer valor =  numerosInteiros(i), sendo i < numerosInteiros.size();
		for (Integer valor : listaDeNumerosInteiros) { 
			if ((valor % 2) == 0) {
				listaNumerosPares.add(valor);
			}
			listaNumerosImpares.add(valor);
		}
		listaDeNumerosParesImpares.add(listaNumerosPares);
		listaDeNumerosParesImpares.add(listaNumerosImpares);
		return listaDeNumerosParesImpares;
	}

	public Map<String, List<String>> ordenarNomesDistintos(List<String> listaDeNomes) {
		SortedMap<String, List<String>> mapDeNomesSeparados = new TreeMap<String, List<String>>();
		Collections.sort(listaDeNomes);
		for (String nome : listaDeNomes) {
			String letra = nome.substring(0, 1);
			if (!mapDeNomesSeparados.containsKey(letra)) {
				mapDeNomesSeparados.put(letra, new ArrayList<>());
			}
			mapDeNomesSeparados.get(letra).add(nome);
		}
		System.out.println(mapDeNomesSeparados);
		return mapDeNomesSeparados;
	}

	public int retornarSomaDaListaDeNumerosInteiros(List<Integer> listaDeNumerosInteiros) {
		int soma = listaDeNumerosInteiros.stream().mapToInt(Integer::intValue).sum();
		return soma;
	}

	public Double retornarMediaDaListaDeNumerosDouble(List<Double> listaDeNumerosDouble) {
		Double media = (listaDeNumerosDouble.stream().mapToDouble(Double::doubleValue).sum())
				/ listaDeNumerosDouble.size();
		System.out.println(media);
		return media;
	}

	public int buscarMenorValorDeUmaLista(List<Integer> listaDeNumerosInteiros) {
		int menorValor = Collections.min(listaDeNumerosInteiros);
		return menorValor;
	}

	public int buscarMaiorValorDeUmaLista(List<Integer> listaDeNumerosInteiros) {
		int maiorValor = Collections.max(listaDeNumerosInteiros);
		return maiorValor;
	}

	public List<Integer> removerNumerosImpares(List<Integer> listaDeNumerosInteiros) {
		for (int i = 0; i < listaDeNumerosInteiros.size(); i++) {
			if (listaDeNumerosInteiros.get(i) % 2 != 0) {
				listaDeNumerosInteiros.remove(i);
			}
		}
		return listaDeNumerosInteiros;
	}

	public String retornarVogaisDeUmaFrase(String frase) {
		return frase.replaceAll("[^AEIOUaeiou]", "");
	}
}
