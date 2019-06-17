package com.giddens.queen.user.controller;

import com.giddens.queen.user.bean.EmpInfo;
import com.giddens.queen.user.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpService userService;

    @RequestMapping("index")
    public String index(){

        return "index";
    }

    @RequestMapping("getEmpList")
    @ResponseBody
    public ResponseEntity<List<EmpInfo>> getEmpInfo(){
       List<EmpInfo> list = userService.getEmpInfo();
        return ResponseEntity.ok(list);
    }

    @RequestMapping("addEmpInfo")
    public void addEmpInfo(EmpInfo empInfo){
        userService.addEmpInfo(empInfo);
    }

}
