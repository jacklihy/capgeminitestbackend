package com.example.capgeminitestbackend.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.example.capgeminitestbackend.entity.SysBook;
import com.example.capgeminitestbackend.service.ISysBookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import config.CorsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: SysBookController
 * Package: com.example.capgeminitestbackend.controller
 * Description:
 *
 * @Author CSK--jackli
 * @Create 2024/3/7 0007 19:57
 * @Description: SysBook Controller , Give Data for web request.
 * @Version 1.0
 */
@RestController
@EnableWebMvc
@RequestMapping("/api")
public class SysBookController  {
    @Autowired
    private ISysBookService bookService;
    @GetMapping("/list")
    public List<SysBook> list(SysBook sysBook)  {
        List list = bookService.selectSysBookList(sysBook);
        return list;
    }
    @GetMapping(value = "/{bookId}")
    public  SysBook listById(@PathVariable Long bookId) throws JsonProcessingException {
        SysBook list = bookService.selectSysBookByBooId(bookId);
        return list;
    }
    @PostMapping
    public int add(@RequestBody SysBook sysBook){
        int list = 0;

            list = bookService.insertSysBook(sysBook);

        return list;
    }
    @PutMapping
    public int edit(@RequestBody SysBook sysBook){
        int list = 0;

            list = bookService.updateSysBook(sysBook);

        return list;
    }
    @DeleteMapping("/{bookId}")
    public int remove(@PathVariable Long bookId){
       int list= bookService.deleteSysBook(bookId);
       return list;
    }

}
