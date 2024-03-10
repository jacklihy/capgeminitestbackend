package com.example.capgeminitestbackend.controller;

import com.example.capgeminitestbackend.entity.SysBook;
import com.example.capgeminitestbackend.service.ISysBookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
    public List<SysBook> list(SysBook sysBook,  HttpServletResponse response)  {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Max-Age", "10");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        List list = bookService.selectSysBookList(sysBook);
        return list;
    }
    @GetMapping(value = "/{bookId}")
    public  SysBook listById(@PathVariable Long bookId, HttpServletResponse response) throws JsonProcessingException {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Max-Age", "10");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        SysBook list = bookService.selectSysBookByBooId(bookId);
        return list;
    }
    @PostMapping
    public int add(@RequestBody SysBook sysBook,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Max-Age", "10");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        int list = 0;

            list = bookService.insertSysBook(sysBook);

        return list;
    }
    @PutMapping
    public int edit(@RequestBody SysBook sysBook,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Max-Age", "10");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        int list = 0;

            list = bookService.updateSysBook(sysBook);

        return list;
    }
    @DeleteMapping("/{bookId}")
    public int remove(@PathVariable Long bookId,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Max-Age", "10");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT");
        response.setHeader("Access-Control-Allow-Credentials", "true");
       int list= bookService.deleteSysBook(bookId);
       return list;
    }

}
