CREATE TABLE MBTI_TEST 
(
  num NUMBER not null PRIMARY KEY
, ex VARCHAR2(200) NOT NULL 
, SELECT1 VARCHAR2(100) NOT NULL 
, SELECT2 VARCHAR2(100) NOT NULL  
);

insert into mbti_test values
(1, '무료 우주 여행응모에 당첨된 당신! 하지만 우주에 가기 위해서는 여러가지 훈련이 기다리고 있다고 하는데...', 
'그게 무슨 상관이야? 무조건 간다. ', 
'아.. 귀찮아.. 굳이 그렇게 까지 해서 갈 필요가 있나?');

insert into mbti_test values
(2, '꿈에 그리던 우주 여행날짜가 잡혔다. 준비해야 할 것들이 많은데 언제부터 짐을 싸는게 좋을까?', 
'뭘 가져가야 할 진 대충 알고 있으니 출발하기 직전에 준비한다', 
'뭐가 필요할지 리스트를 정하고 며칠 전부터 조금씩 짐을 싸기 시작한다.');

insert into mbti_test values
(3, '발사카운트 다운이 시작되었는데 지금 내 머릿속에 드는 생각은?', 
'내가 화장실을 다녀왔던가? 갑자기 가고싶어지면 어떡하지?', 
'이러다 죽는게 아닐까? 비상시 대피안내문에 있던 내용들을 복기한다.');

insert into mbti_test values
(4, '드디어 우주에 도착한 당신. 밖을 바라보며 든 생각은?', 
'와 아름답다. 다른 사람들도 나와 같이 이 광경을 볼 수 있으면 좋겠어', 
'지구는 정말 원형이었구나. ');

insert into mbti_test values
(5, '우주여행을 안내해 주시는 분이 밖에 나가보고 싶은 사람이 있냐고 하는데.. 당신의 선택은?', 
'위험하더라도 나가보고싶어!', 
'난 안전한 우주선 안이 좋아.. 그러다 우주미아가 되면 어떻게 해?');

select * from mbti_test;
commit;


CREATE TABLE score 
( 
  num number not null PRIMARY KEY
, SELECT1 number
, SELECT2 number
,  CONSTRAINT FK_mbti foreign KEY(num)
  REFERENCES MBTI_TEST(num)
 );

insert into score values
(1, 2, 1);
insert into score values
(2, 2, 3);
insert into score values
(3, 1, 2);
insert into score values
(4, 2, 1);
insert into score values
(5, 2, 1);

select * from score;
commit;

CREATE TABLE USER_INFO
( 
  id varchar2(20) not null PRIMARY KEY
, pw varchar2(20) not null
, name varchar2(20) not null
 );

insert into USER_INFO values
('admin', 'admin', '어드민');
insert into USER_INFO values
('user1', 'user1', '유저1');
select * from USER_INFO;
commit;


