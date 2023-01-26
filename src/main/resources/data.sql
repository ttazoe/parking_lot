DELETE FROM parking_spot;

INSERT INTO parking_spot (is_free, vehicle_id)
VALUES(1, 1);

INSERT INTO parking_spot (is_free, vehicle_id)
VALUES(0, 2);

DELETE FROM vehicle;

INSERT INTO vehicle (name)
VALUES("test1");

INSERT INTO vehicle (id, name)
VALUES("test2");

INSERT INTO vehicle (name)
VALUES("test3");

