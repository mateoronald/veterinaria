create database proyectointegrador;

use proyectointegrador;

create table perfil (
    cod_perf smallint not null auto_increment,
    des_perf varchar(50),
    primary key (cod_perf)
);

create table opciones (
    cod_opc smallint not null auto_increment,
    des_opc varchar(50),
    par_opc varchar(100),
    primary key (cod_opc)
);

create table detalle_opcion (
    cod_perf smallint,
    cod_opc smallint,
    foreign key (cod_perf)
        references perfil (cod_perf),
    foreign key (cod_opc)
        references opciones (cod_opc),
    primary key (cod_perf , cod_opc)
);

create table usuario (
    cod_usu smallint not null auto_increment,
    log_usu varchar(12),
    pas_usu varchar(12),
    nom_usu varchar(50),
    ape_pat_usu varchar(50),
    ape_mat_usu varchar(50),
    dni_usu char(8),
    eda_usu smallint not null,
    fec_nac_usu date,
    cod_perf smallint,
    foreign key (cod_perf)
        references perfil (cod_perf),
    primary key (cod_usu)
);


CREATE TABLE Profesor
(CodProfesor			INT PRIMARY KEY ,
ApePatProfesor			VARCHAR(50) NOT NULL,
ApeMatProfesor			VARCHAR(50) NOT NULL,
PriNomProfesor			VARCHAR(50) NOT NULL,
SegNomProfesor			VARCHAR(50) NOT NULL);