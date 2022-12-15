package day36_Inheritance.homework.book;

public class AudioBook extends book {

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }
    public void listen(){
        System.out.println("listening " +title);
    }
}
/*
3.3 Create a sub class of Book named AudioBook:
variables:
title, type, author, price, length,
narrator
Methods:
setInfo()
listen()
toString()
 */