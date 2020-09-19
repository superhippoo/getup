CREATE DATABASE mkdb default CHARACTER SET UTF8;
use mkdb;

DROP table mk_user;
DROP table mk_author;
DROP table mk_store;
DROP table mk_txt;
DROP table mk_order;
DROP table mk_category;
DROP table mk_deal;

CREATE TABLE mk_user (
  uid VARCHAR(20) PRIMARY KEY, 
  nikname VARCHAR(50),
  user_type VARCHAR(2),
  val_yn VARCHAR(2),
  auth_info VARCHAR(50),
  reg_dt timestamp,
  mdfy_dt timestamp,
  reg_id VARCHAR(20),
  mdfy_id VARCHAR(20)
  ) ENGINE=INNODB; 
  

  CREATE TABLE mk_author (
  uid VARCHAR(20) PRIMARY KEY, 
  val_yn VARCHAR(2),
  deal_cnt  int(11),
  account_add  VARCHAR(50),
  reg_dt timestamp,
  mdfy_dt timestamp,
  reg_id VARCHAR(20),
  mdfy_id VARCHAR(20)
  ) ENGINE=INNODB; 
 
  
  CREATE TABLE mk_store (
  store_id VARCHAR(20) PRIMARY KEY, 
  val_yn VARCHAR(2),
  uid VARCHAR(20), 
  catetory_id int(11),
  title VARCHAR(50),
  price int(11),
  work_period   int(11),
  summary   VARCHAR(100),
  sam1 VARCHAR(50),
  sam2 VARCHAR(50),
  sam3 VARCHAR(50),
  sam4 VARCHAR(50),
  reg_dt timestamp,
  mdfy_dt timestamp,
  reg_id VARCHAR(20),
  mdfy_id VARCHAR(20)
  ) ENGINE=INNODB; 
 

  CREATE TABLE mk_txt (
  txt_id VARCHAR(20) PRIMARY KEY,
  txt_content longtext,
  reg_dt timestamp,
  mdfy_dt timestamp,
  reg_id VARCHAR(20),
  mdfy_id VARCHAR(20)
  ) ENGINE=INNODB; 
  desc mk_txt;

  CREATE TABLE mk_order (
  order_id VARCHAR(20) PRIMARY KEY,
  uid VARCHAR(20),
  author_id VARCHAR(20),
  store_id VARCHAR(20),
  title VARCHAR(20),
  address text,
  etc_info text,
  order_stat VARCHAR(2),
  price int(11),
  reg_dt timestamp,
  mdfy_dt timestamp,
  reg_id VARCHAR(20),
  mdfy_id VARCHAR(20)
  ) ENGINE=INNODB; 

  CREATE TABLE mk_category (
  category_id int(11) PRIMARY KEY,
  category_nm VARCHAR(10),
  reg_dt timestamp,
  mdfy_dt timestamp,
  reg_id VARCHAR(20),
  mdfy_id VARCHAR(20)
  ) ENGINE=INNODB; 
 
  CREATE TABLE mk_deal (
  deal_id VARCHAR(20) PRIMARY KEY,
  author_id VARCHAR(20),
  user_id VARCHAR(20),
  deal_yn VARCHAR(1),
  reg_dt timestamp,
  mdfy_dt timestamp,
  reg_id VARCHAR(20),
  mdfy_id VARCHAR(20)
  ) ENGINE=INNODB; 
