package io.seata.sample.service;

import io.seata.sample.dao.AccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liker
 */
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService{

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);
    @Autowired
    private AccountDao accountDao;
    // @Autowired
    // private OrderApi orderApi;

    /**
     *a 扣减账户余额
     * @param userid 用户id
     * @param money 金额
     */
    @Override
    public void decrease(Integer userid, Integer money) {
        LOGGER.info("------->扣减账户开始account中");
        //a模拟超时异常，全局事务回滚
//        try {
//            Thread.sleep(30*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(1/0);
        accountDao.decrease(userid,money);
        LOGGER.info("------->扣减账户结束account中");

        //a修改订单状态，此调用会导致调用成环
        // LOGGER.info("修改订单状态开始");
        // String mes = orderApi.update(userId, money.multiply(new BigDecimal("0.09")),0);
        // LOGGER.info("修改订单状态结束：{}",mes);
    }
}
