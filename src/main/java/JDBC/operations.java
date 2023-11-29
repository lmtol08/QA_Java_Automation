package JDBC;
import java.sql.*;
import java.util.*;

public class operations {
    public void readData(String query, Object... parameters) {
        //query passses

        try {Connection conn = connection.getConnection();
            // conn is the instance

            PreparedStatement preparedStatement = conn.prepareStatement(query);
// class prfepared statement. if there do and pass query to object preparedStatement
            // result set are stored here by excuting query
            ResultSet resultSet = preparedStatement.executeQuery();
            // go over each  an object canstore everything
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (resultSet.next()) {
            //    while it has next do loop
                   // whenits greater than  collect all data and seperate by comma and print
                     //   print each on new line
                for (int i = 1; i <= columnsNumber; i++) {
                   if(i>1) System.out.print(", ");
                   String columnValue = resultSet.getString(i);
                    System.out.println(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println();
            }
            /*
             int i = 1;
            for (Object parameter : parameters) {
                preparedStatement.setObject(i++, parameter);
            }
            ResultSet resultSet = preparedStatement.executeQuery();
             */
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void writeData(String query,Object...parameters){
        try(Connection conn = connection.getConnection();
            PreparedStatement preparedStatement =  conn.prepareStatement(query)){

            int i =1;
            for (Object parameter : parameters){
                preparedStatement.setObject(i++,parameter);
            }

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteData(String query, Object... parameters) {
        try (Connection conn = connection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            int i = 1;
            for (Object parameter : parameters) {
                preparedStatement.setObject(i++, parameter);
            }

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateData(String query, Object... parameters) {
        try (Connection conn = connection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            int i = 1;
            for (Object parameter : parameters) {
                preparedStatement.setObject(i++, parameter);
            }

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}