package cn.edu.hit.dataservice.mapper;

import cn.edu.hit.dataservice.model.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommonMapper {

    void addData(Data data);

    List<Data> getDataByType(String type);

}
