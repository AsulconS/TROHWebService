-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema trohdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `trohdb` DEFAULT CHARACTER SET utf8 ;
USE `trohdb` ;

-- -----------------------------------------------------
-- Table `trohdb`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trohdb`.`player` (
    `id` INT(8) NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL,
    `score` INT NOT NULL,
    PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Current Verion and Time Configuration
-- -----------------------------------------------------
SELECT version();
SET @@global.time_zone = '+00:00';
SET @@session.time_zone = '+00:00';
SELECT @@global.time_zone, @@session.time_zone;
