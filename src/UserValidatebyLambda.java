interface Usercheck{
    String check(String message);
}
public class UserValidatebyLambda {
    public static void main(String[] args) {
           Usercheck Firstname = (String message)->{
               if(message.matches("^[A-Z][A-Z a-z]{3,25}$")) {
                   return ("Valid first name");
               }
               else {
                   return ("Invalid first name");
               }
           };
           Usercheck Lastname = (String message)->{
               if(message.matches("^[A-Z][A-Z a-z]{3,25}$")) {
                   return ("Valid last name");
               }
               else {
                   return ("Invalid last name");
               }
           };
           Usercheck Emailid = (String message)->{
               if(message.matches("^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$")) {
                   return ("valid email address");
               }
               else {
                   return ("Invalid email address");
               }
           };
           Usercheck Phone = (String message)->{
               if(message.matches("[91 ]{3}[789]{1}\\d{9}")) {
                   return ("Valid phone number");
               }
               else {
                   return ("Invalid phone number");
               }
           };
           Usercheck password = (String message)->{
               if(message.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&$]).{8,}$")) {
                   return ("Valid password");
               }
               else {
                   return ("Invalid password");
               }
           };

           System.out.println("First name is "+Firstname.check("Murali"));
           System.out.println("First name is "+Firstname.check("mu"));
           System.out.println("Last name is "+Lastname.check("Java"));
           System.out.println("Last name is "+Lastname.check("ja"));
           System.out.println("EmailID is "+Emailid.check("murali@example.com"));
           System.out.println("EmailID is "+Emailid.check("@mur@.hello@"));
           System.out.println("Phone number is "+Phone.check("91 9894118421"));
           System.out.println("Phone number is "+Phone.check("6578"));
           System.out.println("Password is "+password.check("Murali@18"));
           System.out.println("Password is "+password.check("mu"));
    }
}
