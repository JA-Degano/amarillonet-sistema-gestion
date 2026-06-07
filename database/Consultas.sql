-- ==================================================
-- INSERCIÓN DE REGISTROS
-- ==================================================

INSERT INTO Cliente
(nombre, apellido, telefono, direccion, email)
VALUES
('Juan', 'Perez', '3704123456',
'Av. 25 de Mayo 953',
'juanperez@gmail.com');

INSERT INTO Servicio
(nombre_plan, velocidad, precio)
VALUES
('Fibra Hogar 100 MB', 100, 15000);

INSERT INTO Tecnico
(nombre, telefono, especialidad)
VALUES
('Carlos Gómez',
'3704556677',
'Instalaciones FTTH');

INSERT INTO Reclamo
(id_cliente, descripcion, estado, fecha)
VALUES
(1,
'Sin conexión a internet',
'Pendiente',
CURRENT_DATE);

-- ==================================================
-- CONSULTAS DE INFORMACIÓN
-- ==================================================

SELECT * FROM Cliente;

SELECT * FROM Servicio;

SELECT *
FROM Reclamo
WHERE estado = 'Pendiente';

SELECT *
FROM Reclamo
WHERE id_cliente = 1;

SELECT *
FROM Tecnico;

SELECT
c.nombre,
c.apellido,
r.descripcion,
r.estado,
r.fecha
FROM Cliente c
INNER JOIN Reclamo r
ON c.id_cliente = r.id_cliente;

-- ==================================================
-- ACTUALIZACIÓN DE REGISTROS
-- ==================================================

UPDATE Cliente
SET telefono = '3704888899'
WHERE id_cliente = 1;

UPDATE Reclamo
SET estado = 'Resuelto'
WHERE id_reclamo = 1;

-- ==================================================
-- ELIMINACIÓN DE REGISTROS
-- ==================================================

DELETE FROM Reclamo
WHERE id_reclamo = 1;

DELETE FROM Cliente
WHERE id_cliente = 1;
