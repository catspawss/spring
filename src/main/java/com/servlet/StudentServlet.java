package com.servlet;

import com.dao.StudentDAO;
import com.dao.impl.StudentDAOimpl;
import com.util.SpringTool;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StudentServlet {
    private StudentDAO dao= (StudentDAO)SpringTool.getBean("stuDAO");
    public void service(){
        dao.add();
    }
}
