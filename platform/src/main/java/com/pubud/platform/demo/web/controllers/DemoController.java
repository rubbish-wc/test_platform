package com.pubud.platform.demo.web.controllers;

import com.pubud.platform.demo.biz.service.IDemoService;
import com.pubud.commons.dto.BaseResponseDTO;
import com.pubud.platform.demo.dto.DemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 14:10
 * @Version 1.0
 */
@Controller("demoController.v1")
@RequestMapping("/v1/demo")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @GetMapping("/getall")
    @ResponseBody
    public BaseResponseDTO query(){
        return new BaseResponseDTO(demoService.queryAll());
    }

    @PostMapping("/update")
    @ResponseBody
    public BaseResponseDTO query(@RequestBody DemoDTO demoDTO){
        return new BaseResponseDTO(demoService.update(demoDTO));
    }

    @PostMapping("/updateall")
    @ResponseBody
    public BaseResponseDTO query(@RequestBody List<DemoDTO> demoDTOs){
        return new BaseResponseDTO(demoService.batchupdate(demoDTOs));
    }
}
