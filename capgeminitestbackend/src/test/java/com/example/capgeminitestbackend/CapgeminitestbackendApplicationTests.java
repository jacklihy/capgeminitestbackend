package com.example.capgeminitestbackend;

import com.example.capgeminitestbackend.entity.SysBook;
import com.example.capgeminitestbackend.service.ISysBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CapgeminitestbackendApplicationTests {
    @Autowired
    private ISysBookService bookService;
    @Test
    void contextLoads() {
    }
    @Test
    void testList() {
        SysBook sysBook = new SysBook();
        List<SysBook> list = bookService.selectSysBookList(sysBook);
        System.out.println("List" + list);
    }
    @Test
    void testListGetById() {
        SysBook sysBook = new SysBook();
        sysBook.setBookId(2L);
        List<SysBook> list = bookService.selectSysBookList(sysBook);
        System.out.println("List" + list);
    }

}
