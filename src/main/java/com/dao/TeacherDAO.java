package com.dao;

import com.entity.Teacher;


import java.util.List;

public interface TeacherDAO {
    List<Teacher> getAll();
    void add(Teacher tea);

}
