package com.atguigu.exer;

import java.util.Scanner;
import org.junit.Test;

public class demo1 {

    @Test
    public void testAddStudent() {
        Student student = getStudentFromConsole();
        AddStudent(student);
    }

    public Student getStudentFromConsole() {
        Scanner s = new Scanner(System.in);
        Student student = new Student();

        System.out.print("id: ");
        student.setId(s.nextInt());

        System.out.print("name: ");
        student.setName(s.next());

        return student;
    }

    public void AddStudent(Student student) {

        //1.sql语句
        String sql = "insert into student values(" + student.getId() + ""
                + ",' " + student.getName() + "  ')";

        //2.调用JDBCTools类中的update（）方法插入到数据库中
        JDBCTools.update(sql);

    }

}
