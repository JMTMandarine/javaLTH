import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name;
        String email;
        String password;
        String answer;
        
        
        while(true) {
            
            System.out.println("이름을 입력해주세요 ㅎㅎ");
            name=in.nextLine();
            
            System.out.println("이메일을 입력해주세요 ㅎㅎ");
            email=in.nextLine();
            
            System.out.println("비밀번호을 입력해주세요 ㅎㅎ");
            password=in.nextLine();
            
            System.out.printf("%s %s %s\n",name,email,password);
            
            System.out.println("계속입력하시겠습니까? (Y/n)");
            answer=in.nextLine();
            
            
            
            if(answer.toLowerCase().equals("n"))
                break;
            
        }
        
        
        
        
    }
}
