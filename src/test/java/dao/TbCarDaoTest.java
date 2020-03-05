package dao;

import com.salesManagement.dao.TbCarDao;
import com.salesManagement.entity.TbCar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TbCarDaoTest implements BaseTest {
    @Resource
    private TbCarDao tbCarDao;

    @Test
    public void testSelect() {
        List<TbCar> tbCarList = tbCarDao.select();
        Iterator iterator = tbCarList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}