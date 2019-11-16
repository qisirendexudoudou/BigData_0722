package com.atguigu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.atguigu.entity.Employee;

public interface EmployeeMapper {
	
	Employee getEmployeeById(Integer id);
	
	// 增删改的返回值，可以是void，int,long,boolean及其包装类
	
	// 插入员工时，希望返回插入员工的id
	boolean insertEmployee(Employee employee);
	
	void deleteEmployeeById(Integer id);
	
	void updateEmployee(Employee employee);
	
	// 查询集合
	List<Employee> getEmps();
	
	// 将查询的列名作为key，列值作为value，封装为Map
	Map<String,Object>  getEmpsWithMap(Integer id);
	
	// {唯一标识=Employee对象，key2=Employee2}
	// @Mapkey代表将查询的结果集中的哪一列作为map的key，将这列中每个字段所在的行封装为一个POJO，作为value
	@MapKey(value = "id")
	Map<String,Employee>  getEmpsWithMap2(Integer id);

}
