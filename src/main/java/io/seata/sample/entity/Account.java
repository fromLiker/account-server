package io.seata.sample.entity;

import lombok.Data;

/**
 * @author IT云清
 */
@Data
public class Account {

	private Integer id;

    /**用户id*/
    private Integer userid;

    /**总额度*/
    private Integer total;

    /**已用额度*/
    private Integer used;

    /**剩余额度*/
    private Integer residue;
}
