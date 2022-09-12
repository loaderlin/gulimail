package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.atguigu.gulimall.product.service.*;

import java.util.List;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);


//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("Huwei");
//        brandService.updateById(brandEntity);
        QueryWrapper queryWrapper = new QueryWrapper<BrandEntity>();
        queryWrapper.eq("brand_id", "1L");
        List<BrandEntity> brandList = brandService.list(queryWrapper);
        brandList.forEach((item) ->{
            System.out.println(item);
        });

        System.out.println("save success ...");
    }

}
