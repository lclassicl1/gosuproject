-- 데이터베이스 생성
-- create database 데이터베이스명 default character set utf8;

create database gosu default character set utf8;

-- 계정 삭제
drop user gosu123;


-- 계정 생성 및 권한부여 하나씩 차근차근 실행
create user 'gosu123'@'localhost' identified by 'asdf123';
grant all privileges on board.* to 'gosu123'@'localhost';

create user 'gosu123'@'%' identified by 'asdf123';
grant all privileges on board.* to 'gosu123'@'%';