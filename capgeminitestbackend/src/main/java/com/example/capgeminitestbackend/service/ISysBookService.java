package com.example.capgeminitestbackend.service;

import com.example.capgeminitestbackend.entity.SysBook;

import java.util.List;

/**
 * ClassName: ISysBookService
 * Package: com.example.capgeminitestbackend.service
 * Description:
 *
 * @Author CSK--jackli
 * @Create 2024/3/7 0007 20:10
 * @Description: interface for service
 * @Version 1.0
 */
public interface ISysBookService {
    /**
     * get All books
     */
    public List<SysBook> selectSysBookList(SysBook sysBook);
    /**
     * get only one book
     * params : bookId
     */
    public SysBook selectSysBookByBooId(Long bookId);

    /**
     * new crease a book
     */
    public int insertSysBook(SysBook sysBook);

    /**
     * update a book
     */
    public int updateSysBook(SysBook sysBook);

    /**
     *  delete a book
     */
    public int deleteSysBook(Long bookId);

    /**
     * batch delete
     * @param bookIds
     * @return
     */
    public int deleteSysBooks(Long[] bookIds);
    /**
     * batch delete
     * @param sysBook
     * @return
     */
    public boolean checkbookNameUnique(SysBook sysBook);

}
