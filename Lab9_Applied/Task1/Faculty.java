package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Faculty {
	private String name;
	private String address;
	private List<Course> courses;

	/**
	 * @param name
	 * @param address
	 * @param course
	 */
	public Faculty(String name, String address, List<Course> courses) {
		this.name = name;
		this.address = address;
		this.courses = courses;
	}

	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}
// trả về course thực hành có nhiều sinh viên đăng ký học nhất.
	public Course getMaxPracticalCourse() {
		Course maxCourse = null;
		for(Course course: courses) {
			if( course.getType().equals("TH")) {
				if(maxCourse == null) {
					maxCourse = course;
				}else if(course.getMaxCourse(maxCourse)) {
					maxCourse = course;
				}
			}
		}
		return maxCourse;
		
	}

// thống kê danh sách sinh viên theo năm vào học, với key là năm vào học và
// value là các sinh viên tương ứng.
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> studentOfYear = new HashMap<>();
		for (Course co : courses) {
			for (Student stu : co.getStudent()) {
				int year = stu.getYear();

				if (studentOfYear.containsKey(year)) {
					studentOfYear.get(year).add(stu);
				} else {
					List<Student> listOfStudents = new ArrayList<>();
					listOfStudents.add(stu);
					studentOfYear.put(year, listOfStudents);
				}
			}
		}
		return studentOfYear;

	}
// trả về các course theo loại cho trước (type).
// Các course được sắp xếp giảm dần theo số lượng sinh viên đăng ký học.
	public Set<Course> filterCourses(String type) {
		Set<Course> filterCourses = new TreeSet<>(new Comparator<Course>() {

			@Override
			public int compare(Course o1, Course o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.getStudent().size(), o1.getStudent().size());
			}
		});
		for(Course course: courses) {
			if(course.getType().equals(type)) {
				filterCourses.add(course);
			}
		}
		
		return filterCourses;

	}


}
