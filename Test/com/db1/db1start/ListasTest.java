package com.db1.db1start;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListasTest {

	private List<String> listaDeCores;
	private List<String> listaDeItens;
	private List<String> listaDeStrings;
	private List<Integer> listaDeNumerosInteiros;
	private List<Double> listaDeNumerosDouble;
	private List<String> listaDeNomes;
	
	@Before
	public void SetUp() {
		listaDeCores = new ArrayList<String>();
		listaDeCores.add("Azul");
		listaDeCores.add("Branco");
		
		listaDeItens = new ArrayList<String>();
		listaDeItens.add("Pedra");
		listaDeItens.add("Pocao");
		listaDeItens.add("Runa");
		listaDeItens.add("Lampada");
		
		listaDeStrings = new ArrayList<String>();
		listaDeStrings.add("Papel");
		listaDeStrings.add("Caneta");
		listaDeStrings.add("Borracha");
		
		listaDeNumerosInteiros = new ArrayList<>();
		listaDeNumerosInteiros.add(1);
		listaDeNumerosInteiros.add(2);
		listaDeNumerosInteiros.add(3);
		listaDeNumerosInteiros.add(4);

		listaDeNumerosDouble = new ArrayList<>();
		listaDeNumerosDouble.add(10.5);
		listaDeNumerosDouble.add(15.8);
		listaDeNumerosDouble.add(85.4);
		
		listaDeNomes = new ArrayList<String>();
		listaDeNomes.add("JOSE");
		listaDeNomes.add("JOALDO");
		listaDeNomes.add("ANA");
		listaDeNomes.add("VAGNER");
		listaDeNomes.add("CLECIO");
		listaDeNomes.add("MARIA");
		listaDeNomes.add("RODOLPHO");
		listaDeNomes.add("ANA LAURA");
		listaDeNomes.add("MARCOS");
		listaDeNomes.add("RODOLFO");
		listaDeNomes.add("ROBERVAL");
		listaDeNomes.add("WAGNER");
		listaDeNomes.add("JOSÉ");
		listaDeNomes.add("JOSÉ");	
	}
	
	@Test
	public void deveRetornarNomeCores() {
		Listas coresQueMaisGosta = new Listas();
		List<String> retorneNomeCores = coresQueMaisGosta.nomeCores(); 		
		Assert.assertTrue(retorneNomeCores.contains("Azul"));
		Assert.assertTrue(retorneNomeCores.contains("Branco"));
	}
	
	@Test
	public void deveRetornarQuantidadeItens() {
		Listas itens = new Listas();
		int quantidadeItens = itens.retornarQuantidadeDeItens(listaDeItens);
		Assert.assertEquals(4, quantidadeItens);
	}
	
	@Test
	public void removeValorDaSegundaPosicaoDeUmaLista() {
		Listas palavras = new Listas();
		List<String> retornarListaDeString = palavras.removerValorDaSegundaPosicaoDeUmaLista("DB1", "Curso", "JAVA");
		Assert.assertEquals(2, retornarListaDeString.size());
		Assert.assertEquals("DB1", retornarListaDeString.get(0));
		Assert.assertEquals("JAVA", retornarListaDeString.get(1));	
	}
	
	@Test
	public void deveordenarNomeCores() {
		Listas cores = new Listas();
		List<String> retornarListaDeCoresOrdenados = cores.ordenarNomeCores(listaDeCores);
		Assert.assertEquals(2, retornarListaDeCoresOrdenados.size());
		Assert.assertEquals("Azul", retornarListaDeCoresOrdenados.get(0));
		Assert.assertEquals("Branco", retornarListaDeCoresOrdenados.get(1));	
	}
	
	@Test
	public void deveRetornarListaDeCoreSemUmaCor() { 		
		Listas cores = new Listas();
		List<String> listaDeCoresEsperada = listaDeCores;
		listaDeCoresEsperada.remove("Azul");
		List<String> listaDeCoresSemUmaCor = cores.deveRetornarListaDeCoresSemUmaCor(listaDeCores, "Azul");
		Assert.assertEquals(listaDeCoresEsperada, listaDeCoresSemUmaCor);
		Assert.assertEquals(listaDeCoresEsperada, listaDeCoresSemUmaCor);
	}
	
	@Test
	public void deveRetornarListaDecrescente() {
		Listas listaString = new Listas();
		List<String> listaDecrescente = listaString.retornarListaDecrescente(listaDeStrings);
		Assert.assertEquals(3, listaDecrescente.size());
		Assert.assertEquals("Borracha", listaDecrescente.get(0));
		Assert.assertEquals("Caneta", listaDecrescente.get(1));
		Assert.assertEquals("Papel", listaDecrescente.get(2));
	}
	
	@Test
	public void retorneListaParImpar() {
		Listas listaDeNumeros = new Listas();
		List<List<Integer>> listaComNumerosParesImpares = listaDeNumeros.listaParImpar(listaDeNumerosInteiros);
		List<Integer> listaPar = listaComNumerosParesImpares.get(0);
		List<Integer> listaImpar = listaComNumerosParesImpares.get(1);
		Assert.assertEquals(2, listaComNumerosParesImpares.size());
		Assert.assertEquals(2, listaPar.get(0), 0);
		Assert.assertEquals(1, listaImpar.get(0), 0);
	}
	
	@Test
	public void deveExibirNomesDistintosOrdenados() {
		Listas listaDeNomesDistintos = new Listas();
		Map <String, List<String>> mapDeNomesOrdenadosPeloPrimeiroCaracter = listaDeNomesDistintos.ordenarNomesDistintos(listaDeNomes);
		List<String> letraA = mapDeNomesOrdenadosPeloPrimeiroCaracter.get("A");
		List<String> letraC = mapDeNomesOrdenadosPeloPrimeiroCaracter.get("C");
		List<String> letraJ = mapDeNomesOrdenadosPeloPrimeiroCaracter.get("J");
		List<String> letraM = mapDeNomesOrdenadosPeloPrimeiroCaracter.get("M");
		List<String> letraR = mapDeNomesOrdenadosPeloPrimeiroCaracter.get("R");
		List<String> letraV = mapDeNomesOrdenadosPeloPrimeiroCaracter.get("V");
		List<String> letraW = mapDeNomesOrdenadosPeloPrimeiroCaracter.get("W");
		Assert.assertEquals(7, mapDeNomesOrdenadosPeloPrimeiroCaracter.size());
		Assert.assertEquals(letraA, mapDeNomesOrdenadosPeloPrimeiroCaracter.get("A"));
		Assert.assertEquals(letraC, mapDeNomesOrdenadosPeloPrimeiroCaracter.get("C"));
		Assert.assertEquals(letraJ, mapDeNomesOrdenadosPeloPrimeiroCaracter.get("J"));
		Assert.assertEquals(letraM, mapDeNomesOrdenadosPeloPrimeiroCaracter.get("M"));
		Assert.assertEquals(letraR, mapDeNomesOrdenadosPeloPrimeiroCaracter.get("R"));
		Assert.assertEquals(letraV, mapDeNomesOrdenadosPeloPrimeiroCaracter.get("V"));
		Assert.assertEquals(letraW, mapDeNomesOrdenadosPeloPrimeiroCaracter.get("W"));
	}
	
	@Test
	public void deveRetornarSoma() { 	
		Listas listaDeNumeros = new Listas();
		int soma = listaDeNumeros.retornarSomaDaListaDeNumerosInteiros(listaDeNumerosInteiros);
		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void deveRetornarMedia() { 	
		Listas listaDeNumeros = new Listas();
		Double media = listaDeNumeros.retornarMediaDaListaDeNumerosDouble(listaDeNumerosDouble);
		Assert.assertEquals(37.23, media, 0.22);
	}
	
	@Test
	public void deveRetornarMenorValorDeUmaLista() { 	
		Listas listaDeNumeros = new Listas();
		int menorValorDaLista = listaDeNumeros.buscarMenorValorDeUmaLista(listaDeNumerosInteiros);
		Assert.assertEquals(1, menorValorDaLista);
	}
	
	@Test
	public void deveRetornarMaiorValorDeUmaLista() { 	
		Listas listaDeNumeros = new Listas();
		int maiorValorDaLista = listaDeNumeros.buscarMaiorValorDeUmaLista(listaDeNumerosInteiros);
		Assert.assertEquals(4, maiorValorDaLista);
	}
	
	@Test
	public void deveRemoverNumerosImparesDeUmaLista() { 	
		Listas listaDeNumeros = new Listas();
		List<Integer> numerosImparesRemovidos = listaDeNumeros.removerNumerosImpares(listaDeNumerosInteiros);
		Assert.assertEquals(2, numerosImparesRemovidos.size());
		Assert.assertEquals(2, numerosImparesRemovidos.get(0), 0);
		Assert.assertEquals(4, numerosImparesRemovidos.get(1), 0);
	}
	
	@Test
	public void deveRetornarAsVogaisDeUmaFrase() { 	
		Listas frase = new Listas();
		String vogais = frase.retornarVogaisDeUmaFrase("Curso de JAVA");
		Assert.assertEquals("uoeAA", vogais);
	}
}
