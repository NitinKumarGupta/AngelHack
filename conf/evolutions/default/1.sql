# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table caterer (
  id                        bigint not null,
  caterer_name              varchar(255),
  email                     varchar(255),
  address                   varchar(255),
  location                  varchar(255),
  cuisine                   varchar(255),
  constraint pk_caterer primary key (id))
;

create table menu (
  id                        bigint,
  dish_name                 varchar(255),
  dish_price                integer,
  caterer_id                bigint)
;

create table review (
  id                        bigint not null,
  reviewer_name             varchar(255),
  review                    varchar(255),
  rating                    integer,
  caterer_id                bigint,
  constraint pk_review primary key (id))
;

create sequence caterer_seq;

create sequence review_seq;

alter table menu add constraint fk_menu_caterer_1 foreign key (caterer_id) references caterer (id);
create index ix_menu_caterer_1 on menu (caterer_id);
alter table review add constraint fk_review_caterer_2 foreign key (caterer_id) references caterer (id);
create index ix_review_caterer_2 on review (caterer_id);



# --- !Downs

drop table if exists caterer cascade;

drop table if exists menu cascade;

drop table if exists review cascade;

drop sequence if exists caterer_seq;

drop sequence if exists review_seq;

