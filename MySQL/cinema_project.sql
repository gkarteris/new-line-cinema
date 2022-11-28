-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE USER 'user'@'localhost' IDENTIFIED BY 'user';
GRANT ALL PRIVILEGES ON cinema. * TO 'user'@'localhost';
FLUSH PRIVILEGES;
-- -----------------------------------------------------
-- Schema cinema
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cinema` DEFAULT CHARACTER SET utf8 ;
USE `cinema` ;

-- -----------------------------------------------------
-- Table `cinema`.`movie`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`movie` ;

CREATE TABLE IF NOT EXISTS `cinema`.`movie` (
  `title` VARCHAR(50) NOT NULL,
  `review` MEDIUMTEXT NULL,
  `url` VARCHAR(100) NOT NULL,
  `date_produced` VARCHAR(4) NOT NULL,
  `directors` VARCHAR(100) NOT NULL,
  `starring` VARCHAR(500) NOT NULL,
  `genre` SET('action', 'adventure', 'animation', 'biography', 'comedy', 'crime', 'documentary', 'drama', 'family', 'fantasy', 'film-noir', 'history', 'horror', 'music', 'musical', 'mystery', 'romance', 'sci-fi', 'sport', 'thriller', 'war', 'western') NOT NULL,
  PRIMARY KEY (`title`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`contributor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`contributor` ;

