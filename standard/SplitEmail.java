package Standard;

public class SplitEmail {
    public static void main(String[] args) {
        String email = "ramanathan20032@gmail.com";
        splitMail(email);
    }
    static void splitMail(String email){
        String[] parts = email.split("@");

        if(parts.length == 2){
            System.out.println("Username   : " + parts[0]);
            System.out.println("DomainName : " + parts[1]);
        }
        else {
            System.out.println("Invalid Email");
        }
    }
}
