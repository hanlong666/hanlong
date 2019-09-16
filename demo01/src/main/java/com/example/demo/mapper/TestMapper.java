package com.example.demo.mapper;


import com.example.demo.pojo.Tanimal;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/9/13.
 */
@Repository
public interface TestMapper {

    List list();

    void updateTanimal(Tanimal tanimal);

    void interTanimal(Tanimal tanimal);
}
