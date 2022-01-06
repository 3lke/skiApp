package com.accenture.villakunterbunt.books;

import java.sql.SQLOutput;

public class Bookshelf {

    public static void main(String[] args) {

        /*
        Book[] books = new Book[3];
        Book book1 = new Book();
        books[0] = book1;
        */

        Book book1 = new Book();
        book1.author = "Arthur C. Clarke";
        book1.title = "2001: A Space Odyssey";
        book1.numberOfPages = 205;
        book1.publishedAt = 1970;

        Book book2 = new Book();
        book2.author = "Shakespeare";
        book2.title = "Romeo & Julia";
        book2.numberOfPages = 1220;
        book2.publishedAt = 1562;

        //book2.printBookInformation();

        Book book3 = new Book();
        book3.author = "Philip Pullman";
        book3.title = "His Dark Materials";
        book3.numberOfPages = 1234;
        book3.publishedAt = 1995;

        Book[] books = new Book[]{
                book1, book2, book3
        };

        for (Book book : books) {
            book.printBookInformation();
        }

        // book3.printBookInformation();

        /*
        System.out.println(
            book3.title + " (" + book3.author + ") " +
            "Pages: " + book3.numberOfPages + ", First published: " +
            book3.publishedAt);
        */
    }
}
