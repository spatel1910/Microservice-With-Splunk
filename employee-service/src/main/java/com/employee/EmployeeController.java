package com.employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    Logger logger= LogManager.getLogger(EmployeeController.class);// make sure this is apache import, log4j2-apache product
    @GetMapping("/employee")
    public String getEmployee(){
        logger.info("Transcation started");

        int totalbalance=10000;
        logger.info("totalbalance "+totalbalance);
int moneyrequested = 5000;
int remainingbalance = totalbalance-moneyrequested;
        logger.info("remainingbalance "+remainingbalance);
        return "Transcation completed ";

    }
}
