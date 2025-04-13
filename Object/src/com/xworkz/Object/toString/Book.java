package com.xworkz.Object.toString;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', pages=" + pages + "}";
    }
    @Override
    public int hashCode() {
        return 9;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Book) {
                System.out.println("Comparing!!!!!!");
                Book book = this;
                Book book1 = (Book) obj;
                if(book.title.equals(book1.title)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
