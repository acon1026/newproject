package student;

import java.util.ArrayList;

public class Student {
	
	
	
	
	int snumber;
	String id;
	String pw;
	String name;
	String birthday;
	
	public Student() {}
	public Student(int snumber, String id, String pw, String name, String birthday) {
		super();
		this.snumber = snumber;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Student [snumber=" + snumber + ", id=" + id + ", pw=" + pw + ", name=" + name + ", birthday=" + birthday
				+ "]";
	}
	public int getSnumber() {
		return snumber;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getBirthday() {
		return birthday;
	}
	
	
	
	
	
	
	
	
	
 
	
	
	
	
}
