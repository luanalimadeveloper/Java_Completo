package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for the course A? ");
		int studentsA = sc.nextInt();
		
		Set<Student> set = new HashSet<>();
		 
		for(int i = 0; i < studentsA; i++) {
			System.out.print("Aluno ");
			int studentNumber = sc.nextInt();
			set.add(new Student(studentNumber)) ;
		}
		
		System.out.print("How many students for the course B? ");
		int studentsB = sc.nextInt();
		 
		for(int i = 0; i < studentsB; i++) {
			System.out.print("Aluno ");
			int studentNumber = sc.nextInt();
			set.add(new Student(studentNumber)) ;
		}
		
		System.out.print("How many students for the course C? ");
		int studentsC = sc.nextInt();
		 
		for(int i = 0; i < studentsC; i++) {
			System.out.print("Aluno ");
			int studentNumber = sc.nextInt();
			set.add(new Student(studentNumber)) ;
		}
		
	
	System.out.print("Total students: " + set.size());
		
	sc.close();
	}

}
