package Pattern;

public class mailEndsWithDomain {
    public static void main(String[] args) {
        String mail = "ram@gmail.com";
        if(isGmail(mail)){
            System.out.println(mail + " ends with @gmail.com");
        }
        else{
            System.out.println(mail + " not end with  @gmail.com");
        }
    }
    static boolean isGmail(String mail){
        String domain = "@gmail.com";
        return mail.endsWith(domain);
    }
}
