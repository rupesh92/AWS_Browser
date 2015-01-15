# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bar (
  id                        varchar(255) not null,
  access                    varchar(255),
  secret                    varchar(255),
  bucket_name               varchar(255),
  ip                        varchar(255),
  port                      integer,
  constraint pk_bar primary key (id))
;

create table file_content (
  id                        varchar(255) not null,
  constraint pk_file_content primary key (id))
;

create sequence bar_seq;

create sequence file_content_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists bar;

drop table if exists file_content;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists bar_seq;

drop sequence if exists file_content_seq;

