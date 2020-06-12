CREATE TABLE kunde (
  kunden_id bigint NOT NULL,
  vorname varchar(50) NOT NULL,
  name varchar(50) NOT NULL,
  geburtsjahr date NOT NULL,
  email varchar(50) NOT NULL,
  PRIMARY KEY (kunden_id ),
  CONSTRAINT kunden_id UNIQUE (kunden_id)
);

CREATE TABLE medium (
  medium_id bigint NOT NULL,
  titel varchar(50) NOT NULL,
  author varchar(50),
  genre varchar(30),
  altersfreigabe smallint,
  isbn int, 
  PRIMARY KEY (medium_id ),
  CONSTRAINT medium_id UNIQUE (medium_id)
);

CREATE TABLE adresse (
  adresse_id bigint NOT NULL,
  adresse varchar(40) NOT NULL,
  stadt varchar(30) NOT NULL,
  plz varchar(10) NOT NULL,
  PRIMARY KEY (adresse_id),
  CONSTRAINT adresse_id UNIQUE (adresse_id)
);

CREATE TABLE aushleihe (
  ausleihe_id bigint NOT NULL,
  datumAusgeliehen date NOT NULL,
  kundeid bigint NOT NULL,
  mediumid bigint NOT NULL,
  PRIMARY KEY (ausleihe_id),
  CONSTRAINT id UNIQUE (ausleihe_id),
  CONSTRAINT fkcustomer FOREIGN KEY (kundeid) REFERENCES kunde (kunden_id),
  CONSTRAINT fkmedia FOREIGN KEY (mediumid) REFERENCES medium (medium_id)
);

INSERT INTO kunde(kunden_id, vorname, name, geburtsjahr, email)
    VALUES (1, 'Julian', 'Mathis', '2003-04-04', 'julian.mathis04@gmail.com');

INSERT INTO kunde(kunden_id, vorname, name, geburtsjahr, email)
    VALUES (2, 'Esra', 'Doerksen', '2002-08-05', 'esra.doerksen@gibmit.ch');

INSERT INTO kunde(kunden_id, vorname, name, geburtsjahr, email)
    VALUES (3, 'Savan', 'Cvijetic', '2002-08-05', 'savan.cvijetic@gibmit.ch');
