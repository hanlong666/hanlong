package com.example.demo.controller;

import com.example.demo.pojo.Tanimal;
import com.example.demo.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/9/13.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;


   @ResponseBody
   @PostMapping("/nvshen")
   @ApiOperation(value = "查询页面", httpMethod = "POST")
    public List<Tanimal> select() {
       List list=testService.test();
        return list;
    }

    @ResponseBody
    @PostMapping("/nvshenUpdata")
    @ApiOperation(value = "修改页面", httpMethod = "POST")
    public String update(Tanimal tanimal) {
        testService.updateTanimal(tanimal);
        return "修改成功";
    }

    @ResponseBody
    @PostMapping("/nvshenIn")
    @ApiOperation(value = "修改页面", httpMethod = "POST")
    public String nvshenIn(Tanimal tanimal) {
        testService.interTanimal(tanimal);
        return "新增成功";
    }


}
