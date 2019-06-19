package com.pubud.platform.demo.biz.service.impl;

import com.pubud.platform.demo.biz.service.IDemoService;
import com.pubud.platform.demo.dto.DemoDTO;
import com.pubud.platform.demo.integration.mapper.MyDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 15:01
 * @Version 1.0
 */
@Service
public class DemoServiceImpl implements IDemoService{


    @Autowired
    private MyDemoMapper myDemoMapper;

    @Override
    public List<DemoDTO> queryAll() {
        return myDemoMapper.selectAll();
    }

    @Override
    public DemoDTO update(DemoDTO demoDTO) {
        int i = myDemoMapper.updateByPrimaryKeySelective(demoDTO);
        return demoDTO;
    }

    @Override
    public List<DemoDTO> batchupdate(List<DemoDTO> demoDTOs) {
        demoDTOs.forEach(demoDTO -> {
            myDemoMapper.updateByPrimaryKeySelective(demoDTO);
        });
        return demoDTOs;
    }


}
