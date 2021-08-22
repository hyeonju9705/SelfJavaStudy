package mamuri;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum=studentNum;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		//code
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		//code
		if(!(obj instanceof Student)) return false;
		Student student = (Student) obj;
		if(studentNum != student.studentNum) return false;
		return true;
	}
}
