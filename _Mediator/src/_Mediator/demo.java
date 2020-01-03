package _Mediator;

public class demo {
	public static void main(String[]args) {
		Email e1= new Email("mm.ezgn@gmail.com");
		e1.sendMail("Final Exam","Hello There ! I have some trouble for final exam. I don't know the subjects of final.");
		Email s2=new Email("tanercevik@hotmail.com");
		s2.sendMail("Final Subjects", "Final will cover all subjects we stuidied at class.");
	}

}
