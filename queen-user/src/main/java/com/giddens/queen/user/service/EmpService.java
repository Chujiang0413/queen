package com.giddens.queen.user.service;

import com.giddens.queen.user.bean.EmpInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService {

    List<EmpInfo> getEmpInfo();

    void addEmpInfo(EmpInfo empInfo);
}
