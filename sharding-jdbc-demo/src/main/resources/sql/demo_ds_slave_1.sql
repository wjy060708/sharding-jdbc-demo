# Host: 127.0.0.1  (Version 5.5.62-log)
# Date: 2020-06-11 15:15:45
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "t_order"
#

CREATE TABLE `t_order` (
  `order_id` bigint(10) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "t_order"
#

