package com.atguigu.exer;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.atguigu.java2.JdbcConnection;

public class JDBCTools {


    /**
     * 对数据库的操作（查询）
     */
    public void testResultSet() {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {

            //1.获取数据库连接
            connection = getConnection();

            //2.调用Connection对象的CreateaStream(）方法获取Statement对象
            statement = connection.createStatement();

            //3.需要执行的SQL语句
            String sql = "select id,name from Student;";

            //4.执行sql语句，调用statement对象的executeQuery（sql）方法,得到ResultSet对象
            resultSet = statement.executeQuery(sql);

            //5.处理结果集
            //5.1  调用ResultSet的next（）方法：查看结果集的下一条记录是否有效，如果有效则指针下移
            while (resultSet.next()) {
                //5.2 getXXX（）方法获取列的具体的值
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);

                System.out.println("id = " + id + "	" + "name = " + name);
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6. 关闭数据库资源
            releaseDB(resultSet, statement, connection);
        }

    }

    /**
     * 对数据库的操作(增删改)
     *
     * @param sql
     */
    public static void update(String sql) {

        Connection connection = null;
        Statement statement = null;

        try {
            //1.获取数据库连接
            connection = getConnection();

            //2.调用Connection对象的CreateaStream(）方法获取Statement对象
            statement = connection.createStatement();

            //3.需要执行的SQL语句

            //4.执行sql语句，调用statement对象的executeUpdate（）方法
            statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.关闭数据库资源
            releaseDB(null, statement, connection);
        }
    }

    /**
     * 关闭数据库资源的方法
     *
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void releaseDB(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取数据库连接的方法
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    private static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        InputStream in = JdbcConnection.class.getClassLoader().getSystemResourceAsStream("jdbc.properties");
        properties.load(in);

        //1.从配置文件中读取 连接数据库所需要的四个参数
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String jdbcUrl = properties.getProperty("jdbcUrl");
        String driverClass = properties.getProperty("driver");


        //2.加载数据库驱动
        Class.forName(driverClass);

        //3.调用DriverManager.getConnection()方法
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
        return connection;
    }

}
