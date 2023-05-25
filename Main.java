import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    String str = "Westborough, MA.";
    String str2 = "Yes, I am married to Henrietta Edwards. ";
    String str3 = "Yes I have a daughter and a son. They are named Elizabeth Fay Whitney and Eli Whitney Jr. ";
    
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Good to see you what is your name?"); 
    userName = myObj.nextLine();   
       
    System.out.println("Nice to meet you!: " + userName); 
    
    String question;
    System.out.println("My name is Eli Whitney, now ask me a question");
    question = myObj.nextLine();
    
    if (question.equals ("Where are you from?"))
    {
        System.out.println(str);
    }
    
    String question2;
    System.out.println("Now ask another question"); 
    question2 = myObj.nextLine();   
    
    if (question2.equals ("Are you married?"))
    {
        System.out.println(str2);
    }
    
    String question3;
    System.out.println("Now ask another question"); 
    question3 = myObj.nextLine();  
    
     if (question3.equals ("Do you have kids?"))
    {
        System.out.println(str3);
    }
    
  }
}

            
        
        
