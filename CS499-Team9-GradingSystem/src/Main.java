// File: Main.java
// Author(s): Paul Zorovich
// Date created: 1/18/2022

public class Main {

	/*
	static Term term1 = new Term("Fall 2021");
	static Term term2 = new Term("Spring 2022");
	static Term term3 = new Term("Fall 2022");
	
	static Class cs102fa21 = new Class("Intro to C Programming", "FA21-CS102");
	static Class cs121fa21 = new Class("Computer Science I", "FA21-CS121");
	static Class cs221fa21 = new Class("Data Structures", "FA21-CS221");
	static Class cs321fa21 = new Class("Object-Oriented Java", "FA21-CS321");
	static Class cs424fa21 = new Class("Programming Languages", "FA21-CS424");
	
	static Class cs102sp22 = new Class("Intro to C Programming", "SP22-CS102");
	static Class cs121sp22 = new Class("Computer Science I", "SP22-CS121");
	static Class cs221sp22 = new Class("Data Structures", "SP22-CS221");
	static Class cs321sp22 = new Class("Object-Oriented Java", "SP22-CS321");
	static Class cs424sp22 = new Class("Programming Languages", "SP22-CS424");
	
	static Class cs102fa22 = new Class("Intro to C Programming", "FA22-CS102");
	static Class cs121fa22 = new Class("Computer Science I", "FA22-CS121");
	static Class cs221fa22 = new Class("Data Structures", "FA22-CS221");
	static Class cs321fa22 = new Class("Object-Oriented Java", "FA22-CS321");
	static Class cs424fa22 = new Class("Programming Languages", "FA22-CS424");
	
	static Student enriqueFriedman = new Student("Enrique", "Friedman", "B20220101");
	static Student rolandCarillo = new Student("Roland", "Carillo", "B20220102");
	static Student malakaiSchenider = new Student("Malakai", "Schneider", "B20220103");
	static Student maiaRasmussen = new Student("Maia", "Rasmussen", "B20220104");
	static Student janiahWarren = new Student("Janiah", "Warren", "B20220105");
	static Student urijahRandall = new Student("Urijah", "Randall", "B20220106");
	static Student duncanFernandez = new Student("Duncan", "Fernandez", "B20220107");
	static Student evanFinley = new Student("Evan", "Finley", "B20220108");
	static Student howardChung = new Student("Howard", "Chung", "B20220109");
	static Student tanyaOdonnell = new Student("Tanya", "Odonnell", "B20220110");
	static Student azariaCastaneda = new Student("Azaria", "Castaneda", "B20220111");
	static Student dayamiBrown = new Student("Dayami", "Brown", "B20220112");
	static Student paulaTerrell = new Student("Paula", "Terrell", "B20220113");
	static Student ellaHarris = new Student("Ella", "Harris", "B20220114");
	static Student darianHowell = new Student("Darian", "Howell", "B20220115");
	static Student helenWilkerson = new Student("Helen", "Wilkerson", "B20220116");
	static Student mckaylaMatthews = new Student("Mckayla", "Matthews", "B20220117");
	static Student lenaBlake = new Student("Lena", "Blake", "B20220118");
	static Student jaidenThomas = new Student("Jaiden", "Thomas", "B20220119");
	static Student lylaDouglas = new Student("Lyla", "Douglas", "B20220120");
	static Student anikaMeadows = new Student("Anika", "Meadows", "B20220121");
	static Student winstonDixon = new Student("Winston", "Dixon", "B20220122");
	static Student nikoFrench = new Student("Niko", "French", "B20220123");
	static Student rylanNash = new Student("Rylan", "Nash", "B20220124");
	static Student isaiasFranklin = new Student("Isaias", "Franklin", "B20220125");
	static Student courtneyMunoz = new Student("Courtney", "Munoz", "B20220126");
	static Student averyWalls = new Student("Avery", "Walls", "B20220127");
	static Student chandlerMelton = new Student("Chandler", "Melton", "B20220128");
	static Student lorenzoFloyd = new Student("Lorenzo", "Floyd", "B20220129");
	static Student roccoGay = new Student("Rocco", "Gay", "B20220130");
	static Student kendallRocha = new Student("Kendall", "Rocha", "B20220131");
	static Student devanMclaughlin = new Student("Devan", "Mclaughlin", "B20220201");
	static Student allanSpears = new Student("Allan", "Spears", "B20220202");
	static Student jesusWhite = new Student("Jesus", "White", "B20220203");
	static Student patriciaMartinez = new Student("Patricia", "Martinez", "B20220204");
	static Student tamaraBrown = new Student("Tamara", "Brown", "B20220205");
	static Student raidenMorrow = new Student("Raiden", "Morrow", "B20220206");
	static Student rihannaLopez = new Student("Rihanna", "Lopez", "B20220207");
	static Student destineySavage = new Student("Destiney", "Savage", "B20220208");
	static Student natashaChan = new Student("Natasha", "Chan", "B20220209");
	static Student indiaCabrera = new Student("India", "Cabrera", "B20220210");
	static Student demetriusHarrison = new Student("Demetrius", "Harrison", "B20220211");
	static Student jaslynTodd = new Student("Jaslyn", "Todd", "B20220212");
	static Student caitlynWoods = new Student("Caitlyn", "Woods", "B20220213");
	static Student liviaGalloway = new Student("Livia", "Galloway", "B20220214");
	static Student carmenHarrington = new Student("Carmen", "Harrington", "B20220215");
	static Student graceColon = new Student("Grace", "Colon", "B20220216");
	static Student deannaTodd = new Student("Deanna", "Todd", "B20220217");
	static Student haydenCoffey = new Student("Hayden", "Coffey", "B20220218");
	static Student seanSloan = new Student("Sean", "Sloan", "B20220219");
	
	static AssignmentCategory exam = new AssignmentCategory("Exam", 0.15);
	static AssignmentCategory quiz = new AssignmentCategory("Quiz", 0.01);
	static AssignmentCategory homework = new AssignmentCategory("Homework", 0.04);
	static AssignmentCategory program = new AssignmentCategory("Programming Assignmnent", 0.1);
	static AssignmentCategory project = new AssignmentCategory("Project", 0.15);
	static AssignmentCategory midtermExam = new AssignmentCategory("Midterm Exam", 0.3);
	static AssignmentCategory finalexam = new AssignmentCategory("Final Exam", 0.3);
	
	static Assignment exam1 = new Assignment("Exam 1", exam);
	static Assignment exam2 = new Assignment("Exam 2", exam);
	static Assignment midterm = new Assignment("Midterm Exam", midtermExam);
	static Assignment progassign1 = new Assignment("Programming Assignment 1", program);
	static Assignment progassign2 = new Assignment("Programming Assignment 2", program);
	static Assignment progassign3 = new Assignment("Programming Assignment 3", program);
	static Assignment progassign4 = new Assignment("Programming Assignment 4", program);
	static Assignment project1 = new Assignment("Project 1", project);
	static Assignment project2 = new Assignment("Project 2", project);
	static Assignment project3 = new Assignment("Project 3", project);
	static Assignment project4 = new Assignment("Project 4", project);
	static Assignment homework1 = new Assignment("Homework 1", homework);
	static Assignment homework2 = new Assignment("Homework 2", homework);
	static Assignment homework3 = new Assignment("Homework 3", homework);
	static Assignment homework4 = new Assignment("Homework 4", homework);
	static Assignment homework5 = new Assignment("Homework 5", homework);
	static Assignment homework6 = new Assignment("Homework 6", homework);
	static Assignment homework7 = new Assignment("Homework 7", homework);
	static Assignment homework8 = new Assignment("Homework 8", homework);
	static Assignment homework9 = new Assignment("Homework 9", homework);
	static Assignment homework10 = new Assignment("Homework 10", homework);
	static Assignment quiz1 = new Assignment("Quiz 1", quiz);
	static Assignment quiz2 = new Assignment("Quiz 2", quiz);
	static Assignment quiz3 = new Assignment("Quiz 3", quiz);
	static Assignment quiz4 = new Assignment("Quiz 4", quiz);
	static Assignment quiz5 = new Assignment("Quiz 5", quiz);
	static Assignment quiz6 = new Assignment("Quiz 6", quiz);
	static Assignment quiz7 = new Assignment("Quiz 7", quiz);
	static Assignment quiz8 = new Assignment("Quiz 8", quiz);
	static Assignment quiz9 = new Assignment("Quiz 9", quiz);
	static Assignment quiz10 = new Assignment("Quiz 10", quiz);
	static Assignment finalExam = new Assignment("Final Exam", finalexam);	
	*/
	
