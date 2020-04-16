package io.seata.sample.controller;

import io.seata.sample.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liker
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountServiceImpl;

    /**
     * a扣减账户余额
     * @param userid 用户id
     * @param money 金额
     * @return
     */
    @RequestMapping("decrease")
    public String decrease(@RequestParam("userid") Integer userid,@RequestParam("money") Integer money){
        accountServiceImpl.decrease(userid,money);
        return "Account decrease success";
    }
}
