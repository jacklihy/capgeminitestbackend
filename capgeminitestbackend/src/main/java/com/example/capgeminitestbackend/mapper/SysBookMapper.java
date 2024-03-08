package com.example.capgeminitestbackend.mapper;

import com.example.capgeminitestbackend.entity.SysBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SysBookMapper
 * Package: com.example.capgeminitestbackend.mapper
 * Description:
 *
 * @Author CSK--jackli
 * @Create 2024/3/7 0007 20:03
 * @Description: getBook
 * @Version 1.0
 */
@Mapper
public interface SysBookMapper {
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
     *  delete a book or batch delete
     */
    public int deleteSysBook(Long bookId);
    public int deleteSysBooks(Long[] bookIds);
    public boolean  checkbookNameUnique(SysBook sysBook);
}
