package homeWork3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
        student.setFirstName("cihan");
        student.setLastName("Gemi");
        student.setNumber("1721012075");
        student.setSchool("sdü");
        student.setEmail("dasdsa@mail.com");
        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("asdas@mail.com");
        instructor.setCertificate("MCT,PMP,ITIL");
        
        UserManager userManager = new UserManager();
        User[] users = {student,instructor};
        userManager.addMultiple(users);

	}

}
