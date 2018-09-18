import java.util.Scanner;



public class App {
    static Scanner in=new Scanner(System.in);
    static String[] name=new String[5];
    static String[] email=new String[5];
    static String[] password=new String[5];
    static int index=0;
    
    public static void main(String[] args) {
        inputMember();
        
        printMember();

        in.close();
    }

    static void inputMember() {
        
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
    }

    static void printMember() {
        for(int i=0; i<index; i++) {
            System.out.printf("%s, %s, %s\n",name[i],email[i],password[i]);
        }
    }
}


