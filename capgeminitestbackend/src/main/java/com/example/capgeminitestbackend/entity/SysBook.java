package com.example.capgeminitestbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: SysBook
 * Package: com.example.capgeminitestbackend.entity
 * Description:
 *
 * @Author CSK--jackli
 * @Create 2024/3/7 0007 19:52
 * @Description: todo
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysBook {
    private  Long bookId;
    private  String bookTitle;
    private  String bookAuth;
    private  String bookContent;
    private  Date bookversionDate;
    private  String bookIsbn;

}
