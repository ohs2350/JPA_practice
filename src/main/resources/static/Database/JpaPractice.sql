CREATE TABLE jpa_student(
    student_ID NUMBER(10) PRIMARY KEY,
    student_NAME VARCHAR2(100),
    student_ADDRESS VARCHAR2(500),
    student_level NUMBER(10),
    teacher_ID NUMBER(10) REFERENCES jpa_teacher(teacher_ID)
);

CREATE TABLE jpa_teacher(
    teacher_ID NUMBER(10) PRIMARY KEY,
    teacher_NAME VARCHAR2(100),
    teacher_ADDRESS VARCHAR2(500),
    teacher_SUBJECT VARCHAR2(100)
);

CREATE TABLE jpa_signup(
    signup_ID NUMBER(10) PRIMARY KEY,
    teacher_ID NUMBER(10) REFERENCES jpa_teacher(teacher_ID),
    seminar_ID NUMBER(10) REFERENCES jpa_seminar(seminar_ID),
    signup_DATE DATE
);

CREATE TABLE jpa_seminar(
    seminar_ID NUMBER(10) PRIMARY KEY,
    seminar_NAME VARCHAR2(100),
    seminar_SUBJECT VARCHAR2(100)
);