package com.accenture.villakunterbunt.books;

public class Book extends Object {

    String title;
    String author;
    int publishedAt; // 1999
    int numberOfPages;

    Publisher publisher;
    /**
     * asdfasdfsdf
     */
    public void printBookInformation() {
        System.out.println(
            title + " (" + author + ") " +
            "Pages: " + numberOfPages + ", First published: " +
            publishedAt);
    }
}
