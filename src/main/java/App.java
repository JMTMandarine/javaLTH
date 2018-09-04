import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] name=new String[100] ;
        String[] email=new String[100];
        String[] password=new String[100];
        String answer;
        int index=0;
        
        
        while(true) {
            
            System.out.println("이름을 입력해주세요 ㅎㅎ");
            name[index]=in.nextLine();
            
            System.out.println("이메일을 입력해주세요 ㅎㅎ");
            email[index]=in.nextLine();
            
            System.out.println("비밀번호을 입력해주세요 ㅎㅎ");
            password[index]=in.nextLine();
            
            index++;
            
            System.out.println("계속입력하시겠습니까? (Y/n)");
            answer=in.nextLine();
   
            if(answer.toLowerCase().equals("n"))
                break;            
        }
        for(int i=0;i<index;i++) {
            
            System.out.printf("%s %s %s\n"
                            ,name[i]
                            ,email[i]
                            ,password[i]);
        }
        
        
        
        
    }
}
