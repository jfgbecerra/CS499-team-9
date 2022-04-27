import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONTokener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Database {
	private static String currentPath = System.getProperty("user.dir");
	
	public Database()
	{
		
	}

	public static String getCourseName(String filename) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        return object.getString("courseName");
	}

	public static String getCourseCode(String filename) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        return object.getString("courseCode");
	}

	public static String getCourseTerm(String filename) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        return object.getString("courseTerm");
	}

	public static JSONObject[] getStudents(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray students = object.getJSONArray("students");
        JSONObject[] studentValues = new JSONObject[students.length()];
        for (int i = 0; i < students.length(); i++) {
        	studentValues[i] = students.getJSONObject(i);
        }
        return studentValues;
	}

	public static int getStudentsLength(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray students = object.getJSONArray("students");
        return students.length();
	}

	public static String[] getStudentNames(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray studentNames = object.getJSONArray("students");
        String[] names = new String[studentNames.length()];
        for (int i = 0; i < studentNames.length(); i++) {
        	names[i] = studentNames.getJSONObject(i).getString("studentName");
        }
        return names;
	}
        public static int getStudentNamesLength(String filename) {//finish
        	InputStream is = null;
    		try {
    			is = new FileInputStream(currentPath + "/Database/" +filename);
    		} catch (FileNotFoundException e) {

    			e.printStackTrace();
    		}
    		JSONTokener tokener = new JSONTokener(is);
            JSONObject object = new JSONObject(tokener);
            JSONArray studentNames = object.getJSONArray("students");
            return studentNames.length();
	}

	public static String[] getStudentNumbers(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray studentNumbers = object.getJSONArray("students");
        String[] numbers = new String[studentNumbers.length()];
        for (int i = 0; i < studentNumbers.length(); i++) {
        	numbers[i] = studentNumbers.getJSONObject(i).getString("studentNumber");
        }
        return numbers;
	}

	public static int getStudentNumbersLength(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray studentNumbers = object.getJSONArray("students");
        return studentNumbers.length();
	}

	public static JSONObject[] getAssignments(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray assignments = object.getJSONArray("assignments");
        JSONObject assignmentValues[] = new JSONObject[assignments.length()];
        for (int i = 0; i < assignments.length(); i++) {
        	assignmentValues[i] = assignments.getJSONObject(i);
        }
        return assignmentValues;
	}
