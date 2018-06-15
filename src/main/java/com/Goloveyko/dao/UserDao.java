package com.Goloveyko.dao;

import com.Goloveyko.model.User;
import com.Goloveyko.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private Connection connection;

    public UserDao() {
        connection = DBConnection.getConnection();
    }

    public void addUser(User user) {
        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO users (first_name, last_name, email, date)" +
                    " VALUES (?, ?, ?, ?)")){

            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setDate(4, new java.sql.Date(user.getDate().getTime()));

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        try(PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?")){
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user){
        try(PreparedStatement statement = connection.prepareStatement("UPDATE users SET first_name = ?, " +
                "last_name = ?, email = ?, date = ? WHERE id = ?")){
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setDate(4, new java.sql.Date(user.getDate().getTime()));
            statement.setInt(5, user.getId());

            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users")){
            while(resultSet.next()){
                User user = new User();
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setDate(resultSet.getDate("date"));

                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public User getById(int id){
        User user = new User();

        try(PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id=?")){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setDate(resultSet.getDate("date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
