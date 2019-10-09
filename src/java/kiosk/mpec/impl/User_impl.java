
package kiosk.mpec.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kiosk.mpec.dao.User_dao;
import kiosk.mpec.entity.User;

public class User_impl implements User_dao{
    Connection conn = new ConnectDB().getConnection();
    ResultSet rs;
    Statement st;
    PreparedStatement ps;
    String sql;
    
    @Override
    public ArrayList<User> getListUser() {

       ArrayList listUser = new ArrayList<User>();
       sql = "select * from user;";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                User user = new User();
                user.setUserID(rs.getInt("userID"));
                user.setUserName(rs.getString("userName"));
                user.setFullName(rs.getString("fullName"));
                user.setEmail(rs.getString("email"));;
                user.setRole(rs.getInt("role"));
                listUser.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUser;
    }
        @Override
    public ArrayList<User> getListUserByUserName(String userName) {
        ArrayList<User> list = new ArrayList<User>();
        sql = "SELECT * FROM user where (userName like '% "+ userName + "' ) or (userName like '"+ userName + " %' ) or (userName like '% "+ userName + " %' )  ";
        try {
            st =conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                User user = new User();
                user.setUserID(rs.getInt("userID"));
                user.setUserName(rs.getString("userName"));
                user.setPassWord(rs.getString("password"));
                user.setFullName(rs.getString("fullName"));
                user.setEmail(rs.getString("email"));;
                user.setRole(rs.getInt("role"));
                list.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }

    public boolean insertUser(String userName, String passWord,String fullName, String email, int role) {
        sql = "insert into user(userName, passWord, fullName, email, role) value(?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, passWord);
            ps.setString(3, fullName);
            ps.setString(4, email);
            ps.setInt(5, role);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(User_impl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean updateUser(Integer userID, String userName, String passWord, String fullName, String email, int role) {
        sql = "update user set userName = ?, passWord = ?, fullName = ?, email = ?, role = ? where userID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, passWord);
            ps.setString(3, fullName);
            ps.setString(4, email);
            ps.setInt(5, role);
            ps.setInt(6,userID);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(User_impl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    @Override
    public boolean deleteUser(int userID) {
        sql = "delete from user where userID = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,userID);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(User_impl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    @Override
    public boolean checkUserLogin(String userName, String passWord) {
        sql = "select * from user where userName = '" + userName + "'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("passWord").equals(passWord)) return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


}
