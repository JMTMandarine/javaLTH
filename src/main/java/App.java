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
        while(true) {
            String menu=promptMenu();
            if(menu.equals("1")) {
                serviceStudentMenu();
            }else if(menu.equals("0")) {
                System.err.println("시스템을 종료합니다.");
                break;
            }
            
            
        }
    }
    private static void serviceStudentMenu() {
        while(true) {
            System.out.println("<학생관리 시작(list/add/quit)>");
            String command=in.nextLine();
            if(command.equals("list")) {
                printMember();
            }else if(command.equals("add")) {
                inputMember();
            }else if(command.equals("quit")) {
                break;
            }else {
                System.out.println("해당 메뉴가 존재하지 않습니다.");
            }
        }
    }
    
    private static String promptMenu() {
        System.out.println("[메뉴]");
        System.out.println("1.학생관리");
        System.out.println("2.강사관리");
        System.out.println("3.매니저관리");
        System.out.println("0.종료");
        
        while(true) {
            System.out.println("메뉴번호 입력>");
            String menu = in.nextLine();
            
            switch(menu){
            case "1":
            case "2":
            case "3":
            case "0":
                return menu;
            default:
                System.out.println("해당하는 메뉴가 존재하지않습니다.");
            }
        }
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


