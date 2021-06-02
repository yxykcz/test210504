package com.guanggu.boot.mapper;

import com.guanggu.boot.bean.Department;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface DepartmentMapper {
        //第二次修改


        @Select("select * from department where id=#{id}")
        public Department getDepartmentById(Integer id);

        @Delete("delete from department where id=#{id}")
        public  int deleteDepartmentById(Integer id );


        //useGeneratedKeys = true 是不是使用自动生成的主键，keyProperty = "id"  表示id是封装的主键
        @Options(useGeneratedKeys = true,keyProperty = "id")
        @Insert("insert into department(department_name) values(#{departmentName})")
        public  int insertDepartment(Department department );

        @Update("update department set departmentName=#{departmentName} where id=#{id} ")
        public  int updateDepartmentById(Department department );

}
