package Generics;

public class StudentClass {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student("Dom", 3209, 83.02);
        s[1] = new Student("Starc", 1664, 82.95);
        s[2] = new Student("Arun", 1008, 88.4);
        s[3] = new Student("Bob", 9356, 87.95);

    

        int rn = 02;


        Student res = Student.LSearch(s,rn);

        if(res == null) {
            System.out.println("RollNumb " + rn + " is not found.");
        }
        else {
            System.out.println("Student Nm = " + res.getN());
            System.out.println("RollNo. = " + res.getRn());
            System.out.println("Total_Marks = " + res.getTotMark());
        }

    }
}

class Student implements Comparable<Student> {
     String n;
     int rn;
     double totMark;

    public Student(String n, int rn, double totMark) {
        this.n = n;
        this.rn = rn;
        this.totMark = totMark;
    }

    public String getN() {
        return n;
    }

    public int getRn() {
        return rn;
    }

    public double getTotMark() {
        return totMark;
    }

    public int compareTo(Student s) {
        return Integer.compare(this.rn, s.rn);
    }

    public static Student LSearch(Student[] s, int rn) {
        for(int i = 0 ; i < s.length; i++) {
            if(s[i].rn == rn) {
                return s[i];
            }
        }
        return null;
    }


}
