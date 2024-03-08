package com.example.capgeminitestbackend.service.impl;

import com.example.capgeminitestbackend.entity.SysBook;
import com.example.capgeminitestbackend.mapper.SysBookMapper;
import com.example.capgeminitestbackend.service.ISysBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: SysBookImpl
 * Package: com.example.capgeminitestbackend.service.impl
 * Description:
 *
 * @Author CSK--jackli
 * @Create 2024/3/7 0007 20:12
 * @Description: todo
 * @Version 1.0
 */
@Service
public class SysBookImpl implements ISysBookService {
    @Autowired
    private SysBookMapper sysBookMapper;
    @Override
    public List<SysBook> selectSysBookList(SysBook sysBook) {

        return sysBookMapper.selectSysBookList(sysBook);
    }

    @Override
    public SysBook selectSysBookByBooId(Long bookId) {
        return sysBookMapper.selectSysBookByBooId(bookId);
    }

    @Override
    public int insertSysBook(SysBook sysBook) {
        return sysBookMapper.insertSysBook(sysBook);
    }

    @Override
    public int updateSysBook(SysBook sysBook) {
        return sysBookMapper.updateSysBook(sysBook);
    }

    @Override
    public int deleteSysBook(Long bookId) {
        return sysBookMapper.deleteSysBook(bookId);
    }
    @Override
    public int deleteSysBooks(Long[] bookIds){
        return sysBookMapper.deleteSysBooks(bookIds);
    }
    @Override
    public boolean checkbookNameUnique(SysBook sysBook){
        return  sysBookMapper.checkbookNameUnique(sysBook);
    }
}
