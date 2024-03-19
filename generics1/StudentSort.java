package Generics;

import java.util.Arrays;

public class StudentSort {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student("majin bu", 3209, 83.02);
        s[1] = new Student("Steve", 5664, 82.95);
        s[2] = new Student("David", 1008, 88.4);
        s[3] = new Student("Donald yu", 9356, 87.95);

        bSort(s);

  

        for(int i = 0; i < s.length; i++) {
            System.out.println("Name = " + s[i].getN() + " " +" Roll = " + s[i].getRn());
        }
    }



       public static void bSort(Student[] s) {
        for(int i = 0; i < s.length-1; i++) {
            for(int j = 0; j < s.length-i-1; j++) {
                if(s[j].compareTo(s[j+1]) > 0) {
                    Student t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;

                }
            }
        }
    
    }
}


class Student implements Comparable<Student> {
    String n;
    int rn;
    double totMarks;

    public Student(String n, int rn, double totMarks) {
        this.n = n;
        this.rn = rn;
        this.totMarks = totMarks;
    }

    public String getN() {
        return n;
    }

    public int getRn() {
        return rn;
    }

    public double getTotMark() {
        return totMarks;
    }

    public int compareTo(Student s) {
        return Integer.compare(this.rn, s.rn);
    }

   
    
   
}

