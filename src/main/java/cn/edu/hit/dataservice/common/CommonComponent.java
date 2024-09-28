package cn.edu.hit.dataservice.common;

import cn.edu.hit.dataservice.dto.CommonDto;
import cn.edu.hit.dataservice.mapper.CommonMapper;
import cn.edu.hit.dataservice.model.Data;
import cn.edu.hit.dataservice.util.JsonUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommonComponent {

    @Resource
    CommonMapper commonMapper;

    public <T> List<CommonDto<T>> getDataByType(String type, Class<T> clazz){
        List<Data> dataList = commonMapper.getDataByType(type);
        return dataList.stream().map(item -> new CommonDto<>(item.getId(), item.getType(),
                JsonUtil.fromJson(item.getContent(), clazz))).toList();
    }

}
