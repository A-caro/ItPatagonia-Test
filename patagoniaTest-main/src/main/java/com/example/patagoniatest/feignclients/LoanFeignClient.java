package com.example.patagoniatest.feignclients;

import com.example.patagoniatest.model.Loan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name ="loan-service")
@RequestMapping("/Loan")

public interface LoanFeignClient {

    @PostMapping()
    Loan save(@RequestBody Loan loan);
}
