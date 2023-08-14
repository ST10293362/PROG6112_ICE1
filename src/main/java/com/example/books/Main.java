package com.example.books;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    String title;
    String author;
    int number;
    int num;
    num = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1 " +" Add Book" +"\n2" +" Display all Books in the Library" +"\n3" +" Search for a book By title" +"\n4" +" Remove a book bt title" +"\n5" +" Exit the program"));
    BOOKS books = new BOOKS();

    switch (num) {
        case 1:
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "How many books would you like to add? "));
            for(int i = 0; i < number; i++) {
                title = JOptionPane.showInputDialog(null, "Title: ");
                author = JOptionPane.showInputDialog(null, "Author: ");
                books.addBook(title, author);
            }
            break;
        case 2:
            books.displayLibrary();
            break;
        case 3:
            title = JOptionPane.showInputDialog(null, "Please enter the title of the book you are looking for? ");
            books.searchByTitle(title);
            break;
        case 4:
            title = JOptionPane.showInputDialog(null, "Please enter the title of the book you wish to remove? ");
            books.removeBook(title);
            break;
        case 5:

            break;
            }
}


    }
