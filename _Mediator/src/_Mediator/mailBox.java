package _Mediator;

import java.util.Date;

public class mailBox {
public static void showMail(Email email,String subject,String mail) {
	System.out.println(new Date().toString()+"["+email.getEmail()+"]: "+"Subject: "+subject+" Mail: "+mail);
}
}