/*	public static void getAssignmentGrades(String filename) {//test code
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray assignments = object.getJSONArray("assignments");
        JSONObject assignmentValues[] = new JSONObject[assignments.length()];
       System.out.println(object.getJSONArray("assignments").getJSONObject(0).get("assignmentGrades"));
        for (int i = 0; i < assignments.length(); i++) {
       	assignmentValues[i] = assignments.getJSONObject(i);
            //System.out.println("  - " + students.getJSONObject(i));
        	//System.out.println(assignmentValues[0].toString());
       }
        //return object.get("assignments");
	}*/
	public static int getAssignmentsLength(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray assignments = object.getJSONArray("assignments");
        return assignments.length();
	}

	public static String[] getAssignmentNames(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray assignmentNames = object.getJSONArray("assignments");
        String[] aNames = new String[assignmentNames.length()];
        for (int i = 0; i < assignmentNames.length(); i++) {
        	aNames[i] = assignmentNames.getJSONObject(i).getString("assignmentName");
        }
        return aNames;
	}

	public static int getAssignmentNamesLength(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray assignmentNames = object.getJSONArray("assignments");
        return assignmentNames.length();
	}

	public static JSONObject[] getAssignmentCat(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray assignments = object.getJSONArray("assignmentCategories");
        JSONObject assignmentCats[] = new JSONObject[assignments.length()];
        for (int i = 0; i < assignments.length(); i++) {
        	assignmentCats[i] = assignments.getJSONObject(i);
        }
        return assignmentCats;
	}

	public static int getAssignmentCatLength(String filename) {//finish
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray assignments = object.getJSONArray("assignmentCategories");
        return assignments.length();
	}

	public static void addStudent(String filename,String studentName,String studentNumber) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONObject studentToAdd = new JSONObject();
        studentToAdd.put("studentName", studentName);
        studentToAdd.put("studentNumber", studentNumber);
        double gr = 0.0;
        for (int i = 0; i < object.getJSONArray("assignments").length(); i++) {
        	object.getJSONArray("assignments").getJSONObject(i).getJSONObject("assignmentGrades").put(studentName, gr);
        }
        object.getJSONArray("students").put(studentToAdd);
        try (FileWriter file = new FileWriter(currentPath + "/Database/" +filename)) {
			file.write(object.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void removeStudent(String filename,String studentName,String studentNumber) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONObject studentToAdd = new JSONObject();
        studentToAdd.put("studentName", studentName);
        studentToAdd.put("studentNumber", studentNumber);
        for (int i = 0; i < object.getJSONArray("assignments").length(); i++) {
        	object.getJSONArray("assignments").getJSONObject(i).getJSONObject("assignmentGrades").remove(studentName);
        }
        for (int i = 0; i < object.getJSONArray("students").length(); i++) {
       // 	System.out.println(object.getJSONArray("students").getJSONObject(i).get("studentName")); //used for testing
        	if(object.getJSONArray("students").getJSONObject(i).get("studentName").toString().equals(studentName)) {
        	object.getJSONArray("students").remove(i);
        	}
        //	else System.out.println("no"); // used for testing
        }
        try (FileWriter file = new FileWriter(currentPath + "/Database/" +filename)) {
			file.write(object.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addAssignment(String filename,String assignmentName,String assignmentCat) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONObject assignmentToAdd = new JSONObject();
        JSONObject assGrades = new JSONObject();
        assignmentToAdd.put("assignmentName", assignmentName);
        assignmentToAdd.put("assignmentCategory", assignmentCat);
        for (int i = 0; i < object.getJSONArray("students").length(); i++) {
        	// JSONObject temp = new JSONObject();
            // temp.put(object.getJSONArray("students").getJSONObject(i).get("studentName").toString(), 0.0);
				assGrades.put(object.getJSONArray("students").getJSONObject(i).get("studentName").toString(), 0.0);
			}
        assignmentToAdd.put("assignmentGrades", assGrades);
        object.getJSONArray("assignments").put(assignmentToAdd);
        try (FileWriter file = new FileWriter(currentPath + "/Database/" +filename)) {
			file.write(object.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void removeAssignment(String filename,String assignmentName) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        for (int i = 0; i < object.getJSONArray("assignments").length(); i++) {
        	System.out.println(object.getJSONArray("assignments").getJSONObject(i).get("assignmentName"));
        	if(object.getJSONArray("assignments").getJSONObject(i).get("assignmentName").toString().equals(assignmentName)) {
        	object.getJSONArray("assignments").remove(i);
        	}
        	else System.out.println("no");
        }
        try (FileWriter file = new FileWriter(currentPath + "/Database/" +filename)) {
			file.write(object.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addAssignmentCat(String filename,String catName,double catWeight) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONObject catToAdd = new JSONObject();
        catToAdd.put("categoryName", catName);
        catToAdd.put("categoryWeight", catWeight);
        object.getJSONArray("assignmentCategories").put(catToAdd);
        try (FileWriter file = new FileWriter(currentPath + "/Database/" +filename)) {
			file.write(object.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void removeAssignmentCat(String filename,String catName) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        for (int i = 0; i < object.getJSONArray("assignmentCategories").length(); i++) {
        	System.out.println(object.getJSONArray("assignmentCategories").getJSONObject(i).get("categoryName"));
        	if(object.getJSONArray("assignmentCategories").getJSONObject(i).get("categoryName").toString().equals(catName)) {
        	object.getJSONArray("assignmentCategories").remove(i);
        	}
        	else System.out.println("no");
        }
        try (FileWriter file = new FileWriter(currentPath + "/Database/" +filename)) {
			file.write(object.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void editAssignmentGR(String filename,String assignmentName,String studentName,double grade) {
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        for (int i = 0; i < object.getJSONArray("assignments").length(); i++) {
        	System.out.println(object.getJSONArray("assignments").getJSONObject(i).get("assignmentName"));
        	if(object.getJSONArray("assignments").getJSONObject(i).get("assignmentName").toString().equals(assignmentName)) {
        	object.getJSONArray("assignments").getJSONObject(i).getJSONObject("assignmentGrades").put(studentName, grade);
        	break;
        	}
        	else System.out.println("no");
        }
        try (FileWriter file = new FileWriter(currentPath + "/Database/" +filename)) {
			file.write(object.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void makeNewCourse(String courseName,String courseCode,String courseTerm) {
		ArrayList<String> courses = new ArrayList<String>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(currentPath + "/Database/course list.txt"));
			String line = reader.readLine();
			while (line != null) {
				courses.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		courses.add(courseName + courseTerm + ".json");
		String courseList = "";
		for(int j =0; j < courses.size(); j++) {
			courseList = courseList + courses.get(j) + System.lineSeparator();	
		}
		try (FileWriter file = new FileWriter(currentPath + "/Database/course list.txt")) {
			file.write(courseList);
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JSONObject object = new JSONObject();
		object.put("courseName", courseName);
		object.put("courseCode", courseCode);
		object.put("courseTerm", courseTerm);
		JSONArray cats = new JSONArray();
		JSONObject catobj = new JSONObject();
		catobj.put("categoryName", "delete this once you make a category");
		catobj.put("categoryWeight", 0);
		cats.put(catobj);
		object.put("assignmentCategories", cats);
		JSONArray studs = new JSONArray();
		JSONObject stu = new JSONObject();
		stu.put("studentName","DeleteMeOnce YouMakeANewStudent");
		stu.put("studentNumber", "A123");
		studs.put(stu);
		object.put("students", studs);
		JSONArray assigns = new JSONArray();
		JSONObject assi = new JSONObject();
		JSONObject a = new JSONObject();
		assi.put("assignmentName", "Delete once you make a new assignment");
		assi.put("assignmentCategory", "");
		a.put("DeleteMeOnce YouMakeANewStudent", 0.5);
		assi.put("assignmentGrades", a);
		assigns.put(assi);
		object.put("assignments", assigns);
		try (FileWriter file = new FileWriter(currentPath + "/Database/" + courseName + courseTerm + ".json")) {
			file.write(object.toString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static ArrayList<String> getAllCourses() {
		ArrayList<String> courses = new ArrayList<String>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(currentPath + "/Database/course list.txt"));
			String line = reader.readLine();
			while (line != null) {
				courses.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return courses;
	}

	public static JSONArray getAllCoursesInfo() {
		JSONArray courseInfo = new JSONArray();
		ArrayList<String> fileNames = getAllCourses();
		 for (int i = 0; i < fileNames.size(); i++) {
			 JSONObject singleCourse = new JSONObject();
		     singleCourse.put("courseName", getCourseName(fileNames.get(i)));
		     singleCourse.put("courseCode", getCourseCode(fileNames.get(i)));
		     singleCourse.put("courseTerm", getCourseTerm(fileNames.get(i)));
		     courseInfo.put(singleCourse);
		    }
		return courseInfo;
	}

	public static void removeCourse(String filename) {
		ArrayList<String> courses = new ArrayList<String>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(currentPath + "/Database/course list.txt"));
			String line = reader.readLine();
			while (line != null) {
				courses.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < courses.size(); i++) {
			if(courses.get(i).equals(filename)) {
				courses.remove(i);
				break;
			}
		}
		String courseList = "";
		for(int j =0; j < courses.size(); j++) {
			courseList = courseList + courses.get(j) + System.lineSeparator();	
		}
		try (FileWriter file = new FileWriter(currentPath + "/Database/course list.txt")) {
			file.write(courseList);
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean login(String userName, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        String fullUser = new String(userName + password);
        ArrayList<String> hashes = new ArrayList<String>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(currentPath + "/Database/hashes.txt"));
            String line = reader.readLine();
            while (line != null) {
                hashes.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < hashes.size(); i++) {
            if(hashes.get(i).equals(fullUser)) {
                return true;
            }
        }
        return false;
    }

	public static void printall(String filename) {//test code
		InputStream is = Database.class.getResourceAsStream(filename);
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        System.out.println(object);
        }
	
	public static void getAssignmentGradez(String filename) {//test code
		InputStream is = null;
		try {
			is = new FileInputStream(currentPath + "/Database/" +filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        JSONArray assignments = object.getJSONArray("assignments");
        JSONObject assignmentValues[] = new JSONObject[assignments.length()];
       System.out.println(object.getJSONArray("assignments").getJSONObject(0).get("assignmentGrades"));
        for (int i = 0; i < assignments.length(); i++) {
       	assignmentValues[i] = assignments.getJSONObject(i);
       }
        for (int i = 0; i < object.getJSONArray("students").length(); i++) {
        	System.out.println(object.getJSONArray("students").getJSONObject(i).get("studentName"));
        	if(object.getJSONArray("students").getJSONObject(i).get("studentName").toString().equals("Jane Doe")) {
        	System.out.println("yes");
        	}
        	else System.out.println("no");
        }
	}
  

	public static void main(String[] args) {
		////String location = new String("testCourse.json");
	//	//File file = new File(location);
	///	 String resourceName = "testCourse.json";
	 ///      InputStream is = Database.class.getResourceAsStream(resourceName);
	///       if (is == null) {
	///            throw new NullPointerException("Cannot find resource file " + resourceName);
	///       }

	  ///      JSONTokener tokener = new JSONTokener(is);
	  ///      JSONObject object = new JSONObject(tokener);
	      //  System.out.println("Id  : " + object.getString("courseName"));
		//JSONObject test1 = new JSONObject(file);
		//System.out.println("Final JSONObject: " + test1);
		
	//	JSONArray testAdd = new JSONArray();
	//	JSONArray temp = object.getJSONArray("students");
	//	JSONObject temp2 = temp.toJSONObject(temp);
	//	testAdd.put(temp2);
		
	//	System.out.println(getCourseName("testCourse2.json"));
	//	System.out.println(getCourseCode("testCourse2.json"));
	//	System.out.println(getCourseTerm("testCourse2.json"));
	//	System.out.println(getStudentNames("testCourse2.json")[0]);
	//	System.out.println(getStudentNumbers("testCourse2.json")[0]);
	//	System.out.println(getStudents("testCourse2.json")[0]);
	//	System.out.println(getStudents("testCourse2.json")[1]);
	//	System.out.println((getAssignments("testCourse2.json")[0]).toString());
	//	System.out.println(getAssignments("testCourse2.json")[1]);
	//	System.out.println(getAssignmentNames("testCourse2.json")[1]);
	//	System.out.println(getAssignmentCat("testCourse2.json")[0]);
	//	System.out.println("Hello World!");
	//	addStudent("testCourse2.json", "Bob Test", "A123");
		//addStudent("testCourse2.json", "tim Test", "A1234");
		//addStudent("testCourse2.json", "timmy Test", "A12434");
	//	printall("testCourse2.json");
		//addAssignment("testCourse2.json","test ass 3","Homework");
		//removeStudent("testCourse2.json", "Bob Test", "A123");
		//removeAssignment("testCourse2.json", "test ass 3");
		//addAssignmentCat("testCourse2.json","test cat",11);
		//removeAssignmentCat("testCourse2.json","test cat");
		//editAssignmentGR("testCourse2.json","Test Assignment2","John Doe",55.2);
	//	System.out.println(getStudentsLength("testCourse2.json"));
	//	System.out.println(getStudentNamesLength("testCourse2.json"));
	//	System.out.println(getStudentNumbersLength("testCourse2.json"));
	//	System.out.println(getAssignmentNamesLength("testCourse2.json"));
	//	System.out.println(getAssignmentsLength("testCourse2.json"));
	//	System.out.println(getAssignmentCatLength("testCourse2.json"));
/*getAssignmentGrades("testCourse2.json");//test code
getAssignmentGradez("testCourse2.json");//test code
makeNewCourse("test course 4","tst102","spring 22");*/
		//getAllCourses();
	//	System.out.println(getAllCoursesInfo().get(0));
	//	System.out.println(getAllCoursesInfo().get(1));
		//removeCourse("test course 4.json");
		//removeCourse("testCourse3.json");
		//makeNewCourse("test course 5","tst103","spring 23");
	}


}
