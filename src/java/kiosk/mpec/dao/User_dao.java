
package kiosk.mpec.dao;
import java.util.ArrayList;
import kiosk.mpec.entity.User;

public interface User_dao {
    ArrayList<User>  getListUser();
    ArrayList<User>  getListUserByUserName(String userName);
    boolean insertUser(String userName,String passWord , String fullName, String email, int role);
    boolean updateUser(Integer userID, String userName, String passWord, String fullName, String email, int role);
    boolean deleteUser(int userID);
    boolean checkUserLogin(String userName, String passWord);
}
