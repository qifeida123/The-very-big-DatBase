package org.spring.springboot.controller;

import org.spring.springboot.domain.Tbl_customer;
import org.spring.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class UserRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/api/customer", method = RequestMethod.GET)
    public Tbl_customer findCustomer(@RequestParam(value = "uuid", required = true) int uuid) {
       return customerService.findCustomerByuuid(uuid);
    }

}
