package com.example.books;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BOOKS {
    private String title;
    private String author;
    private List<String> authors;

    private List<String> titles;
    
    public BOOKS() {

        titles = new ArrayList<>();
        authors = new ArrayList<>();
    }

    public String addBook(String title, String author) {

        titles.add(title);
        authors.add(author);
        
        return null;

    }

    public String displayLibrary() {
        JOptionPane.showMessageDialog(null, "All of the Books are: ");
        for (int i = 0; i < titles.size(); i++) { //this loop is used to display all the tasks
            JOptionPane.showMessageDialog(null, "BOOKS: " + titles.get(i) + "\n" + authors.get(i));
        }
        return null;

    }

    public String searchByTitle(String title) {
        int index = titles.indexOf(title);
        if (index != -1) {
            JOptionPane.showMessageDialog(null, "Book: " + "Title: " + titles + "\n" + "author: " + authors);
        } else {
            JOptionPane.showMessageDialog(null, "The searched Book could not be found.");
        }
        return null;

    }

    public String removeBook(String title) {
        int index = titles.indexOf(title);
        if (index != -1) {
            titles.remove(index);
            authors.remove(index);
        }
        return null;

    }
}
