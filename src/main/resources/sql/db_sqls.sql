DROP TABLE IF EXISTS `brand_table`;
DROP TABLE IF EXISTS `branch_table`;
DROP TABLE IF EXISTS `lookup_table`;
DROP TABLE IF EXISTS `relationship_table`;

CREATE TABLE `lookup_table`(
	`lookup_id` INT NOT NULL AUTO_INCREMENT,
	`code_data_type` varchar(255) NOT NULL,
	`code` varchar(255) NOT NULL,
	`code_name` varchar(255) NOT NULL,
	`code_description` varchar(255) NOT NULL,
	PRIMARY KEY (`lookup_id`)
);

CREATE TABLE `brand_table` (
	`brand_id` INT NOT NULL AUTO_INCREMENT,
	`brand_name` varchar(140) NOT NULL,
	`created_on` DATETIME NOT NULL,
	`modified_on` DATETIME NOT NULL,
	`branch_id` INT NOT NULL,
	PRIMARY KEY (`brand_id`),
	FOREIGN KEY (branch_id) REFERENCES branch_table(identification)
);

CREATE TABLE `branch_table` (
	`identification` INT NOT NULL AUTO_INCREMENT,
	`sequence_number` varchar(35) NOT NULL,
	`branch_name` varchar(140),
	`branch_type` varchar(255) NOT NULL,
	`branch_sort_code` varchar(8),
	`branch_photo` varchar(255),
	`branch_note` TEXT(2000),
	`created_on` DATETIME NOT NULL,
	`modified_on` DATETIME NOT NULL,
	PRIMARY KEY (`identification`)
);

CREATE TABLE `lookup_table` (
	`lookup_id` INT NOT NULL AUTO_INCREMENT,
	`code_data_type` varchar(255) NOT NULL,
	`code` varchar(255) NOT NULL,
	`code_name` varchar(255) NOT NULL,
	`code_description` varchar(255) NOT NULL,
	PRIMARY KEY (`lookup_id`)
);

CREATE TABLE `relationship_table` (
	`rel_id` INT NOT NULL AUTO_INCREMENT,
	`rel_branch_id` INT NOT NULL,
	`rel_lookup_id` INT NOT NULL,
	PRIMARY KEY (`rel_id`),
	FOREIGN KEY (rel_lookup_id) REFERENCES lookup_table(lookup_id),
	FOREIGN KEY (rel_branch_id) REFERENCES branch_table(identification)
);
