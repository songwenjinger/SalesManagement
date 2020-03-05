package com.salesManagement.service.serviceImpl;

import com.salesManagement.dao.TbCarDao;
import com.salesManagement.entity.TbCar;
import com.salesManagement.service.TbCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbCarServiceImpl implements TbCarService {
    @Autowired
    TbCarDao tbCarDao;

    @Override
    public List<TbCar> select() {
        return tbCarDao.select();
    }
}
