
package kiosk.mpec.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import kiosk.mpec.entity.User;
import kiosk.mpec.entity.DiaDiem;
import kiosk.mpec.entity.NguoiDuocKhaiSinh;
import kiosk.mpec.impl.ConnectDB;
import kiosk.mpec.impl.User_impl;
import kiosk.mpec.impl.List_impl;

@WebService(serviceName = "KhaiSinhService")
public class KhaiSinhService {
    User_impl user_impl = new User_impl();
    List_impl list_impl = new List_impl();
    
    @WebMethod(operationName = "testConnection")
        public boolean testConnection() {
        //TODO write your implementation code here:
        ConnectDB data = new ConnectDB();
        Connection conn = data.getConnection();
        if(conn != null)
            System.out.println("mai an cut");
            return true;
        return false;
    }

    @WebMethod(operationName = "getListUser")
    public ArrayList<User> getListUser() {
        return user_impl.getListUser();
       
    }

    @WebMethod(operationName = "insertUser")
    public boolean insertUser(String userName,String passWord , String fullName, String email, int role) {
        return user_impl.insertUser(userName, passWord, fullName, email, role);
    }

    @WebMethod(operationName = "updateUser")
    public boolean updateUser(Integer userID, String userName, String passWord, String fullName, String email, int role) {
        return user_impl.updateUser(userID, userName, passWord, fullName, email, role);
    }

    @WebMethod(operationName = "deleteUser")
    public boolean deleteUser(@WebParam(name = "userID") int userID) {
        return user_impl.deleteUser(userID);
    }

    @WebMethod(operationName = "getListNguoiKhaiSinhByUser")
    public ArrayList<NguoiDuocKhaiSinh> getListNguoiKhaiSinhByUser(int userID) {
        return list_impl.getListNguoiDuocKhaiSinhByUser(userID);
    }

    @WebMethod(operationName = "getListNguoiDuocKhaiSinh")
    public ArrayList<NguoiDuocKhaiSinh> getListNguoiDuocKhaiSinh() {
        return list_impl.getListNguoiDuocKhaiSinh();
    }

    @WebMethod(operationName = "getDiaDiem")
    public DiaDiem getDiaDiem(@WebParam(name = "idPhuongXa") int idPhuongXa) {
        return list_impl.getDiaDiem(idPhuongXa);
    }

    @WebMethod(operationName = "getListUserByUserName")
    public ArrayList<User> getListUserByUserName(@WebParam(name = "userName") String userName) {
        return user_impl.getListUserByUserName(userName);
    }

    @WebMethod(operationName = "checkUserLogin")
    public boolean checkUserLogin(@WebParam(name = "userName") String userName, @WebParam(name = "passWord") String passWord) {
        return user_impl.checkUserLogin(userName, passWord);
    }
    
}
