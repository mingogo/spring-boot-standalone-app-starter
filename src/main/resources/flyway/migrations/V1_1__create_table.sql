CREATE TABLE Department
(
  code                    VARCHAR(255) NOT NULL PRIMARY KEY,
  label                   VARCHAR(255),
  description             VARCHAR(255),
  last_modified_by        VARCHAR(20) NOT NULL DEFAULT 'SYS',
  last_modified_timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  created_by              VARCHAR(20) NOT NULL DEFAULT 'SYS',
  created_timestamp       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE department OWNER TO postgres;

insert INTO department values ('it','IT','the department to do IT','SYS',NOW(),'SYS',NOW());
insert INTO department values ('hr','HR','the department to do HR','SYS',NOW(),'SYS',NOW());