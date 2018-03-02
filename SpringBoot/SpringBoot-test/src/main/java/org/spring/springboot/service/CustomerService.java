package org.spring.springboot.service;
import org.spring.springboot.domain.Tbl_customer;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CustomerService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
	Tbl_customer findCustomerByuuid(int uuid);
}
