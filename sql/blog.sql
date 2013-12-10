drop database if exists blog;
create database blog character set utf8;
use blog;

DROP TABLE IF EXISTS `bl_article`;
CREATE TABLE `bl_article` (
  `bl_id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `bl_title` VARCHAR (255) NOT NULL DEFAULT '' COMMENT '标题',
  `bl_content` TEXT NOT NULL DEFAULT '' COMMENT '内容',
  `bl_author` VARCHAR (255) NOT NULL DEFAULT '' COMMENT '作者',
  `bl_create_time` INT (10) NOT NULL DEFAULT 0 COMMENT '创建时间',
  `bl_update_time` INT (10) NOT NULL DEFAULT 0 COMMENT '更新时间',
  `bl_click_num` INT NOT NULL DEFAULT 0 COMMENT '浏览次数',
  `bl_good_num` INT NOT NULL DEFAULT 0 COMMENT '好评',
  `bl_bad_num` INT NOT NULL DEFAULT 0 COMMENT '差评',
  PRIMARY KEY (`bl_id`)
) ENGINE MYISAM CHARSET utf8 ;