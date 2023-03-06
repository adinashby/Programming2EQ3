import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
        return (s1.age - s2.age) * 10000
                + s1.fname.compareTo(s2.fname)
                + s1.lname.compareTo(s2.lname);
	}
	

}
