package day13;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
class MyBook extends Book{
    int price;
    MyBook(String title, String author, int price ){
        super(title, author);
        this.price = price;
    }
    
    void display(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ price);
    }
}    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
// End class
/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input

The following input from stdin is handled by the locked stub code in your editor:

The Alchemist
Paulo Coelho
248
Sample Output

The following output is printed by your display() method:

Title: The Alchemist
Author: Paulo Coelho
Price: 248
 * 
 */
public class Solution {
	   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
