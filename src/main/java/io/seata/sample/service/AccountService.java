package io.seata.sample.service;

/**
 * @author Liker
 */
public interface AccountService {

    /**
     * a扣减账户余额
     * @param userid 用户id
     * @param money 金额
     */
    void decrease(Integer userid, Integer money);
}
