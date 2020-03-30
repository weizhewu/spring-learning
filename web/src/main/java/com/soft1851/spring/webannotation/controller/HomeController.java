package com.soft1851.spring.webannotation.controller;

import com.soft1851.spring.webannotation.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * 描述:
 *
 * @author：wzw
 * @create 2020-03-24 9:46
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("home")
    public String home(Model model){
        model.addAttribute("message","Hello Spring Mvc");
        Book[] books = {
                new Book("http://img04.sogoucdn.com/app/a/10070003/5DE8B8F85908131DB50D81E60847B72A","神级兽王分身","世界变了。别人家的孩子进化了，别人家的孩子觉醒了。别人家的老公光宗耀祖了，别人家的"),
                new Book("http://img02.sogoucdn.com/app/a/10070003/7FBE0D9AC6C329C9521445F081FDEAC1","无敌神龙养成系统","变身神龙，统御四海！海洋中，他是唯一的神龙，建立海底龙宫。虾兵蟹将跟随左右，海底狂鲨、巨型"),
                new Book("http://img01.sogoucdn.com/app/a/10070003/B555A5947C003C838EDA5A44BB7F3666","黄金瞳","典当行工作的小职员庄睿，在一次意外中眼睛发生异变。美轮美奂的陶瓷，古拙大方的青铜器，惊心动")
        };
        List<Book> bookList = Arrays.asList(books);
        String[] nameList = {"新闻","网页","微信","知乎","图片","视频","名医","英文","问问","阅读","更多"};
        model.addAttribute("bookList",bookList);
        model.addAttribute("nameList",nameList);
        return "home";
    }
}
