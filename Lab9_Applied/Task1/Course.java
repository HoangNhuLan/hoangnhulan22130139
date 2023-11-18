package Task1;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String id;
	private String title;
	private String type;
	private List<Student> students;
	private String lecturer;
	/**
	 * @param id
	 * @param title
	 * @param type
	 * @param student
	 * @param lecturer
	 */
	public Course(String id, String title, String type, List<Student> students, String lecturer) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.students = students;
		this.lecturer = lecturer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Student> getStudent() {
		return students;
	}
	public void setStudent(List<Student> students) {
		this.students = students;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", type=" + type + ", students=" + students + ", lecturer="
				+ lecturer + "]";
	}
	public int maxStudentCount() {
		if(this.type.equals("TH")) {
			return this.students.size();
		}
		return 0;
	}
	public boolean getMaxCourse(Course other) {
		return this.maxStudentCount() > other.maxStudentCount();
	}
	public void addStudent (Student student) {
		if(this.students == null) {
			this.students = new ArrayList<>();	
			}
		this.students.add(student);
	}
	
}

