package _Mediator;

public class Email {
private String email,subject;

public void setEmail(String email) {
	this.email=email;
}
public String getEmail() {
	return email;
}
public void setSubject(String subject) {
	this.subject=subject;
}
public String getSubject() {
	return subject;
}
public Email(String email) {
	this.email=email;
	
	
}
public void sendMail(String subject,String mail) {
	mailBox.showMail(this, subject,mail);
}
}
