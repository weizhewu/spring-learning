package com.soft1851.spring.webannotation.controller;

import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.webannotation.service.impl.RankServiceImpl;
import com.soft1851.spring.webannotation.util.ResponseObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: zw_w
 * @Date: 2020/3/28 16:40
 * @Description:
 */
@Controller
@RequestMapping(value = "/rank")
public class RankController {
    @Resource
    private RankServiceImpl rankService;

    @GetMapping(value = "/ranks",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getTopics(){
        ResponseObject rs = new ResponseObject(1,"success",rankService.queryAll());
        return JSONObject.toJSONString(rs);
    }
}
