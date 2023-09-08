package com.ncit.springboot_test.dao;

import com.ncit.springboot_test.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository         //  @MapperScanner(“dao层接口所对应的包”) 扫描dao包所有接口，容器中实例化所有的实现类
// @Mapper           // 注解的作用 ：让Spring容器帮我们实例化一个对应接口的实现类
public interface EmpDao {

      // 新增员工
      public  void  insertEmp( Emp emp);

      public List<Emp> selectAllEmp();

}
