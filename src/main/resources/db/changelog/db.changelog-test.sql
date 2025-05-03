--liquibase formatted sql
--changeset rafael:create-insert-invoice

INSERT INTO invoice (id,corporative_name,generation_month,calc_value)
VALUES (1,'rafael S.A', '10/2022', 400.23);
commit;

 --rollback delete from invoice where id = 1;