package day36_Inheritance.homework.book;

public class book {

    public String title,type,author;
    public double price;

    public book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;

    }

    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
3. Book Task:
3.1. create a class named Book:
variables:
title, type, author, price
Methods:
setInfo()
toString()




 */