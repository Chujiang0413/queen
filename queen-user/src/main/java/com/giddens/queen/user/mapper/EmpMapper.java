package com.giddens.queen.user.mapper;

import com.giddens.queen.user.bean.EmpInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    List<EmpInfo> selectEmpInfoList();

    void insertEmpInfo(EmpInfo empInfo);
}
