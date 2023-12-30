-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema EasyFood
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema EasyFood
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `EasyFood` DEFAULT CHARACTER SET utf8 ;
USE `EasyFood` ;

-- -----------------------------------------------------
-- Table `EasyFood`.`Alimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EasyFood`.`Alimento` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(500) NOT NULL,
  `calorias` DECIMAL(10,2) NOT NULL,
  `carboidratos` DECIMAL(10,2) NOT NULL,
  `proteinas` DECIMAL(10,2) NOT NULL,
  `gorduras` DECIMAL(10,2) NOT NULL,
  `fibras` DECIMAL(10,2) NULL,
  `sodio` DECIMAL(10,2) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `EasyFood`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `EasyFood`.`Usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(500) NOT NULL,
  `senha` VARCHAR(500) NOT NULL,
  `email` VARCHAR(500) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
