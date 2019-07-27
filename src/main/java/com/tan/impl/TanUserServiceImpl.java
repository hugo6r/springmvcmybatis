package com.tan.impl;

import com.tan.dao.TanUserDao;
import com.tan.model.TanUser;
import com.tan.service.TanUserService;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.util.List;
@Service
public class TanUserServiceImpl implements TanUserService {
    @Resource
    private TanUserDao tanUserDao;

    public List<TanUser> findAll(){
        return tanUserDao.findAll();
    }
}
