package com.floadcloud.myblog.controller;

import com.floadcloud.myblog.entity.Category;
import com.floadcloud.myblog.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by luohuilong on 2017/5/1.
 */
@Slf4j
@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public @ResponseBody List<Category> list(){
        List<Category> list = categoryService.getList();
        return list;
    }

//    public static void main(String[] args) {
//        String a = "1.0".replace(".0","");
//        String b = a ;
//    }
//
//    private static List<Integer> getInteges(){
//        List<Integer> a = new ArrayList<Integer>();
//        a.add(1);
//        a.add(2);
//        return  a;
//    }

}
