import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        while(true) {
            System.out.println("이름을 입력해주세용");
            String name=in.nextLine();
            System.out.println("이메일을 입력해주세용");
            String email=in.nextLine();
            System.out.println("비밀번호를 입력해주세용");
            String password=in.nextLine();
            System.out.printf("%s, %s, %s\n",name,email,password);
            
            System.out.println("계속하시겠습니까? (Y/n)");
            String answer=in.nextLine();
            if(answer.equals("n"))
                break;
        }
    }
}


