package com.soft1851.spring.webannotation.controller;


import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.webannotation.service.TopicService;
import com.soft1851.spring.webannotation.util.ResponseObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: zw_w
 * @Date: 2020/3/27 15:47
 * @Description:
 */
@Controller
@RequestMapping(value = "/")
public class TopicController {
    @Resource
    private TopicService topicService;
    //加了 @ResponseBody 返回的是json字符串  不加就返回string字符串
    @GetMapping(value = "topics",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getTopics(){
        ResponseObject rs = new ResponseObject(1,"success",topicService.queryAll());
        return JSONObject.toJSONString(rs);
    }

    @GetMapping("/topic")
    public String topic(Model model){
        model.addAttribute("topics",topicService.queryAll());
        return "topic";
    }
}