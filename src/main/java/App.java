import java.util.Scanner;




public class App {
        static Scanner in=new Scanner(System.in);
        static Member[] member=new Member[100] ;
        

        static String answer;
        static  int index=0;
        
        public static void main(String[] args) {
        
        inputMember();
        
        printMember();
        
        in.close();
        
    }
    
    
    static void inputMember() {
            while(true) {
            
            Member m = new Member();
            
            System.out.println("이름을 입력해주세요 ㅎㅎ");
            m.setNames(in.nextLine());
            
            System.out.println("이메일을 입력해주세요 ㅎㅎ");
            m.setEmils(in.nextLine());
            
            System.out.println("비밀번호을 입력해주세요 ㅎㅎ");
            m.setPasswords(in.nextLine());
            
            member[index++]=m;
            
            
            System.out.println("계속입력하시겠습니까? (Y/n)");
            answer=in.nextLine();
   
            if(answer.toLowerCase().equals("n"))
                break;            
        }
        
    }
    
    static void printMember() {
        for(int i=0;i<index;i++) {
            
            System.out.printf("%s %s %s\n"
                            ,member[i].getNames()
                            ,member[i].getEmils()
                            ,member[i].getPasswords());
        } 
    }
    
    static class Member {
        String names;
        String emils;
        String passwords;
        public String getNames() {
            return names;
        }
        public void setNames(String names) {
            this.names = names;
        }
        public String getEmils() {
            return emils;
        }
        public void setEmils(String emils) {
            this.emils = emils;
        }
        public String getPasswords() {
            return passwords;
        }
        public void setPasswords(String passwords) {
            this.passwords = passwords;
        }
        
        
    }
}


