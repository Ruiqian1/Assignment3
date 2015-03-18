import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class UsernameAssignment {

	public static void main(String[] args) {
		
		int i=1;
String username, password, usernameinput, passwordinput;
JPanel panel= new JPanel();
panel.add(new JLabel("Please select the type of your account"));	
DefaultComboBoxModel mode = new DefaultComboBoxModel();
mode.addElement("Admin");
mode.addElement("Student");
mode.addElement("Staff");
JComboBox box=new JComboBox(mode);
panel.add(box);
       username="csc-200";
       password="nova";
       do{
    	   usernameinput=JOptionPane.showInputDialog(null,"Enter your username.(csc-200)");
    	   if(username.equals(usernameinput)){
    		   do{
    			   passwordinput=JOptionPane.showInputDialog(null,"Enter your password.(nova)");
    			   if(password.equals(passwordinput)){
    				   JOptionPane.showConfirmDialog(null, panel, "Account", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    					switch(box.getSelectedIndex()){
    					case 0:JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read file.");
    					return;
    					case 1: do{JOptionPane.showMessageDialog(null,"Please select the correct account type.");
    					JOptionPane.showConfirmDialog(null, panel, "Account", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    					}while(box.getSelectedIndex()!=0);
    					JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read file."); return;
    					case 2:do{JOptionPane.showMessageDialog(null,"Please select the correct account type.");
    					JOptionPane.showConfirmDialog(null, panel, "Account", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    					}while(box.getSelectedIndex()!=0);
    					JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read file.");return;}  
    				  
                      
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
