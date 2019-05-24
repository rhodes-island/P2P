package com.p2p.controller;


import com.p2p.mapper.StudentMapper;
import com.p2p.pojo.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author 李畅
 * @date 2019/5/14
 */
@Controller
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;


    @RequestMapping("/showUsers")
    public String showUsers(Model model) {
        model.addAttribute("userList", studentMapper.showAll());
        System.out.println(studentMapper.showAll());
        return "updateUser";
    }



}
