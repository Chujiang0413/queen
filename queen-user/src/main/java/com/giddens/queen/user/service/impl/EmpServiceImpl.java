package com.giddens.queen.user.service.impl;

import com.giddens.queen.user.bean.EmpInfo;
import com.giddens.queen.user.mapper.EmpMapper;
import com.giddens.queen.user.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper userMapper;

    @Override
    public List<EmpInfo> getEmpInfo() {
        List<EmpInfo> list = userMapper.selectEmpInfoList();
        return list;
    }

    @Override
    public void addEmpInfo(EmpInfo empInfo) {
        userMapper.insertEmpInfo(empInfo);
    }
}
