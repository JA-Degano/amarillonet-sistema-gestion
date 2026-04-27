CREATE DATABASE amarillonet;
USE amarillonet;

CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    dni VARCHAR(20) UNIQUE,
    telefono VARCHAR(20),
    direccion VARCHAR(100)
);

CREATE TABLE Servicio (
    id_servicio INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50),
    velocidad VARCHAR(20),
    precio DECIMAL(10,2)
);

CREATE TABLE Cliente_Servicio (
    id_cliente_servicio INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    id_servicio INT,
    fecha_alta DATE,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente),
    FOREIGN KEY (id_servicio) REFERENCES Servicio(id_servicio)
);

CREATE TABLE Reclamo (
    id_reclamo INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    descripcion TEXT,
    fecha DATE,
    estado VARCHAR(20),
    prioridad VARCHAR(20),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

CREATE TABLE Tecnico (
    id_tecnico INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    especialidad VARCHAR(50)
);

CREATE TABLE Asignacion (
    id_asignacion INT AUTO_INCREMENT PRIMARY KEY,
    id_reclamo INT,
    id_tecnico INT,
    fecha_asignacion DATE,
    FOREIGN KEY (id_reclamo) REFERENCES Reclamo(id_reclamo),
    FOREIGN KEY (id_tecnico) REFERENCES Tecnico(id_tecnico)
);
