# Host: 127.0.0.1  (Version 5.5.62-log)
# Date: 2020-06-11 15:16:30
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "course_1"
#

CREATE TABLE `course_1` (
  `cid` bigint(20) NOT NULL,
  `cname` varchar(50) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `cstatus` varchar(20) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "course_1"
#


#
# Structure for table "course_2"
#

CREATE TABLE `course_2` (
  `cid` bigint(20) NOT NULL,
  `cname` varchar(50) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `cstatus` varchar(20) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "course_2"
#

REPLACE INTO `course_2` VALUES (476414903851155457,'javademo1',100,'Normal1');

#
# Structure for table "t_order_1"
#

CREATE TABLE `t_order_1` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "t_order_1"
#


#
# Structure for table "t_order_2"
#

CREATE TABLE `t_order_2` (
  `order_id` bigint(20) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "t_order_2"
#


#
# Structure for table "t_udict"
#

CREATE TABLE `t_udict` (
  `dictid` bigint(20) NOT NULL,
  `ustatus` varchar(100) NOT NULL,
  `uvalue` varchar(100) NOT NULL,
  PRIMARY KEY (`dictid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "t_udict"
#

