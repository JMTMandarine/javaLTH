import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] name=new String[5];
        String[] email=new String[5];
        String[] password=new String[5];
        
        int index=0;
        while(true) {
            System.out.println("이름을 입력해주세용");
            name[index]=in.nextLine();
            System.out.println("이메일을 입력해주세용");
            email[index]=in.nextLine();
            System.out.println("비밀번호를 입력해주세용");
            password[index]=in.nextLine();
            
            index++;
            
            System.out.println("계속하시겠습니까? (Y/n)");
            String answer=in.nextLine();
            if(answer.equals("n"))
                break;
        }
        
        for(int i=0; i<index; i++) {
            System.out.printf("%s, %s, %s\n",name[i],email[i],password[i]);
        }
        in.close();
    }
}


