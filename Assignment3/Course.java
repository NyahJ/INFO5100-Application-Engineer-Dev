package assignment3;

import java.util.Arrays;

public class Course{
	private int courseId;
	private String courseName;
	private int maxCapacity;
	private int professorId;
	private int credits;
	private int[] studentIds;
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		if (courseId <= 0) {
			System.out.println("The courseId should not be negative or 0");
			return;
		}
		this.courseId = courseId;	
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		if (courseName.length() < 10 || courseName.length() > 60) {
			System.out.println("The courseName should be a string with minimum length 10 and maximum 60");
			return;
		}
		this.courseName = courseName;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	public void setMaxCapacity(int maxCapacity) {
		if (maxCapacity < 10 || maxCapacity > 100) {
			System.out.println("The maxCapacity should not be less than 10 greater than 100");
			return;
		}
		this.maxCapacity = maxCapacity;
	}
	
	public int getProfessorId() {
		return professorId;
	}
	
	public void setProfessorId(int ProfessorId) {
		String professorIdString = String.valueOf(professorId);
		if (professorIdString.length() != 6) {
			System.out.println("The professorId should be a six digit integer");
			return;
		}
		this.professorId = professorId;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public void setCredits(int credits) {
		if (credits <= 0 || credits > 9) {
			System.out.println("The credits should be a single digit but greater than 0");
			return;
		}
		this.credits = credits;
	}
	
	public int[] getStudentIds() {
		return studentIds;
	}
	
	public void setStudentIds(int[] studentIds) {
		this.studentIds = studentIds;
	}
	
	public Course(int courseId) {
		if (courseId <= 0) {
			System.out.println("The courseId should not be negative or 0");
			return;
		}
		this.courseId = courseId;
	}
	
	public Course(int courseId, int professorId) {
		if (courseId <= 0) {
			System.out.println("The courseId should not be negative or 0");
			return;
		}
		String professorIdString = String.valueOf(professorId);
		if (professorIdString.length() != 6) {
			System.out.println("The professorId should be a six digit integer");
			return;
		}
		this.courseId = courseId;
		this.professorId = professorId;
	}
	public Course(int courseId, int professorId, int credits) {
		String professorIdString = String.valueOf(professorId);
		if (professorIdString.length() != 6) {
			System.out.println("The professorId should be a six digit integer");
			return;
		}
		if (courseId <= 0) {
			System.out.println("The courseId should not be negative or 0");
			return;
		}
		if (credits <= 0 || credits > 9) {
			System.out.println("The credits should be a single digit but greater than 0");
			return;
		}
		this.courseId = courseId;
		this.professorId = professorId;
		this.credits = credits;
	}
	public void registerStudent(int studentId){
		if (studentIds.length >= maxCapacity) {
			System.out.println("The course has reached its max capacity, registration failed!");
			return;
		}
		
		for (int i = 0; i < studentIds.length; i++) {
			if (studentIds[i] == studentId) {
				System.out.println("The student has registered with the course");
				return;
			}
		}
		int[] newStudentIds = new int[studentIds.length + 1];
		for (int i = 0; i < studentIds.length; i++) {
			newStudentIds[i] = studentIds[i];
		}
		newStudentIds[studentIds.length] = studentId;
		studentIds = newStudentIds;
	}	
	public int[] removeDuplicates(int[] studentIds) {
		Arrays.sort(studentIds);
		int lastValue = studentIds[0]-1;
		int duplicate = 0;
		for (int i = 0; i < studentIds.length; i++){
			if (studentIds[i] != lastValue) {
				lastValue = studentIds[i];
			} else {
				studentIds[i] = studentIds[0] - 1;
				duplicate += 1;
			}
		}
		int[] newStudentIds = new int[studentIds.length - duplicate];
		int index = 0;
		for (int i = 0; i < studentIds.length; i++) {
			if (studentIds[i] >= studentIds[0]) {
				newStudentIds[index] = studentIds[i];
				index += 1;
			}
		}
		return newStudentIds;
	}
	
	public int groupsOfStudents(int[] studentIds) {
		int sumEven = 0;
		for (int i = 0; i < studentIds.length - 1; i++) {
			for (int j = i+1; j < studentIds.length; j++) {
				int sum;
				sum = studentIds[i] + studentIds[j];
				if(sum%2 == 0 ) {
					sumEven += 1;	
					}
				}
			}
		return sumEven;
		}
}
     
