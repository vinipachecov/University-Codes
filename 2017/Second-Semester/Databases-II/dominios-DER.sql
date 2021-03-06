-- Dominios


CREATE DOMAIN D_NOTA_FISCAL CHAR(9); 
 
CREATE DOMAIN D_CNPJ AS VARCHAR(14);

CREATE DOMAIN D_CPF AS VARCHAR(11);

CREATE DOMAIN D_DATA AS DATE;

CREATE DOMAIN D_DECIMAL AS NUMERIC(15,2);

CREATE DOMAIN D_FINALIZED AS CHAR(1);

CREATE DOMAIN D_INTEIRO AS INTEGER;

CREATE DOMAIN D_PK AS INTEGER NOT NULL;

CREATE DOMAIN D_STR020 AS VARCHAR(20);

CREATE DOMAIN D_STR060 AS VARCHAR(60);

CREATE DOMAIN D_NOME AS VARCHAR(100);

CREATE DOMAIN D_TELEFONE AS VARCHAR(10);

CREATE DOMAIN D_EMAIL AS varchar(100) NOT NULL;

CREATE DOMAIN D_UNIDADE AS VARCHAR(20) NOT NULL;

CREATE DOMAIN D_USERNAME CHAR(40);

CREATE DOMAIN D_PASSWORD CHAR(40);

CREATE DOMAIN D_ACESSO char(13);



