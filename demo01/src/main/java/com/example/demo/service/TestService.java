package com.example.demo.service;

import com.example.demo.pojo.Tanimal;

import java.util.List;

/**
 * Created by Administrator on 2019/9/13.
 */
public interface TestService {

    List test();

    void updateTanimal(Tanimal tanimal);

    void interTanimal(Tanimal tanimal);
}
