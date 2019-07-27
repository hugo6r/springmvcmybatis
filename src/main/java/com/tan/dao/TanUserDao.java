package com.tan.dao;

import com.tan.model.TanUser;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TanUserDao {
    List<TanUser> findAll();
}
