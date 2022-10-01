package com.dao.impl;

import com.dao.StudentDAO;
import org.springframework.stereotype.Component;

//Component 组件,该注解能将该类交给Spring托管，只能加载实现类上面
//等同于在配置文件加入<bean id="stuDao" class="com.dao.StudentDAOimpl"/>
//如果没有起名字，默认类名首字母小写（studentDAOimpl）
//使用此注解需要开启组件扫描,让Spring进行扫描加入
@Component("stuDAO")
public class StudentDAOimpl implements StudentDAO {
    public void  add() {
        System.out.println("----------------add--------------");
    }

    public void update() {
        System.out.println("----------------update--------------");
    }

    public void delete() {
        System.out.println("----------------delete--------------");
    }
}
