  CREATE TABLE parking_spot (
     id INTEGER NOT NULL,
     is_free BOOLEAN NOT NULL,
     vehicle_id INTEGER,
     PRIMARY KEY (id)
  );

  CREATE TABLE vehicle (
     id INTEGER NOT NULL,
     name VARCHAR(255) NOT NULL,
     PRIMARY KEY (id)
  );