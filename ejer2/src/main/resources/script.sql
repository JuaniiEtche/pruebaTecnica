-- Crear tabla Marca
CREATE TABLE IF NOT EXISTS Marca (
                                     id_marca INT AUTO_INCREMENT PRIMARY KEY,
                                     nombre VARCHAR(255) NOT NULL,
                                     tasa DECIMAL(5, 2) NOT NULL
);

-- Crear tabla Tarjeta
CREATE TABLE IF NOT EXISTS Tarjeta (
                                       id_tarjeta INT AUTO_INCREMENT PRIMARY KEY,
                                       card_holder VARCHAR(255) NOT NULL,
                                       fecha_vencimiento DATE NOT NULL,
                                       num_tarjeta INT NOT NULL,
                                       marca_id_marca INT NOT NULL,
                                       FOREIGN KEY (marca_id_marca) REFERENCES Marca(id_marca)
);

-- Crear tabla Operacion
CREATE TABLE IF NOT EXISTS Operacion (
                                         id_operacion INT AUTO_INCREMENT PRIMARY KEY,
                                         monto DECIMAL(10, 2) NOT NULL,
                                         tarjeta_id_tarjeta INT NOT NULL,
                                         FOREIGN KEY (tarjeta_id_tarjeta) REFERENCES Tarjeta(id_tarjeta)
);

-- Insertar datos
INSERT INTO Marca (nombre, tasa) VALUES ('VISA', 2.5);
INSERT INTO Tarjeta (card_holder, fecha_vencimiento, num_tarjeta, marca_id_marca) VALUES ('Juan Etcheverry', '2025-10-10', 1, 1);
INSERT INTO Operacion (monto, tarjeta_id_tarjeta) VALUES (900, 1);
