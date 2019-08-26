package com.db1.db1start;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaTest {

	private List<String> listaDeCores;
	private List<String> listaDeItens;
	private List<String> listaDeStrings;
	private List<Integer> listaDeNumerosInteiros;
	private List<Double> listaDeNumerosDouble;
	private List<String> listaDeNomes;
	
	@Before
	public void SetUp() {
		listaDeCores = new ArrayList<>();
		listaDeCores.add("Azul");
		listaDeCores.add("Branco");
		
		listaDeItens = new ArrayList<>();
		listaDeItens.add("Pedra");
		listaDeItens.add("Pocao");
		listaDeItens.add("Runa");
		listaDeItens.add("Lampada");
		
		listaDeStrings = new ArrayList<>();
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
		
		listaDeNomes = new ArrayList<>();
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
		Lista cores = new Lista();
		List<String> nomeCores = cores.retornarListaCores(); 		
		Assert.assertTrue(nomeCores.contains("Azul"));
		Assert.assertTrue(nomeCores.contains("Branco"));
	}
	
	@Test
	public void deveRetornarQuantidadeItens() {
		Lista itens = new Lista();
		int quantidadeItens = itens.retornarQuantidadeDeItens(listaDeItens);
		Assert.assertEquals(4, quantidadeItens);
	}
	
	@Test
	public void removeValorDaSegundaPosicaoDeUmaLista() {
		Lista palavras = new Lista();
		List<String> retornarListaDeString = palavras.removerValorDaSegundaPosicaoDeUmaLista("DB1", "Curso", "JAVA");
		Assert.assertEquals(2, retornarListaDeString.size());
		Assert.assertEquals("DB1", retornarListaDeString.get(0));
		Assert.assertEquals("JAVA", retornarListaDeString.get(1));	
	}
	
	@Test
	public void deveordenarNomeCores() {
		Lista cores = new Lista();
		List<String> retornarListaDeCoresOrdenados = cores.ordenarNomeCores(listaDeCores);
		Assert.assertEquals(2, retornarListaDeCoresOrdenados.size());
		Assert.assertEquals("Azul", retornarListaDeCoresOrdenados.get(0));
		Assert.assertEquals("Branco", retornarListaDeCoresOrdenados.get(1));	
	}
	
	@Test
	public void deveRetornarListaDeCoreSemUmaCor() { 		
		Lista cores = new Lista();
		List<String> listaDeCoresEsperada = listaDeCores;
		listaDeCoresEsperada.remove("Azul");
		List<String> listaDeCoresSemUmaCor = cores.deveRetornarListaDeCoresSemUmaCor(listaDeCores, "Azul");
		Assert.assertEquals(listaDeCoresEsperada, listaDeCoresSemUmaCor);
		Assert.assertEquals(listaDeCoresEsperada, listaDeCoresSemUmaCor);
	}
	
	@Test
	public void deveRetornarListaDecrescente() {
		Lista listaString = new Lista();
		List<String> listaDecrescente = listaString.retornarListaDecrescente(listaDeStrings);
		Assert.assertEquals(3, listaDecrescente.size());
		Assert.assertEquals("Borracha", listaDecrescente.get(0));
		Assert.assertEquals("Caneta", listaDecrescente.get(1));
		Assert.assertEquals("Papel", listaDecrescente.get(2));
	}
	
	@Test
	public void retorneListaParImpar() {
		Lista listaDeNumeros = new Lista();
		List<List<Integer>> listaComNumerosParesImpares = listaDeNumeros.retornarListaParImpar(listaDeNumerosInteiros);
		List<Integer> listaPar = listaComNumerosParesImpares.get(0);
		List<Integer> listaImpar = listaComNumerosParesImpares.get(1);
		Assert.assertEquals(2, listaComNumerosParesImpares.size());
		Assert.assertEquals(2, listaPar.get(0), 0);
		Assert.assertEquals(1, listaImpar.get(0), 0);
	}
	
	@Test
	public void deveExibirNomesDistintosOrdenados() {
		Lista listaDeNomesDistintos = new Lista();
		Map <String, List<String>> mapDeNomesOrdenadosPeloPrimeiroCaracter = listaDeNomesDistintos.ordenarNomesDistintos(listaDeNomes);
		List<String> letraA = List.of("ANA", "ANA LAURA");
		List<String> letraC = List.of("CLECIO");
		List<String> letraJ = List.of("JOALDO", "JOSE", "JOSÉ", "JOSÉ");
		List<String> letraM = List.of("MARCOS", "MARIA");
		List<String> letraR = List.of("ROBERVAL", "RODOLFO", "RODOLPHO");
		List<String> letraV = List.of("VAGNER");
		List<String> letraW = List.of("WAGNER");
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
		Lista listaDeNumeros = new Lista();
		int soma = listaDeNumeros.retornarSomaDaListaDeNumerosInteiros(listaDeNumerosInteiros);
		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void deveRetornarMedia() { 	
		Lista listaDeNumeros = new Lista();
		Double media = listaDeNumeros.retornarMediaDaListaDeNumerosDouble(listaDeNumerosDouble);
		Assert.assertEquals(37.23, media, 0.02);
	}
	
	@Test
	public void deveRetornarMenorValorDeUmaLista() { 	
		Lista listaDeNumeros = new Lista();
		int menorValorDaLista = listaDeNumeros.buscarMenorValorDeUmaLista(listaDeNumerosInteiros);
		Assert.assertEquals(1, menorValorDaLista);
	}
	
	@Test
	public void deveRetornarMaiorValorDeUmaLista() { 	
		Lista listaDeNumeros = new Lista();
		int maiorValorDaLista = listaDeNumeros.buscarMaiorValorDeUmaLista(listaDeNumerosInteiros);
		Assert.assertEquals(4, maiorValorDaLista);
	}
	
	@Test
	public void deveRemoverNumerosImparesDeUmaLista() { 	
		Lista listaDeNumeros = new Lista();
		List<Integer> numerosImparesRemovidos = listaDeNumeros.removerNumerosImpares(listaDeNumerosInteiros);
		Assert.assertEquals(2, numerosImparesRemovidos.size());
		Assert.assertEquals(2, numerosImparesRemovidos.get(0), 0);
		Assert.assertEquals(4, numerosImparesRemovidos.get(1), 0);
	}
	
	@Test
	public void deveRetornarAsVogaisDeUmaFrase() { 	
		Lista frase = new Lista();
		String vogais = frase.retornarVogaisDeUmaFrase("Curso de JAVA");
		Assert.assertEquals("uoeAA", vogais);
	}
}
