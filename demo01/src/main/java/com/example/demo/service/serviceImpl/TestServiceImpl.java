package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.TestMapper;
import com.example.demo.pojo.Tanimal;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/9/13.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List test() {
        return testMapper.list();
    }

    @Override
    public void updateTanimal(Tanimal tanimal) {
        testMapper.updateTanimal(tanimal);
    }

    @Override
    public void interTanimal(Tanimal tanimal) {
        testMapper.interTanimal(tanimal);
    }
}
