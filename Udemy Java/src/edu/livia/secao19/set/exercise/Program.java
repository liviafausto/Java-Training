package edu.livia.secao19.set.exercise;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args){

        Set<User> courseA = new HashSet<>();
        courseA.add(new User(21, "Maria"));
        courseA.add(new User (35, "Jack"));
        courseA.add(new User(22, "John"));
        System.out.print("Course A: ");
        for(User u : courseA){
            System.out.print(u + " ");
        }
        System.out.println();

        Set<User> courseB = new HashSet<>();
        courseB.add(new User(21, "Maria"));
        courseB.add(new User(50, "Sarah"));
        courseB.add(new User (50, "Amanda"));
        System.out.print("Course B: ");
        for(User u : courseB){
            System.out.print(u + " ");
        }
        System.out.println();


        Set<User> courseC = new HashSet<>();
        courseC.add(new User(42, "Peter"));
        courseC.add(new User (35, "Jack"));
        courseC.add(new User(13, "Rae"));
        System.out.print("Course C: ");
        for(User u : courseC){
            System.out.print(u + " ");
        }
        System.out.println();
        System.out.println();

        Set<User> students = new TreeSet<>();
        students.addAll(courseA);
        students.addAll(courseB);
        students.addAll(courseC);

        System.out.println("Total Students: " + students.size());
        System.out.println("List of students:");
        for(User u : students){
            System.out.println(u);
        }
    }
}