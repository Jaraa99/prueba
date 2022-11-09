CREATE TABLE IF NOT EXISTS attendee(

     id SERIAL,
     niu VARCHAR(20) NOT NULL,
     fullname VARCHAR(100) NOT NULL,
     adress VARCHAR(50)

     PRIMARY KEY (id)
     UNIQUE(nui)
);