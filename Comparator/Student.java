package Comparator;

import java.util.*;

public class Student {
    int marks;
    int rollNumber;

    Student(int marks, int rollNumber) {
        this.marks = marks;
        this.rollNumber = rollNumber;

    }
    public String toString(){
        return "Student [marks=" + marks + ", rollNumber=" + rollNumber + "]";
    };

    public static void main(String[] args) {
       List<Student> l = new ArrayList<>();
       l.add(new Student(12,20));
       l.add(new Student(92, 1));
       l.add(new Student(45, 9));
       l.add(new Student(45, 5));
       l.add(new Student(76, 2));
       l.add(new Student(53, 16));

       Comparator<Student> cmp=new Comparator<>(){
            public int compare(Student obj1,Student obj2){
                int mark1=obj1.marks;
                int mark2=obj2.marks;
                if(mark1==mark2){
                    return obj1.rollNumber-obj2.rollNumber;
                }
                else{
                    return mark2-mark1;
                }
            }
       };

       Collections.sort(l,cmp);
       for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
       }
    }
}
