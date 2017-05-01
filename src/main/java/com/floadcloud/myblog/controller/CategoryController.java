package com.floadcloud.myblog.controller;

import com.floadcloud.myblog.entity.Category;
import com.floadcloud.myblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by luohuilong on 2017/5/1.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    private String list(Model model){

        List<Category> list = categoryService.getList();
        model.addAttribute("list",list);
        return "list";
    }

}
