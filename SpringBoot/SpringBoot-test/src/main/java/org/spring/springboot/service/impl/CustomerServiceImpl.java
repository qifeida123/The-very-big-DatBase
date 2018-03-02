package org.spring.springboot.service.impl;


import org.spring.springboot.dao.CustomerDao;
import org.spring.springboot.domain.Tbl_customer;
import org.spring.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

	public Tbl_customer findCustomerByuuid(int uuid) {
		return customerDao.findByUuid(uuid);
	}

    
}
