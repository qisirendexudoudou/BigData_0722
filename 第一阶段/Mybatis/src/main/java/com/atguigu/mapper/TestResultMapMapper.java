package com.atguigu.mapper;

import com.atguigu.entity.Department;
import com.atguigu.entity.Employee;
import com.atguigu.entity.Employee2;

/*
 * 1. 现实生活中 不同类型对象的对应关系
 * 			抽象：   1 对 1
 * 				 1 对 N
 * 				 N 对 1
 * 				N 对 N：  N * 1 * N
 * 
 * 			在关系型数据库中保存时，只考虑 1 对 1，1对N 
 * 				教室       教师      时间
 * 				A    a	  am
 * 				A    b    pm
 * 				B    a	  pm
 * 				B    b    am
 * 
 * 2. 以一个员工对应一个部门:  
 * 				①要么使用级联属性取值：　　<property= "属性.属性">
 * 				②<association property="级联属性名" javaType="级联属性类型">
 * 	  一个部门可以有多个员工:
 * 				使用
 * 				<collection property="级联属性名" ofType="集合中元素类型">
 * 
 * 3. Mybatis扩展
 * 			Mybatis-generator:  一键生成器
 * 			通用Mapper:  
 * 			MybatisPlus
 * 			
 * 
 * 
 * 			
 * 
 */
public interface TestResultMapMapper {
	
	/*Employee2 getEmployeeById(Integer id);*/
	
	Employee getEmployeeById(Integer id);
	
	Department getDepartmentById(Integer id);

}
