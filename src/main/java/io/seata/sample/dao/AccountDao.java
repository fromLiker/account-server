package io.seata.sample.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author Liker
 */
public interface AccountDao {

    /**
     * a扣减账户余额
     * @param userid 用户id
     * @param money 金额
     */
    void decrease(@Param("userid") Integer userid, @Param("money") Integer money);
}
