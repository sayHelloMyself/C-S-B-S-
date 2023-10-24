package com.example.contactbs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.contactbs.pojo.Contacts;
import com.example.contactbs.service.ContactsService;
import com.example.contactbs.mapper.ContactsMapper;
import org.springframework.stereotype.Service;

/**
* @author 27587
* @description 针对表【contacts】的数据库操作Service实现
* @createDate 2023-10-24 17:20:18
*/
@Service
public class ContactsServiceImpl extends ServiceImpl<ContactsMapper, Contacts>
    implements ContactsService{

}




