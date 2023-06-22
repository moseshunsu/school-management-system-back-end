
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
