package com.company;

// Implement a library using the java classes
// Methods: addBook, issueBook, retBook, showAvailableBooks
// Properties: Array to store the issues books, Array to store the available books.


import java.util.Scanner;

class Library{
    Scanner sc = new Scanner(System.in);
    String[] availBooks = {"The Bible", "Harry Potter series", "The Lord of the Rings", "The Alchemist", "The Da Vinci Code", "The Twilight Saga", "You Can Win", "Diary of a Young Girl"};
    int n = availBooks.length;
    String[] issuedBooks = new String[8];
    public void addBook(){
        System.out.println("Enter the name of the book you want to add: ");
        String add = sc.nextLine();
        System.out.println("The book " + add + " has been added to the library");
    }
    public void issueBook(){
        System.out.println("Enter the name of the book you want to issue: ");
        String issue = sc.nextLine();
        int i = 0;
        issuedBooks[i] = issue;
        System.out.println("The book " + issue + " has been issued to you.");
    }
    public void retBook(){
        System.out.println("Enter the name of the book you want to return: ");
        String ret = sc.nextLine();
        System.out.println("The book " + ret + " has been returned by you.");
    }
    public void showAvailableBooks(){
        System.out.println("Available Books in the library are: ");
        for(int i = 0; i < n; i++){
            System.out.println(i+1 + ". " + availBooks[i]);
        }
    }
    public void showIssuedBooks(){
        System.out.println("Issued Books from the library are: ");
        for(int i = 0; i < 8; i++){
            System.out.println(i+1 + issuedBooks[i]);
        }
    }
}
public class LibraryQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        System.out.println("You can access the following functions in the library:");
        System.out.println("1. Show available Books. \n2. Add a book. \n3. Issue a book. \n4. Return a book. \n5. Show issued books.");
        System.out.println("Enter any of the serial number to access the function associated with it:");
        int f = sc.nextInt();
        if(f==1){
            l.showAvailableBooks();
        }
        else if(f==2){
            l.addBook();
        }
        else if(f==3){
            l.issueBook();
        } else if(f==4){
            l.retBook();
        }
        else if(f==5){
            l.showIssuedBooks();
        }
        else{
            System.out.println("Please enter a valid function");
        }
    }
}