	static Gradebook gradebook = new Gradebook();
	
	public static void main(String[] args)
	{
		//testingSetup();
		GUI_Main gui = new GUI_Main();
		
	}
	
	/************************************
	public static void testingSetup()
	{
		term1.addClass(cs102fa21);
		term1.addClass(cs121fa21);
		term1.addClass(cs221fa21);
		term1.addClass(cs321fa21);
		term1.addClass(cs424fa21);
		
		term2.addClass(cs102sp22);
		term2.addClass(cs121sp22);
		term2.addClass(cs221sp22);
		term2.addClass(cs321sp22);
		term2.addClass(cs424sp22);
		
		term3.addClass(cs102fa22);
		term3.addClass(cs121fa22);
		term3.addClass(cs221fa22);
		term3.addClass(cs321fa22);
		term3.addClass(cs424fa22);
		
		cs102fa21.addStudent(enriqueFriedman);
		cs102fa21.addStudent(rolandCarillo);
		cs102fa21.addStudent(malakaiSchenider);
		cs102fa21.addStudent(maiaRasmussen);
		cs102fa21.addStudent(janiahWarren);
		cs102fa21.addStudent(urijahRandall);
		
		cs121fa21.addStudent(duncanFernandez);
		cs121fa21.addStudent(evanFinley);
		cs121fa21.addStudent(howardChung);
		cs121fa21.addStudent(tanyaOdonnell);
		cs121fa21.addStudent(azariaCastaneda);
		cs121fa21.addStudent(dayamiBrown);
		
		cs221fa21.addStudent(paulaTerrell);
		cs221fa21.addStudent(ellaHarris);
		cs221fa21.addStudent(darianHowell);
		cs221fa21.addStudent(helenWilkerson);
		cs221fa21.addStudent(mckaylaMatthews);
		cs221fa21.addStudent(lenaBlake);
		
		cs321fa21.addStudent(jaidenThomas);
		cs321fa21.addStudent(lylaDouglas);
		cs321fa21.addStudent(anikaMeadows);
		cs321fa21.addStudent(winstonDixon);
		cs321fa21.addStudent(nikoFrench);
		cs321fa21.addStudent(rylanNash);
		
		cs424fa21.addStudent(isaiasFranklin);
		cs424fa21.addStudent(courtneyMunoz);
		cs424fa21.addStudent(averyWalls);
		cs424fa21.addStudent(chandlerMelton);
		cs424fa21.addStudent(lorenzoFloyd);
		cs424fa21.addStudent(roccoGay);
		
		cs102sp22.addStudent(kendallRocha);
		cs102sp22.addStudent(devanMclaughlin);
		cs102sp22.addStudent(allanSpears);
		cs102sp22.addStudent(jesusWhite);
		cs102sp22.addStudent(patriciaMartinez);
		cs102sp22.addStudent(tamaraBrown);
		cs102sp22.addStudent(raidenMorrow);
		cs102sp22.addStudent(rihannaLopez);
		cs102sp22.addStudent(destineySavage);
		cs102sp22.addStudent(natashaChan);
		cs102sp22.addStudent(indiaCabrera);
		cs102sp22.addStudent(demetriusHarrison);
		
		cs121sp22.addStudent(enriqueFriedman);
		cs121sp22.addStudent(rolandCarillo);
		cs121sp22.addStudent(malakaiSchenider);
		cs121sp22.addStudent(maiaRasmussen);
		cs121sp22.addStudent(janiahWarren);
		cs121sp22.addStudent(urijahRandall);
		
		cs221sp22.addStudent(duncanFernandez);
		cs221sp22.addStudent(evanFinley);
		cs221sp22.addStudent(howardChung);
		cs221sp22.addStudent(tanyaOdonnell);
		cs221sp22.addStudent(azariaCastaneda);
		cs221sp22.addStudent(dayamiBrown);
		
		cs321sp22.addStudent(paulaTerrell);
		cs321sp22.addStudent(ellaHarris);
		cs321sp22.addStudent(darianHowell);
		cs321sp22.addStudent(helenWilkerson);
		cs321sp22.addStudent(mckaylaMatthews);
		cs321sp22.addStudent(lenaBlake);
		
		cs424sp22.addStudent(jaidenThomas);
		cs424sp22.addStudent(lylaDouglas);
		cs424sp22.addStudent(anikaMeadows);
		cs424sp22.addStudent(winstonDixon);
		cs424sp22.addStudent(nikoFrench);
		cs424sp22.addStudent(rylanNash);
		
		cs102fa22.addStudent(jaslynTodd);
		cs102fa22.addStudent(caitlynWoods);
		cs102fa22.addStudent(liviaGalloway);
		cs102fa22.addStudent(carmenHarrington);
		cs102fa22.addStudent(graceColon);
		cs102fa22.addStudent(deannaTodd);
		cs102fa22.addStudent(haydenCoffey);
		cs102fa22.addStudent(seanSloan);
		
		cs121fa22.addStudent(kendallRocha);
		cs121fa22.addStudent(devanMclaughlin);
		cs121fa22.addStudent(allanSpears);
		cs121fa22.addStudent(jesusWhite);
		cs121fa22.addStudent(patriciaMartinez);
		cs121fa22.addStudent(tamaraBrown);
		cs121fa22.addStudent(raidenMorrow);
		cs121fa22.addStudent(rihannaLopez);
		cs121fa22.addStudent(destineySavage);
		cs121fa22.addStudent(natashaChan);
		cs121fa22.addStudent(indiaCabrera);
		cs121fa22.addStudent(demetriusHarrison);
		
		cs221fa22.addStudent(enriqueFriedman);
		cs221fa22.addStudent(rolandCarillo);
		cs221fa22.addStudent(malakaiSchenider);
		cs221fa22.addStudent(maiaRasmussen);
		cs221fa22.addStudent(janiahWarren);
		cs221fa22.addStudent(urijahRandall);
		
		cs321fa22.addStudent(duncanFernandez);
		cs321fa22.addStudent(evanFinley);
		cs321fa22.addStudent(howardChung);
		cs321fa22.addStudent(tanyaOdonnell);
		cs321fa22.addStudent(azariaCastaneda);
		cs321fa22.addStudent(dayamiBrown);
		
		cs424fa22.addStudent(paulaTerrell);
		cs424fa22.addStudent(ellaHarris);
		cs424fa22.addStudent(darianHowell);
		cs424fa22.addStudent(helenWilkerson);
		cs424fa22.addStudent(mckaylaMatthews);
		cs424fa22.addStudent(lenaBlake);
		
		// Add assignments
		cs102fa21.addAssignment(midterm);
		cs102fa21.addAssignment(homework1);
		cs102fa21.addAssignment(homework2);
		cs102fa21.addAssignment(homework3);
		cs102fa21.addAssignment(homework4);
		cs102fa21.addAssignment(homework5);
		cs102fa21.addAssignment(homework6);
		cs102fa21.addAssignment(homework7);
		cs102fa21.addAssignment(homework8);
		cs102fa21.addAssignment(homework9);
		cs102fa21.addAssignment(homework10);
		cs102fa21.addAssignment(finalExam);
		
		cs102sp22.addAssignment(midterm);
		cs102sp22.addAssignment(homework1);
		cs102sp22.addAssignment(homework2);
		cs102sp22.addAssignment(homework3);
		cs102sp22.addAssignment(homework4);
		cs102sp22.addAssignment(homework5);
		cs102sp22.addAssignment(homework6);
		cs102sp22.addAssignment(homework7);
		cs102sp22.addAssignment(homework8);
		cs102sp22.addAssignment(homework9);
		cs102sp22.addAssignment(homework10);
		cs102sp22.addAssignment(finalExam);
		
		cs102fa22.addAssignment(midterm);
		cs102fa22.addAssignment(homework1);
		cs102fa22.addAssignment(homework2);
		cs102fa22.addAssignment(homework3);
		cs102fa22.addAssignment(homework4);
		cs102fa22.addAssignment(homework5);
		cs102fa22.addAssignment(homework6);
		cs102fa22.addAssignment(homework7);
		cs102fa22.addAssignment(homework8);
		cs102fa22.addAssignment(homework9);
		cs102fa22.addAssignment(homework10);
		cs102fa22.addAssignment(finalExam);
	}
	************************************************/
}
