
-- mysql root 계정으로 실행하세요

﻿-- 데이터베이스 생성
-- create database 데이터베이스명 default character set utf8;

create database gosu default character set utf8;

-- 계정 생성 및 권한부여 하나씩 차근차근 실행
create user 'gosu123'@'localhost' identified by 'asdf123';
grant all privileges on gosu.* to 'gosu123'@'localhost';

create user 'gosu123'@'%' identified by 'asdf123';
grant all privileges on gosu.* to 'gosu123'@'%';



-- 여기서부터는 gosu123계정으로 로그인 후에 진행하시면 됩니다.



-- 테이블생성
-- user table
create table gosu.user (
	user_no int not null auto_increment primary key comment '회원번호,기본키(PK), 1씩자동증가',
    user_id varchar(20) not null unique comment '회원아이디, not null, 유니크(중복X)',
    user_pwd varchar(15) not null comment '회원비밀번호, not null',
    user_name varchar(10) not null comment '회원이름, not null',
    user_hp varchar(15) not null comment '회원전화번호, not null -가 들어올가능성이 있어서 varchar',
    user_regdate datetime default now() comment '기본값 현재시간',
    user_address varchar(30) not null comment '~~시 ~~구까지',
    user_grade int not null default 1 comment '정상회원1 관리자999', -- 정상회원1, 관리자999
    user_email varchar(50) not null,
    user_gender varchar(8) not null,
    user_skill varchar(30), 
    user_school varchar(50),
    user_birth int(10) not null
)engine=InnoDB default character set=utf8;


-- 회원 dummy data 입력

insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('admin','1234','관리자','010-8888-7777',999,'서울시 강남구','admin@gosu.com','M','931217');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid1','1234','임꺽정','010-8888-7777',1,'서울시 관악구','idid1@gosu.com','M','821015');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid2','1234','김세종','010-8888-7777',1,'서울시 서초구','idid2@gosu.com','M','901010');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid3','1234','이철우','010-8888-7777',1,'서울시 동작구','idid3@gosu.com','M','860810');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid4','1234','사마귀','010-8888-7777',1,'서울시 구로구','idid4@gosu.com','F','870621');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid5','1234','강철중','010-8888-7777',1,'경기도 부천시','idid5@gosu.com','F','880125');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid6','1234','강태풍','010-8888-7777',1,'서울시 마포구','idid6@gosu.com','F','900417');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid7','1234','고아라','010-8888-7777',1,'성남시 분당구','idid7@gosu.com','F','880716');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid8','1234','김혜수','010-8888-7777',1,'마산시 마산합포구','idid8@gosu.com','F','981117');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid9','1234','김태양','010-8888-7777',1,'서울시 마포구','idid9@gosu.com','M','911111');
insert into user(user_id, user_pwd, user_name, user_hp, user_grade, user_address, user_email, user_gender, user_birth) 
value('idid10','1234','소몰이','010-8888-7777',1,'서울시 관악구','idid10@gosu.com','M','910202');

-- dummy data 조회
select * from user;