CREATE TABLE IF NOT EXISTS `cinema`.`contributor` (
  `name` VARCHAR(50) NOT NULL,
  `title_movie` VARCHAR(50) NOT NULL,
  `face_url` VARCHAR(100) NOT NULL,
  `biograpfy` MEDIUMTEXT NOT NULL,
  PRIMARY KEY (`name`),
  INDEX `title_movie_idx` (`title_movie` ASC),
  CONSTRAINT `title_movie`
    FOREIGN KEY (`title_movie`)
    REFERENCES `cinema`.`movie` (`title`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`award`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`award` ;

CREATE TABLE IF NOT EXISTS `cinema`.`award` (
  `name` VARCHAR(50) NOT NULL,
  `year` VARCHAR(4) NOT NULL,
  `description` TINYTEXT NOT NULL,
  `nomination` ENUM('won', 'nominated') NOT NULL,
  `movie_title` VARCHAR(50) NULL,
  `contributor_name` VARCHAR(50) NULL,
  PRIMARY KEY (`name`),
  INDEX `movie_title_idx` (`movie_title` ASC),
  INDEX `contributor_name_idx` (`contributor_name` ASC),
  CONSTRAINT `movie_title`
    FOREIGN KEY (`movie_title`)
    REFERENCES `cinema`.`movie` (`title`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `contributor_name`
    FOREIGN KEY (`contributor_name`)
    REFERENCES `cinema`.`contributor` (`name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`auditorioum`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`auditorioum` ;

CREATE TABLE IF NOT EXISTS `cinema`.`auditorioum` (
  `aud_name` VARCHAR(50) NOT NULL,
  `floor` SMALLINT(3) NOT NULL,
  `seats_num` TINYINT(3) UNSIGNED NOT NULL,
  `air_con` ENUM('YES', 'NO') NOT NULL,
  PRIMARY KEY (`aud_name`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`employee` ;

CREATE TABLE IF NOT EXISTS `cinema`.`employee` (
  `emp_name` VARCHAR(50) NOT NULL,
  `degree` VARCHAR(50) NULL,
  `resume` MEDIUMTEXT NOT NULL,
  `experience` VARCHAR(100) NULL,
  `hired` DATE NOT NULL,
  PRIMARY KEY (`emp_name`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`cashier`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`cashier` ;

CREATE TABLE IF NOT EXISTS `cinema`.`cashier` (
  `cashier_name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`cashier_name`),
  CONSTRAINT `cashier_name`
    FOREIGN KEY (`cashier_name`)
    REFERENCES `cinema`.`employee` (`emp_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`member_card`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`member_card` ;

CREATE TABLE IF NOT EXISTS `cinema`.`member_card` (
  `id` INT UNSIGNED NOT NULL auto_increment,
  `bonus` INT(3) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
  )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`customer` ;

CREATE TABLE IF NOT EXISTS `cinema`.`customer` (
  `code` INT UNSIGNED NOT NULL auto_increment,
  `card_id` INT UNSIGNED NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  `age` INT(3) UNSIGNED NOT NULL,
  `gender` ENUM('male', 'female') NOT NULL,
  `marital_status` ENUM('single', 'married') NOT NULL,
  PRIMARY KEY (`code`),
  INDEX `id_idx` (`card_id` ASC),
  CONSTRAINT `card_id`
    FOREIGN KEY (`card_id`)
    REFERENCES `cinema`.`member_card` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`ticket`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`ticket` ;

CREATE TABLE IF NOT EXISTS `cinema`.`ticket` (
  `ticket_code` INT UNSIGNED NOT NULL auto_increment,
  `ticket_movie_title` VARCHAR(50) NOT NULL,
  `ticket_aud_name` VARCHAR(50) NOT NULL,
  `date_buyed` DATE NOT NULL,
  `price_2D` FLOAT(4,2),
  `price_3D` FLOAT(4,2),
  `ticket_card_id` INT UNSIGNED NOT NULL,
  #`available` TINYINT(3) UNSIGNED NOT NULL,
  PRIMARY KEY (`ticket_code`),
  INDEX (ticket_aud_name),
    CONSTRAINT `ticket_aud_name`
    FOREIGN KEY (`ticket_aud_name`)
    REFERENCES `cinema`.`auditorioum` (`aud_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  INDEX (ticket_movie_title),
    CONSTRAINT `ticket_movie_title`
    FOREIGN KEY (`ticket_movie_title`)
    REFERENCES `cinema`.`movie` (`title`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    INDEX (ticket_card_id),
    CONSTRAINT `ticket_card_id`
    FOREIGN KEY (`ticket_card_id`)
    REFERENCES `cinema`.`member_card` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `cinema`.`seats`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`seats` ;

CREATE TABLE IF NOT EXISTS `cinema`.`seats` (
  `number` INT(3) UNSIGNED NOT NULL,
  `auditorioum_name` VARCHAR(50) NOT NULL,
  `corridor` ENUM('YES', 'NO') NOT NULL,
  `horizontial` ENUM('center', 'right', 'left') NOT NULL,
  `vertical` ENUM('bottom', 'middle', 'top') NOT NULL,
  PRIMARY KEY (`number`, `auditorioum_name`),
  INDEX `auditorioum_name_idx` (`auditorioum_name` ASC),
  CONSTRAINT `auditorioum_name`
    FOREIGN KEY (`auditorioum_name`)
    REFERENCES `cinema`.`auditorioum` (`aud_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`cleaner`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`cleaner` ;

CREATE TABLE IF NOT EXISTS `cinema`.`cleaner` (
  `cleaner_name` VARCHAR(50) NOT NULL,
  INDEX `cleaner_name_idx` (`cleaner_name` ASC),
  PRIMARY KEY (`cleaner_name`),
  CONSTRAINT `cleaner_name`
    FOREIGN KEY (`cleaner_name`)
    REFERENCES `cinema`.`employee` (`emp_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`supervisor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`supervisor` ;

CREATE TABLE IF NOT EXISTS `cinema`.`supervisor` (
  `supervisor_name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`supervisor_name`),
  CONSTRAINT `supervisor_name`
    FOREIGN KEY (`supervisor_name`)
    REFERENCES `cinema`.`employee` (`emp_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`usher`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`usher` ;

CREATE TABLE IF NOT EXISTS `cinema`.`usher` (
  `usher_name` VARCHAR(50) NOT NULL,
  `usher_aud_name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`usher_name`),
  INDEX `usher_aud_name_idx` (`usher_aud_name` ASC),
  CONSTRAINT `usher_name`
    FOREIGN KEY (`usher_name`)
    REFERENCES `cinema`.`employee` (`emp_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `usher_aud_name`
    FOREIGN KEY (`usher_aud_name`)
    REFERENCES `cinema`.`auditorioum` (`aud_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cinema`.`plays`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`plays` ;

CREATE TABLE IF NOT EXISTS `cinema`.`plays` (
  `plays_aud_name` VARCHAR(50) NOT NULL,
  `title` VARCHAR(50) NOT NULL,
  `start_hour` TIME(4) NOT NULL,
  `end_hour` TIME(4) NOT NULL,
  `date_plays` DATE NOT NULL,
  INDEX (title),
  INDEX (plays_aud_name),
  CONSTRAINT `plays_aud_name`
    FOREIGN KEY (`plays_aud_name`)
    REFERENCES `cinema`.`auditorioum` (`aud_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `title`
    FOREIGN KEY (`title`)
    REFERENCES `cinema`.`movie` (`title`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `cinema`.`movies_seen`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`movies_seen` ;

CREATE TABLE IF NOT EXISTS `cinema`.`movies_seen` (
  `code_ticket` INT UNSIGNED NOT NULL auto_increment,
  `code_customer` INT UNSIGNED NOT NULL,
  `title_of_movie` VARCHAR(50) NOT NULL,
  `rating` ENUM('0','1','2','3','4','5') NOT NULL,
  `date_seen` DATE NOT NULL,
  `projection` ENUM('3D','2D') NOT NULL,
  INDEX `movies_seen_code_id_idx` (`code_customer` ASC),
  CONSTRAINT `code_customer`
    FOREIGN KEY (`code_customer`)
    REFERENCES `cinema`.`customer` (`code`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  INDEX `movies_seen_code_ticket_idx` (`code_ticket` ASC),
  CONSTRAINT `code_ticket`
    FOREIGN KEY (`code_ticket`)
    REFERENCES `cinema`.`ticket` (`ticket_code`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  INDEX `movies_seen_title_of_movie_idx` (`title_of_movie` ASC),
  CONSTRAINT `title_of_movie`
    FOREIGN KEY (`title_of_movie`)
    REFERENCES `cinema`.`movie` (`title`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `cinema`.`shifts`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cinema`.`shifts` ;

CREATE TABLE IF NOT EXISTS `cinema`.`shifts` (
  `shift_emp_name` VARCHAR(50) NOT NULL,
  `shift_date` DATE NOT NULL,
  `start_shift_hour` TIME(4) NOT NULL,
  `end_shift_hour` TIME(4) NOT NULL,
  `shift_inside_the_day` ENUM('morning', 'night') NOT NULL,
  #PRIMARY KEY (``),
  INDEX `shift_emp_name_idx` (`shift_emp_name` ASC),
  CONSTRAINT `shift_emp_name`
    FOREIGN KEY (`shift_emp_name`)
    REFERENCES `cinema`.`employee` (`emp_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
