package io.seata.sample.entity;

import lombok.Data;

/**
 * @author Liker
 */
@Data
public class Account {

    private Integer id;

    /**a用户id*/
    private Integer userid;

    /**a总额度*/
    private Integer total;

    /**a已用额度*/
    private Integer used;

    /**a剩余额度*/
    private Integer residue;
}
