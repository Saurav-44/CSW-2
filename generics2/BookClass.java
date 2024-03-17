import java.util.HashMap;
import java.util.Iterator;

public class BookClass {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook(1,new Book(1243, "Harry Potter", "J.K Rowling", 2));
        lb.addBook(2,new Book(2521, "The India Story", "Bimal Jalal", 3));

        lb.display();

        String searchBook = "Harry Potter";
        System.out.println(lb.isContainsBk(searchBook));

         lb.remove(1);
         lb.display();

    }
}

class Book {
    int id;
     String name;
    String author;
    int quantity;
   

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;

        
    }

    public int getId() {
        return id;
    }

    public  String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity;
    }
    
}

class Library {
    HashMap<Integer,Book> bks;

    public Library() {
        this.bks = new HashMap<>();
    }

    public void addBook(int key, Book bk) {
        bks.put(key, bk);
    }

    public void display() {
    //    for(Integer key : bks.keySet()) {
    //     System.out.println("Key = " + key + " Val = " + bks.get(key));
    //    }

       Iterator<Integer> it = bks.keySet().iterator();
       while (it.hasNext()) {
        int key = it.next();
        Book val = bks.get(key);
        System.out.println(key + " " + val);
       }
    }

    public boolean isContainsBk(String bookN) {
        for(Book bk : bks.values()) {
            if(bookN.equals(bk.getName())) {
                return true;
            }
        }
        return false;
    }

    public void remove(int key)  {
        bks.remove(key);
    }
}
