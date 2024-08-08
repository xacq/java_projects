

CREATE TABLE `empleados` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `cedula` varchar(20) NOT NULL,
  `numero_hijos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



CREATE TABLE `hijos` (
  `cedula` varchar(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `id_empleado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



INSERT INTO `hijos` (`cedula`, `nombre`, `apellido`, `id_empleado`) VALUES
('1234567890', 'Juana', 'Gonzalez', 0),
('1234567891', 'Estela', 'Sierra', 0),
('2345678901', 'Esteban', 'Prieto', 0),
('3456789012', 'Mauro', 'Santander', 0),
('4567890123', 'Cesilia', 'Ordonez', 0),
('5678901234', 'Andrea', 'Sanchez', 0),
('9876543210', 'Marcos', 'Ordonez', 0),
('9876543211', 'Santiago', 'Ordonez', 0);



ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cedula` (`cedula`);


ALTER TABLE `hijos`
  ADD PRIMARY KEY (`cedula`);


ALTER TABLE `empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

