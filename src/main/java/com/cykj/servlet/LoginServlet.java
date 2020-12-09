package com.cykj.servlet;

import com.cykj.utils.Log;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet({"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String account = request.getParameter("username");
        String pwd = request.getParameter("password");
        System.out.println(account+"===="+pwd);
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java4?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, "monkey", "123456");
            PreparedStatement pstm = null;
            ResultSet rs = null;
            String sql = "select t.* from t_user t where t.username = ? and t.password = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, account);
            pstm.setString(2, pwd);
            rs = pstm.executeQuery();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
