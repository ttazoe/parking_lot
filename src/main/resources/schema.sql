  CREATE TABLE parking_spot (
     id INTEGER NOT NULL AUTO_INCREMENT,
     is_free BOOLEAN NOT NULL,
     vehicle_id INTEGER,
     PRIMARY KEY (id)
  );

  CREATE TABLE vehicle (
     id INTEGER NOT NULL AUTO_INCREMENT,
     name VARCHAR(255) NOT NULL,
     PRIMARY KEY (id)
  );