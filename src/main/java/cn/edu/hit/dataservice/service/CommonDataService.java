package cn.edu.hit.dataservice.service;

import cn.edu.hit.dataservice.common.CommonComponent;
import cn.edu.hit.dataservice.mapper.CommonMapper;
import cn.edu.hit.dataservice.model.Data;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonDataService {

    @Resource
    CommonMapper commonMapper;

    @Resource
    CommonComponent commonComponent;

    public void addData(Data data){
        commonMapper.addData(data);
    }

    public List<Data> getDataByType(String type){
        return commonMapper.getDataByType(type);
    }

}
