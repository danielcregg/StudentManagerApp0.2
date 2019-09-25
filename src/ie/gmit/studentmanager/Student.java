package ie.gmit.studentmanager;

import java.util.*; // For Date obj

public class Student{
    private String studentId;
    private String firstName;
    private String surname;
    private Date dob;
    private Address address;
    private Course course;
    
    public Student(String studentId){
        this.studentId = studentId;
    }
    
    public Student(String studentId, String firstName, String surname){
        this(studentId);
        this.firstName = firstName;
        this.surname = surname;
    }

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}
