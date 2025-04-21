create table students(
id integer primary key ,
name varchar(30) not null,
email varchar(40) unique,
age integer,
marks decimal(5,2)
)

insert into students(id,name,email,age,marks) values (1,'Hema','hema@gmail.com',21,98);
insert into students(id,name,email,age,marks) values (2,'Nisha','nisargaRamesh@gmail.com',21,98);
insert into students(id,name,email,age,marks) values (3,'Reshma','ReshMS@gmail.com',22,100);
insert into students(id,name,email,age,marks) values (4,'Chandra','chandrurgaRamesh@gmail.com',25,98);
insert into students(id,name,email,age,marks) values (5,'Rahul','RahameshS@gmail.com',27,90);
insert into students(id,name,email,age,marks) values (6,'Ramesh','Raamesh34@gmail.com',16,90);

select * from students where age>21

update students set email='rahul@gmail.com'  where id=5;

delete from students where age<18;

select * from students order by marks desc limit 2 offset 1

create table student (
id integer primary key ,
name varchar(30) not null,
age integer);

insert into student (id,name,age) values (1,'Rahul',22)
insert into student (id,name,age) values (2,'Priya',21)
insert into student (id,name,age) values (3,'Akash',23)

create table courses (
course_id integer primary key ,
student_id integer,
course_name varchar(30),
foreign key (student_id) references student(id)
);

insert into courses (course_id,student_id,course_name) values (101,1,'Java');
insert into courses (course_id,student_id,course_name) values (102,2,'Python');
insert into courses (course_id,student_id,course_name) values (103,3,'SQL');

select s.name , c.course_name from student s inner join courses c on s.id=c.student_id;





