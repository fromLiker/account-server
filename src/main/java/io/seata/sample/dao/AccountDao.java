package io.seata.sample.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author IT云清
 */
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@Param("userid") Integer userid, @Param("money") Integer money);
}
