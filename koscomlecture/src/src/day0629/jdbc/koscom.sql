user ���� 
create user koscom identified by koscom;

���Ѻο� 
grant connect, resource to koscom; 

koscom user ����
conn koscom/koscom

���̺� ���� 
careate table member(
id varchar2(10) primary key, 
name varchar2(15) not null,
password varchar2(4) not null,
email varchar2(30) not null,
reg_date date);

  
Member �Է� 
insert into member values ('carami','�����','1234','carami@nate.com',sysdate);