package cw5.zad1;

import java.io.*;
import java.util.*;

public class Main {
    private static final String FILE_NAME = "purchase.txt";

    private static final String RESULT_FILE_NAME = "purchaseResult.txt";
    public static void main(String[] args) {
        try {
            Map<String, List<Purchase>> purchaseMap = readFromFile(FILE_NAME);
            Set<Map.Entry<String, List<Purchase>>> entries = purchaseMap.entrySet();
            for (Map.Entry<String, List<Purchase>> entry : entries) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            String stats = stats(purchaseMap);
            System.out.println(stats);
            writeStatsToFile(stats);
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku: " + FILE_NAME);
        }
    }

    private static void writeStatsToFile(String stats) {
        try (FileWriter fileWriter = new FileWriter(RESULT_FILE_NAME);
             BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            writer.write(stats);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String stats(Map<String, List<Purchase>> purchaseMap) {
        Set<Map.Entry<String, List<Purchase>>> entries = purchaseMap.entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Purchase>> entry : entries) {
            sb.append(entry.getKey()).append(" ");
            sb.append(entry.getValue().size()).append(" ");
            sb.append(differentProductsCounter(entry)).append(" ");
            sb.append(sumCounter(entry));
            sb.append("\n");
        }
        return sb.toString();
    }

    private static int sumCounter(Map.Entry<String, List<Purchase>> entry) {
        List<Purchase> purchaseList = entry.getValue();
        int priceSum = 0;
        for (Purchase purchase : purchaseList) {
            priceSum += purchase.getPrice();
        }
        return priceSum;
    }

    private static int differentProductsCounter(Map.Entry<String, List<Purchase>> entry) {
        List<Purchase> purchaseList = entry.getValue();
        Set<Purchase> purchaseSet = new HashSet<>(purchaseList);
        return purchaseSet.size();
    }

    static Map<String, List<Purchase>> readFromFile(String filename) throws FileNotFoundException {
        Map<String, List<Purchase>> purchaseMap = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(" ");
                String keyName = data[0];
                Purchase purchase = new Purchase(data[1], Integer.parseInt(data[2]));
                if (purchaseMap.containsKey(keyName)) {
                    purchaseMap.get(keyName).add(purchase);
                } else {
                    List<Purchase> purchaseList = new ArrayList<>();
                    purchaseList.add(purchase);
                    purchaseMap.put(keyName, purchaseList);
                }
            }
        }
        return purchaseMap;
    }
}
