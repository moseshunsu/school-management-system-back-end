
create table students (
	student_id bigint not null auto_increment,
    gender varchar(10) not null,
    first_name varchar(15) not null,
    middle_name varchar(15) default "",
    last_name varchar(15) not null,
    email varchar(50) not null,
    date_of_birth date not null,
    other_student_details varchar(250) default "",
    created_at datetime,
    last_modified_at datetime,
    assignments varchar(250) default "",
    primary key (student_id)
);


create table teachers (
	teacher_id bigint not null auto_increment,
    gender varchar(7) not null,
    first_name varchar(15) not null,
    middle_name varchar(15) default "",
    last_name varchar(15) not null,
    email varchar(50) not null,
    qualifications varchar(255) not null,
    roles varchar(15) not null,
    username varchar(15) not null,
    `password` varchar(100) not null,
    date_of_birth date not null,
    address varchar(255) not null,
    phone_number varchar(20) not null,
    other_phone_number varchar(20) default "",
    date_joined date,
    last_modified_at datetime,
    primary key (teacher_id)
);

