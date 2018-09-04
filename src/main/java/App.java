import java.util.Scanner;

public class App {
        static Scanner in=new Scanner(System.in);
        static String[] name=new String[100] ;
        static String[] email=new String[100];
        static String[] password=new String[100];
        static String answer;
        static  int index=0;
        
        public static void main(String[] args) {
        
        inputMember();
        
        printMember();
        
        in.close();
        
    }
    
    
    static void inputMember() {
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
        
    }
    
    static void printMember() {
        for(int i=0;i<index;i++) {
            
            System.out.printf("%s %s %s\n"
                            ,name[i]
                            ,email[i]
                            ,password[i]);
        } 
    }
}
