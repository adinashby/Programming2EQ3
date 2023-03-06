import java.io.Serializable;

public class Student implements Serializable {

	String id;
	String fname;
	String lname;
	int age;
	char gender;

	public Student(String id, String fname, String lname, int age, char gender) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
	}

//	@Override
//	public int compareTo(Student student) {
//		// return this.age - student.age; // sort based on the age, ascending
//		return (this.age - student.age) * 1000 + 
//				this.lname.compareTo(student.lname) * 100
//				+ this.id.compareTo(student.id);
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", gender=" + gender
				+ "]";
	}

}
