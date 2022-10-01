package com.service.impl;

import com.dao.StudentDAO;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class StudentServiceimpl implements StudentService {
    //当依赖的类使用注解进行管理，需要用@Autowired来自动注入所需的依赖,优先通过名字找，然后类型（StudentDAO 类型后 stuDAO 名先）
    //根据类型来注入，当多个同时实现了，报错.如 @Component("stuDAO") 会先找stuDAO的，多个报错
    //@Qualifier("stuDAO")根据姓名查询注入指定的依赖
    //可加在私有属性上，Spring通过反射注入，不通过set方法
    //@Autowired写在set方法上，则调用set方法注入
    //也可以加在构造函数，一般加在属性上

    //@Resourc是java自带的，@Autowired是Spring的,用法基本相同
    //@Resource(name="")用于指定依赖，只用一句即可
    @Resource
    private StudentDAO stuDAO;

    //public void setStuDAO(StudentDAO stuDAO) {
    //    this.stuDAO = stuDAO;
    //}

    public void doAdd() {
        stuDAO.add();
    }

    public Integer sum(int num1, int num2) {
        System.out.println("======sum======");
        return num1+num2;
    }

}
