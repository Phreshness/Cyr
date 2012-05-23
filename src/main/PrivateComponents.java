package main;
import javax.swing.JTextField;


public class PrivateComponents{

    private String username;
    private String password;
    
    public PrivateComponents(){
        username = "Cyr";
        password = "ltsnare14";
    }
    
    public boolean login(JTextField u, JTextField p){
        boolean result;
        if(u.getText().equals(username) && p.getText().equals(password))
            return true;
        else return false;
    }



}