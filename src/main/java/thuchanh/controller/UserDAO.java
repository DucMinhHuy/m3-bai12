package thuchanh.controller;

import thuchanh.methodrs.IUserDAO;
import thuchanh.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class UserDAO implements IUserDAO {
    private String jdbcURl="jdbc:mysql://localhost:3306/thuchanhbai12?useSSL=false";
    private String jdbcUsername="root";
    private String jdbcPassword="Ducminhhuy";
   private static final String INSERT_USERS_SQL="INSERT INTO users(name,email,country) VALUES (?,?,?);";
   private static final String INSERT_USERS_BY_ID="SELECT id,name,email,country from users where id=?";
   private static final String INSERT_ALL_USERS="SELECT * FROM users";
   private static final String DELETE_USERS_SQL="DELETE FROM users WHERE id=?";
   private static final String UPDATE_USERS_SQL="UPDATE users SET name=?,email=?,country=? WHERE id=?";
public UserDAO() {}
    protected Connection getConnection(){
    Connection connection=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(jdbcURl,jdbcUsername,jdbcPassword);
    }catch (SQLException e){
        e.printStackTrace();
    }catch (ClassNotFoundException e){
        e.printStackTrace();
    }
    return connection;
    }
    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println();
    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }
}
