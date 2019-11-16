package com.atguigu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.atguigu.entity.Employee;

/*
 * 1. 如果参数列表是多个参数，多个参数会默认封装为一个Map
 * 		例如：getEmployeeById1("jack", 2)
 * 		参数Map:
 * 			key:  arg0-argN
 * 				  param1-paramN
 *         value:  传入的参数值
 * 			 {arg0:jack,arg1:2,param1:jack,param2:2}
 * 
 * 		#{key}:  来参数Map中取出想要的值
 * 				#{arg0-argN}
 * 				#{param1-paramN}
 * 
 * 2. 可以通过命名参数，来替换系统自定义的参数名
 * 		在参数上标注@Param(value="参数名")
 * 	参数Map:
 * 			key:  name,id
 * 				  param1-paramN
 * 
 * 3. 多个参数
 * 		#{key}定位到参数，如果定位的参数是一个POJO，再通过#{key.属性名}获取POJO的指定属性
 * 
 * 4. 参数是一个map
 * 			#{key}: 取出Map中指定key的value属性
 * 
 * 5. 参数是一个数组，会为数组生成一个名为array的key
 * 		参数Map: {array=[0,1,2,3]}
 * 
 * 		取出数组中指定的元素： #{array[index]}
 * 
 * 6. 参数是一个List，会为list生成名为collection|list的key
 * 		参数Map: {collection=[0,1,2,3],list=[0,1,2,3]}
 * 
 * 		取出数组中指定的元素： #{collection[index]|list[index]}
 * 			
 */
public interface EmployeeMapper2 {
	
	
	Employee getEmployeeById1(@Param("name")String name,@Param("id")Integer id);
	
	Employee getEmployeeById2(@Param("e2")Employee e,@Param("e1")Employee e1);
	
	Employee getEmployeeById3(Employee e,Map<String,Object> map);
	
	
	Employee getEmployeeById4(List<Object> list);
	
	Employee getEmployeeById5(Object [] o);
	


}
