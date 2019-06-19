package com.pubud.platform.demo.biz.service;

import com.pubud.platform.demo.dto.DemoDTO;

import java.util.List;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 15:01
 * @Version 1.0
 */
public interface IDemoService {

    /**
     * 查询数据
     * @return
     */
    List<DemoDTO> queryAll();

    /**
     * 更新
     * @param demoDTO
     * @return
     */
    DemoDTO update(DemoDTO demoDTO);

    List<DemoDTO> batchupdate(List<DemoDTO> demoDTOs);
}
