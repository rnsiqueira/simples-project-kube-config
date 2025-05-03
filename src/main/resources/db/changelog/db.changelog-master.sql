--liquibase formatted sql
--changeset rafael:create-table-invoice

CREATE table invoice (
 id int primary key,
 corporative_name varchar(255),
 generation_month varchar(20),
 calc_value float);

 --rollback drop table invoice