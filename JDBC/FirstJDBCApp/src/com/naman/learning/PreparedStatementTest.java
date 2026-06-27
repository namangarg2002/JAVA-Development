package com.naman.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PreparedStatementTest {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = JdbcUtil.getConnection();

            String sql =
                    "INSERT INTO studentinfo(id,sname,sage,scity) VALUES(?,?,?,?)";

            ps = con.prepareStatement(sql);

            long start = System.currentTimeMillis();

            for(int i = 1; i <= 10000; i++) {

                ps.setInt(1, RandomStudentGenerator.getId(i));
                ps.setString(2, RandomStudentGenerator.getName());
                ps.setInt(3, RandomStudentGenerator.getAge());
                ps.setString(4, RandomStudentGenerator.getCity());

                ps.executeUpdate();
            }

            long end = System.currentTimeMillis();

            System.out.println("PreparedStatement Time : " + (end - start) + " ms");

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            JdbcUtil.closeConnection(con, ps);
        }
    }
}