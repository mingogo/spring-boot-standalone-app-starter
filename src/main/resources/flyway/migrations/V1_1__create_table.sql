CREATE TABLE flyway_test (
  key VARCHAR(64),
  value VARCHAR(255),
  PRIMARY KEY(key)
);

ALTER TABLE flyway_test OWNER TO postgres;

insert INTO flyway_test values ('1','test');
insert INTO flyway_test values ('2','test2');
insert INTO flyway_test values ('3','test3');
insert INTO flyway_test values ('4','test4');
insert INTO flyway_test values ('5','test5');
