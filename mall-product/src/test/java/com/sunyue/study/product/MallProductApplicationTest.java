package com.sunyue.study.product;


import com.sunyue.study.product.entity.BrandEntity;
import com.sunyue.study.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTest {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("测试");
        brandEntity.setName("华为");

        brandService.save(brandEntity);

        System.out.println("保存成功.....");
    }
}