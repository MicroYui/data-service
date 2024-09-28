package cn.edu.hit.dataservice.controller;

import cn.edu.hit.dataservice.common.Result;
import cn.edu.hit.dataservice.model.BasicInformation;
import cn.edu.hit.dataservice.model.Data;
import cn.edu.hit.dataservice.service.CommonDataService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/common")
public class CommonDataController {

    @Resource
    CommonDataService commonDataService;

    @PostMapping("/data")
    public Result<?> addData(@RequestBody Data data) {
        commonDataService.addData(data);
        return new Result<>().success().data(data);
    }

    @GetMapping("/data/{type}")
    public Result<?> getData(@PathVariable(name = "type") String type) {
        return new Result<>().success().data(commonDataService.getDataByType(type));
    }

}
