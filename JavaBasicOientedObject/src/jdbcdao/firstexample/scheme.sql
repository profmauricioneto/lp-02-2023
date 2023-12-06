/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  maumneto
 * Created: 29 de nov. de 2023
 */

CREATE TABLE USUARIO (
    ID INT NOT NULL AUTO_INCREMENT,
    NOME VARCHAR(64),
    ALTURA DOUBLE,
    ENDERECO VARCHAR(255),
    DATA DATE,
    PRIMARY KEY(ID)
);

DELIMITER //
CREATE PROCEDURE SelectAllData ()
BEGIN
    SELECT * FROM usuarios;
END //
DELIMITER;