
CREATE TABLE beer
(
   beerId varchar(100) NOT NULL,
   beerName varchar(100) NOT NULL,
   beerStyle varchar(100) NOT NULL,
   beerUpc varchar(100) NOT NULL,

    PRIMARY KEY (beerId)
);

CREATE TABLE customer
(
    customerId varchar(100) NOT NULL,
    customerName varchar(100) NOT NULL,


    PRIMARY KEY (customerId)
);