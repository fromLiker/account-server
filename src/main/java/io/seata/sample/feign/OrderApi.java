package io.seata.sample.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Liker
 */
@FeignClient(value = "order-server")
public interface OrderApi {

    /**
     * a修改订单金额
     * @param userid
     * @param money
     * @return
     */
    @RequestMapping("/order/update")
    String update(@RequestParam("userid") Integer userid, @RequestParam("money") Integer money);
}
