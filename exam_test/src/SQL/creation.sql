drop table commande;
drop table client;

create table client(
noclient integer,
nomclient varchar(20) not null,
notelephone varchar(20),
primary key (noclient)
);

create table commande(
nocommande integer,
datecommande date not null,
noclient integer,
primary key(nocommande),
constraint commande_noclient_fk foreign key (noclient) references client(noclient)
);