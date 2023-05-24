import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    var answer1 = "Eli Whitney";
    
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Good to see you what is your name?"); 
    userName = myObj.nextLine();   
       
    System.out.println("Nice to meet you!: " + userName); 
    
    String question;
    System.out.println("My name is Eli Whitney, now ask me a question");
    question = myObj.nextLine();
    
    if (question == ("What is your name?"))
    {
        System.out.println(answer1);
    }
  }
}

            
        
        
