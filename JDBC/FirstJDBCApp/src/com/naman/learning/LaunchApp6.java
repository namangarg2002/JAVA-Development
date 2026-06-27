package com.naman.learning;
import java.sql.*;
public class LaunchApp6{
    public static void main(String[] args) {
        
        Connection connect = null;
        Statement statement = null;

        try {
            // connection creation using boilerplate
            connect = JdbcUtil.getConnection();

            // Creating Statement
            statement = connect.createStatement();

            // excecute the query
            // // for retrival
            // String sql = "SELECT * FROM studentinfo"; 

            // // for insertion
            // String sql = "INSERT INTO studentinfo (id, sname, sage, scity) VALUES (2, 'Rahul', 21, 'Delhi')";

            // // for updation 
            // String sql = "UPDATE studentinfo SET scity = 'Agra' WHERE id = 2";

            // for deletion
            String sql = "UPDATE studentinfo SET sname = 'Naman', sage = 23, scity = 'Hathras' WHERE id = 1";
            boolean status = statement.execute(sql);
            // process the result
            if(status == true){
                ResultSet rs = statement.getResultSet();
                while (rs.next()) {
                    String name = rs.getString(2);
                    System.out.println(name);
                }
                // closing the resultSet
                rs.close();
            }else{
                int rowAffected = statement.getUpdateCount();
                if(rowAffected == 0){
                    System.out.println("Updation failed");
                }else{
                    // System.out.println("Data updated Successfully");

                    // if you want to know what kind of updation take place in the query
                    String command = sql.split("\\s+")[0].toUpperCase();
                    switch(command){
                        case "SELECT":
                            // handle ResultSet
                            break;

                        case "INSERT":
                            System.out.println("Data Inserted Successfully");
                            break;

                        case "UPDATE":
                            System.out.println("Data Updated Successfully");
                            break;

                        case "DELETE":
                            System.out.println("Data Deleted Successfully");
                            break;
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            // close the resources
            JdbcUtil.closeConnection(connect, statement);
            
        }
    }
} 