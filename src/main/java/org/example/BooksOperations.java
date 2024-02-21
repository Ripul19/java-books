package org.example;

import java.io.*;

public class BooksOperations {

    private final File file;
    public BooksOperations(File file) {
        this.file = file;
    }

    public void showBookNames() {
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Books Name: ");

            String bookEntry;
            while((bookEntry = br.readLine()) != null){
                String[] book = bookEntry.split(",");
                System.out.println(book[0]);
            }
            System.out.println("-----");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void showBookDetails(){
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Books Details: ");

            String bookEntry;
            while((bookEntry = br.readLine()) != null){
                String[] book = bookEntry.split(",");
                System.out.println("Book Name: " + book[0]);
                System.out.println("Author: " + book[1]);
                System.out.println("Publication: " + book[2]);
                System.out.println("Number of Pages: " + book[3]);
                System.out.println("-----");
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
