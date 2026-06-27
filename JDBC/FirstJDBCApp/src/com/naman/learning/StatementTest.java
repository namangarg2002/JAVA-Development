package com.naman.learning;

import java.sql.Connection;
import java.sql.Statement;

public class StatementTest {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {

            con = JdbcUtil.getConnection();
            stmt = con.createStatement();

            long start = System.currentTimeMillis();

            for (int i = 1; i <= 10000; i++) {

                int id = RandomStudentGenerator.getId(i);
                String name = RandomStudentGenerator.getName();
                int age = RandomStudentGenerator.getAge();
                String city = RandomStudentGenerator.getCity();

                String sql =
                        "INSERT INTO studentinfo(id,sname,sage,scity) VALUES(" +
                        id + ",'" + name + "'," + age + ",'" + city + "')";

                stmt.executeUpdate(sql);
            }

            long end = System.currentTimeMillis();

            System.out.println("Statement Time : " + (end - start) + " ms");

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            JdbcUtil.closeConnection(con, stmt);
        }
    }
}