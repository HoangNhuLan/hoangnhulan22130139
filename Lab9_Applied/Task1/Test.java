package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("001", "Nguyen Van A" , 2022);
		Student s2 = new Student("002", "Tran Thi B", 2021);
		Student s3 = new Student("003", "Pham Van C" , 2022);
		Student s4 = new Student("004", "Hoang Thi D", 2021);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s2);
		studentList.add(s3);
		List<Student> studentList2 = new ArrayList<>();
		studentList2.add(s1);
		studentList2.add(s4);
		studentList2.add(s3);
		List<Student> studentList3 = new ArrayList<>();
		studentList3.add(s1);
		
		String lecturer = "Nguyen Thi Phuong Tram";
		Course c1 = new Course("DH001", "Lap trinh nang cao", "TH", studentList, lecturer);
		Course c2 = new Course("DH002", "Cau truc du lieu", "LT", studentList2, lecturer);
		Course c3 = new Course("DH003", "Nhap mon HDH", "LT", studentList, lecturer);
		Course c4 = new Course("DH004", "Nhap mon tin hoc", "LT", studentList3, lecturer);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(c2);
		courseList.add(c1);
		courseList.add(c3);
		courseList.add(c4);
		
		Faculty f1 = new Faculty("CNTT", "Linh Trung-Thu Duc", courseList);
		
// phuong thuc getMaxPracticalCourse tra ve course thuc hanh co nhieu sv dki nhat
		Course course = f1.getMaxPracticalCourse();
		System.out.println("Course TH co nhieu sv dki: " + course);
		
// phuong thuc groupStudentByYear  thống kê danh sách sinh viên theo năm vào học
		Map<Integer, List<Student>> course1 = f1.groupStudentsByYear();
		System.out.println("Danh sach sv theo nam vao hoc: " + course1);
		
// phuong thuc filterCourses trả về các course theo loại cho trước.
// các course được sắp xếp giảm dần theo số lượng sv đki 
		Set<Course> course2 = f1.filterCourses("LT");
		System.out.println("Cac course theo LT: " + course2);
	}

}
 