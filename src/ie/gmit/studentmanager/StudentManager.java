package ie.gmit.studentmanager;

public class StudentManager {
	// Set an initial capacity constant for the array. Before you create an 
	// array you need to know what size it is.
	private static final int INITIAL_CAPACITY = 10;
	// Create an array to hold the student objects
	private Student[] students = null;
	
	// Constructor - instantiate students array
	public StudentManager() {
		// Creating an empty students array that contains 10 nulls 
		students = new Student[INITIAL_CAPACITY];
	}

	public boolean add(Student s) {
		// Loop over the students array
		for (int i = 0; i < students.length; i++) {
			// If element in array is null add student object
			if (students[i] == null) {
				students[i] = s;
				// return true to indicate student was added successfully
				return true;
			}
		}
		// Return false if can not find null (i.e we have a full array)
		return false;
	}

	public boolean delete(String sid) {
		// Loop over array
		for (int i = 0; i < students.length; i++) {
			// if array element is not null check if it equals sid
			if (students[i] != null && students[i].getStudentId().equals(sid)) {
				// If Student ID is found then delete it i.e. set element it null
				students[i] = null;
				// Return true to indicate student deletion was successful
				return true;
			}
		}
		// Return false to indicate that student Id was not found
		return false;
	}

	public Student getStudentByID(String sid) {
		// Loop over array
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudentId().equals(sid)) {
				return students[i];
			}
		}
		// Return null if sid was not found
		return null;
	}
	
	// Find a list of student by first name
	public Student[] getStudentsByFirstName(String fname) {
		int total = 0;
		
		// Count number of students with that first name
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getFirstName().equalsIgnoreCase(fname)) {
				total++;
			}
		}
		
		// If you find some students with the same name...
		if (total > 0) {
			// Create a temporary array to store students
			Student[] temp = new Student[total];
			// Create index variable to track where we are in temp array
			int index = 0;
			// Loop through students array again
			for (int i = 0; i < students.length; i++) {
				// If you find student with first name then pop it into the temp array
				if (students[i] != null && students[i].getFirstName().equalsIgnoreCase(fname)) {
					temp[index] = students[i];
					index++;
				}
			}
			// Return the temp array that is filled with students of the give first name
			return temp;
		} else {
			// Return null if no students were found with that first name
			return null;
		}
	}

	public int findTotalStudents() {
		int total = 0; // Declare and Initialise counter
		// Loop over students array
		for (int i = 0; i < students.length; i++) {
			// If array element is not empty then increment counter
			if (students[i] != null) {
				total++;
			}
		}
		// Return total number of students
		return total;
	}
}
