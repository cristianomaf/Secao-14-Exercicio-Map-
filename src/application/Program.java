package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import entities.Candidato;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho do arquivo:");
		String caminho = sc.nextLine();
		
		try(BufferedReader  br = new BufferedReader(new FileReader(caminho))) {
			Map<String, Integer> votacao = new TreeMap<>();
			
			String linha = br.readLine(); // leitura do arquivo
		
			while(linha != null){
				String [] campos = linha.split(",");
				//captura os dois valores do arquivo csv
				String candidato = campos[0];
				int qtdVotos = Integer.parseInt(campos[1]);
				
				
				if(votacao.containsKey(candidato)) {
					int votosAteAgora = votacao.get(candidato);
					votacao.put(candidato,qtdVotos + votosAteAgora);
					}else {
						votacao.put(candidato,qtdVotos);
					}
				linha = br.readLine();
			}
			for (String a: votacao.keySet()) {
				System.out.println(a + ": " +votacao.get(a));
				
				
				
				
			}
			
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
			
		
		sc.close();

	}
}
