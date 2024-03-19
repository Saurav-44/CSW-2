package Generics;

public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book(402, "CSW1", 800.0);
        Book b2 = new Book(332, "CSW2", 1000.0);

        System.out.println("Bk 1 Details :");
        System.out.println(b1.toString());

        System.out.println();

        System.out.println("Bk 2 Details :");
        System.out.println(b2.toString());

        System.out.println();

        if(b1.getpr() > b2.getpr()) {
            System.out.println("Bk 1 is expensive than Bk 2.");
        }
        else if(b1.getpr() < b2.getpr()) {
            System.out.println("Bk 2 is expensive than Bk 1.");
        }

        else {
            System.out.println("Both are equal.");
        }

    }
}

class Book {
     int bId;
     String bName;
     double pr;

    public Book(int bId, String bName, double pr) {
        this.bId = bId;
        this. bName =  bName;
        this.pr = pr;
    }

    public int getbId() {
        return bId;
    }

    public String getbName() {
        return bName;
    }

    public double getpr() {
        return pr;
    }



    @Override
    public String toString() {
        return "Book{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", pr=" + pr +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Book b = (Book) o;
        return this.bId == b.bId && this.bName.equals(b.bName) && Double.compare(this.pr, b.pr) ==0;
    }
}
