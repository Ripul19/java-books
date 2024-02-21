package org.example;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        File file = new File(currentDirectory + "\\books.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
        }

        BooksOperations booksOperations = new BooksOperations(file);
        booksOperations.showBookNames();
        booksOperations.showBookDetails();
    }
}
