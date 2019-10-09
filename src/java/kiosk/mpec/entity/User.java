
package kiosk.mpec.entity;

public class User {
    private Integer userID;
    private String userName;
    private String passWord;
    private String fullName;
    private String email;
    private int role;
    
    //Constructor
    public User(){
        
    }
    public User(Integer userID, String userName, String passWord, String email, int role){
        this.userID = userID;
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
        this.email = email;
    }
   //getters and setters

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
    
    
    
}
