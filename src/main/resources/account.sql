CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `userid` int(11) DEFAULT NULL COMMENT '用户id',
  `total` int(11) DEFAULT NULL COMMENT '总额度',
  `used` int(11) DEFAULT NULL COMMENT '已用余额',
  `residue` int(10) DEFAULT '0' COMMENT '剩余可用额度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


INSERT INTO `account` (`id`, `userid`, `total`, `used`, `residue`) VALUES ('1', '1', '1000', '0', '100');

