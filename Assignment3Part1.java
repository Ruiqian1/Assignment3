import javax.swing.JOptionPane;

public class Assignment3Part1 {

	public static void main(String[] args) {
		
		int i=1;
String username, password, usernameinput, passwordinput;

       username="csc-200";
       password="nova";
       do{
    	   usernameinput=JOptionPane.showInputDialog(null,"Enter your username.(csc-200)");
    	   if(username.equals(usernameinput)){
    		   do{
    			   passwordinput=JOptionPane.showInputDialog(null,"Enter your password.(nova)");
    			   if(password.equals(passwordinput)){
    				   JOptionPane.showMessageDialog(null,"Welcome"+username+".");return;
                      
    			   }else{i++;}
    		   }while(i<=3);
    		   JOptionPane.showMessageDialog(null, "We are sorry, your account has been locked, please contact the administrator."); return;
    	   } else{
    		   i++;
    		   JOptionPane.showMessageDialog(null,"Invalid username.");
    	   }
       }while(i<=3);
       JOptionPane.showMessageDialog(null,"We are sorry, your account has been locked, please contact the administrator.");
	}

}
