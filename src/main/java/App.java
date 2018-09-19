import java.util.Scanner;

public class App {
    static Scanner in=new Scanner(System.in);
    static int index=0;
    static Member[] member=new Member[100];
    
    static class Member{
        String name;
        String email;
        String password;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
    }
    
    
    public static void main(String[] args) {
        
        
        inputMember();
        
        printMember();

        in.close();
    }

    static void inputMember() {
        
        while(true) {
            Member m=new Member();
            System.out.println("이름을 입력해주세용");
            m.setName(in.nextLine());
            System.out.println("이메일을 입력해주세용");
            m.setEmail(in.nextLine());
            System.out.println("비밀번호를 입력해주세용");
            m.setPassword(in.nextLine());

            
            member[index++]=m;
            System.out.println("계속하시겠습니까? (Y/n)");
            String answer=in.nextLine();
            if(answer.equals("n"))
                break;
        }
    }

    static void printMember() {
        for(int i=0; i<index; i++) {
            System.out.printf("%s, %s, %s\n"
                        ,member[i].getName()
                        ,member[i].getEmail()
                        ,member[i].getPassword());
        }
    }
}


