CREATE TABLE TEST
(
  NUM number NOT NULL 
, EX VARCHAR2(100) NOT NULL 
, SELECT1 VARCHAR2(20)
, SELECT2 VARCHAR2(20)
, SELECT3 VARCHAR2(20)
, SELECT4 VARCHAR2(20)
, SELECT5 VARCHAR2(20)
, RESULT NUMBER
, CONSTRAINT TEST_PK PRIMARY KEY 
  (
    NUM 
  )
  ENABLE 
);


INSERT INTO test 
VALUES(1, '문제블라블라', '1번 : 어쩌고', '2번 : 저쩌고', '3번 : 이러쿵', '4번 : 저러쿵', '5번 : 정답', 5);

INSERT INTO test 
VALUES(2, '문제어쩌고저쩌고', '1번 : 1', '2번 : 정답', '3번 : 3', '4번 : 4', '5번 : 5', 2);

INSERT INTO test 
VALUES(3, '문제3', '1번 : 정답', '2번 : 2', '3번 : 3', '4번 : 4', '5번 : 5', 1);

SELECT * FROM TEST

commit;

CREATE TABLE USER_INFO 
(
  ID VARCHAR2(50) NOT NULL 
, pw VARCHAR2(50) NOT NULL 
, name VARCHAR2(20) NOT NULL 
, SCORE NUMBER DEFAULT 0 NOT NULL 
, CONSTRAINT USER_INFO_PK PRIMARY KEY 
  (
    ID 
  )
  ENABLE 
);
insert into user_info VALUES
('user1', 'user1', '유저1', 0);

insert into user_info VALUES
('admin', 'admin', '어드민', 0);


select * from user_info;

commit;








