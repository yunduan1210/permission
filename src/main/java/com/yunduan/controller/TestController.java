package com.yunduan.controller;

import com.yunduan.util.BeanValidator;
import com.yunduan.common.JsonData;
import com.yunduan.param.TestVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        log.info("hello");
        return "hello,permission";
    }

    @RequestMapping("/hello.json")
    @ResponseBody
    public JsonData test(){
        log.info("hello");
        throw new RuntimeException("permission");
        //       return JsonData.success("hello permission");
    }


    @RequestMapping("/validate.json")
    @ResponseBody
    public JsonData validate(TestVo testVo){
        log.info("validate");
        try {
            Map<String ,String> map = BeanValidator.validate(testVo);
            if (MapUtils.isNotEmpty(map)) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    log.info("{}-->{}", entry.getKey(), entry.getValue());
                }
            }
        }catch(Exception e){

            }

        return JsonData.success("test validate");
    }
}
