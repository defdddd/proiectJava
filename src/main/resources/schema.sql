DROP TABLE IF EXISTS Review;
DROP TABLE IF EXISTS Booking;
DROP TABLE IF EXISTS Account;
DROP TABLE IF EXISTS Location;


CREATE TABLE Account (
  id INT NOT NULL AUTO_INCREMENT,
  username varchar(255),
  password varchar(255),
  email varchar(255),
  phone_number varchar(255),
  role INT,
  PRIMARY KEY (id)
);

CREATE TABLE Location (
  id INT NOT NULL AUTO_INCREMENT,
  location_name varchar(255),
  image_location varchar(255),
  price_per_hour double,
  location_x double,
  location_y double,
  address varchar(250),
  PRIMARY KEY (id)
);

CREATE TABLE Booking (
  id INT NOT NULL AUTO_INCREMENT,
  account_id INT NOT NULL,
  location_id INT NOT NULL,
  phone_number varchar(255),
  in_date varchar(255),
  out_date varchar(255),
  total_price double,
   PRIMARY KEY (id),
   foreign key (account_id) references Account(id),
   foreign key (location_id) references Location(id)
);

CREATE TABLE Review (
  id INT NOT NULL AUTO_INCREMENT,
  account_id INT NOT NULL,
  location_id INT NOT NULL,
  grade INT,
  description varchar(255),
  date varchar(255),
  PRIMARY KEY (id),
  foreign key (account_id) references Account(id),
  foreign key (location_id) references Location(id)
);