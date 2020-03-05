package service;


import com.salesManagement.dao.TbCarDao;
import com.salesManagement.entity.TbCar;
import com.salesManagement.service.TbCarService;
import com.salesManagement.service.serviceImpl.TbCarServiceImpl;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

public class TbCarServiceImplTest extends BaseTestService {
    @Resource
    private TbCarService tbCarService;

    @Test
    public void testSelect() {
        List<TbCar> tbCarList = tbCarService.select();
        Iterator iterator = tbCarList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}