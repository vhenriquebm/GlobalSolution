package com.globalsolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação da ocorrência
        System.out.print("Olá, qual é o seu relato?: ");
        String description = scanner.nextLine();

        Occurrence occurrence = new Occurrence(
                generateId(),
                description, 
                generateId(), 
                generateId());

        List<Occurrence> occurrences = new ArrayList<>();
        occurrences.add(occurrence);

        // Criação do usuário
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        int userId = generateId();

        User user = new User(name, userId, occurrences);

        // Criação da espécie
        System.out.print("Qual é o nome do animal?: ");
        String commonName = scanner.nextLine();
        System.out.print("Qual é o nome científico?: ");
        String scientificName = scanner.nextLine();
        System.out.print("De qual família é o animal?: ");
        String family = scanner.nextLine();
        System.out.print("Qual é o estado de conservação?: ");
        String conservationStatus = scanner.nextLine();
        System.out.print("Qual é o tipo do seu habitat natural?: ");
        String habitatType = scanner.nextLine();
        System.out.print("Qual é a descrição do seu habitat natural?: ");
        String habitatDescription = scanner.nextLine();

        // Criação do Habitat
        Habitat habitat = new Habitat(generateId(), habitatType, habitatDescription);

        // Captura das informações de migração
        System.out.print("Qual é a data que avistou esse comportamento? (dd/MM/yyyy): ");
        String startDate = scanner.nextLine();
        System.out.print("Até que data durou? (dd/MM/yyyy): ");
        String endDate = scanner.nextLine();
        System.out.print("Qual é o nome da localização original?: ");
        String originalLocationName = scanner.nextLine();
        System.out.print("Latitude?: ");
        double latitude = scanner.nextDouble();
        System.out.print("Longitude?: ");
        double longitude = scanner.nextDouble();
        scanner.nextLine(); // Consumir o newline deixado por nextDouble()
        System.out.print("Descrição do local?: ");
        String originalLocalDescription = scanner.nextLine();

        // Criação da Localização original
        Location originalLocation = new Location(generateId(), originalLocationName, latitude, longitude, originalLocalDescription);

        System.out.print("Qual é a data que ele foi para o outro local? (dd/MM/yyyy): ");
        String startDateDestination = scanner.nextLine();
        System.out.print("Até que data durou? (dd/MM/yyyy): ");
        String endDateDestination = scanner.nextLine();
        System.out.print("Qual é o nome da localização atual?: ");
        String destinationLocationName = scanner.nextLine();
        System.out.print("Latitude?: ");
        double latitudeDestination = scanner.nextDouble();
        System.out.print("Longitude?: ");
        double longitudeDestination = scanner.nextDouble();
        scanner.nextLine(); // Consumir o newline deixado por nextDouble()
        System.out.print("Descrição do local?: ");
        String destinationLocalDescription = scanner.nextLine();

        // Criação da Localização atual
        Location destinationLocation = new Location(generateId(), destinationLocationName, latitudeDestination, longitudeDestination, destinationLocalDescription);

        // Criação da espécie e migração
        Specie specie = new Specie();
        Migration migration = new Migration(generateId(), startDate, endDate, originalLocation, destinationLocation, specie);
        List<Migration> migrations = new ArrayList<>();
        migrations.add(migration);

        specie.setId(generateId());
        specie.setScientificName(scientificName);
        specie.setCommonName(commonName);
        specie.setFamily(family);
        specie.setConservationStatus(conservationStatus);
        specie.setHabitat(habitat);
        specie.setMigrations(migrations);

        System.out.println("\nEspécie cadastrada:");
        System.out.println(specie);

        // Exibição de todas as informações cadastradas
        System.out.println("\n--- Informações Cadastradas ---");
        System.out.println("Usuário:");
        System.out.println(user);
        System.out.println("\nOcorrência:");
        System.out.println(occurrence);
        System.out.println("\nHabitat:");
        System.out.println(habitat);
        System.out.println("\nLocalização Original:");
        System.out.println(originalLocation);
        System.out.println("\nLocalização Destino:");
        System.out.println(destinationLocation);
        System.out.println("\nMigração:");
        System.out.println(migration);

        scanner.close();
    }

    private static int generateId() {
        return (int) (Math.random() * 10000);
    }
}
