DELETE FROM parking_spot;

INSERT INTO parking_spot (id, is_free, vehicle_id)
VALUES(1, 1, 1);

INSERT INTO parking_spot (id, is_free, vehicle_id)
VALUES(2, 0, 2);

DELETE FROM vehicle;

INSERT INTO vehicle (id, name)
VALUES(1, "test1");

INSERT INTO vehicle (id, name)
VALUES(2, "test2");


