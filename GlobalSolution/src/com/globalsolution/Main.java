package com.globalsolution;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Criação do usuário
		System.out.print("Digite seu nome: ");
		String userName = scanner.nextLine();
		int userId = generateId();
		User user = new User(userName, userId);

		// Criacao da ocorrencia
		System.out.print("Qual é a sua ocorrencia: ");
		int ocurrenceId = generateId();
		String description = scanner.nextLine();
		System.out.print("Qual é o código do animnal: ");
		int animalSpeciesId = scanner.nextInt();

		Occurrence occurrence = new Occurrence(ocurrenceId, description, animalSpeciesId, userId);

		System.out.println("Cadastro de nova espécie:");
		System.out.print("ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nome científico: ");
		String scientificName = scanner.nextLine();
		System.out.print("Nome comum: ");
		String commonName = scanner.nextLine();
		System.out.print("Família: ");
		String family = scanner.nextLine();
		System.out.print("Status de conservação: ");
		String conservationStatus = scanner.nextLine();
		System.out.print("Tipo de habitat: ");
		String habitatType = scanner.nextLine();
		System.out.print("Descrição do habitat: ");
		String habitatDescription = scanner.nextLine();

		Habitat habitat = new Habitat(id, habitatType, habitatDescription);

		List<Migration> migrations = new ArrayList<>();

		Specie species = new Specie(id, scientificName, commonName, family, conservationStatus, habitat, migrations);

		System.out.println("\nEspécie cadastrada:");
		System.out.println(species);

		scanner.close();
	}

	private static int generateId() {
		return 1;
	}
}
