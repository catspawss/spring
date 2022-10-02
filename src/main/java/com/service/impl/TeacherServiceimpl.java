package com.service.impl;

import com.dao.TeacherDAO;
import com.entity.Teacher;
import com.service.TeacherService;

public class TeacherServiceimpl implements TeacherService {
    private TeacherDAO dao;

    public void setDao(TeacherDAO dao) {
        this.dao = dao;
    }

    @Override
    public void doAdd(Teacher teacher) {
        dao.add(teacher);
    }
}
