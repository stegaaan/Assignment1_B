package assignment1_B;

import assignment1.Module;
import assignment1.Programme;
import assignment1.Student;

public class Driver {
	static Student example1= new Student("AlanBrown","19","26-11-1996",13456789);
	static Student example2 = new Student("ConorDunny","20","21-12-1995",13756789);
	static Student example3 = new Student("EmilyFerguson","21","01-11-1995",13456989);
	static Student example4 = new Student("GerryHeane","18","17-11-1997",14280085);
	
	static Module Maths = new Module("Maths","MT123");
	static Module Computers = new Module("Computers","CT101");
	
	static Programme ECE = new Programme("ECE","01/09/2016","01/06/2017");
	
	public static void main(String[] args){
		test();
	}
	
	public static void test(){
		
		Maths.addStudents(example1);
		Maths.addStudents(example2);
		Maths.addStudents(example3);
		
		Computers.addStudents(example1);
		Computers.addStudents(example4);
		
		ECE.addModules(Maths);
		ECE.addModules(Computers);
		
		ECE.printProgramme();
		
	}
}
