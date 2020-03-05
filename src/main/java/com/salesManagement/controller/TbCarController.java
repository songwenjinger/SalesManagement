package com.salesManagement.controller;

import com.salesManagement.entity.TbCar;
import com.salesManagement.service.TbCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tbCar")
public class TbCarController {
    @Autowired
    private TbCarService tbCarService;

    @RequestMapping("/select.htm")
    @ResponseBody
    public List<TbCar> select() {
        return tbCarService.select();
    }
}
