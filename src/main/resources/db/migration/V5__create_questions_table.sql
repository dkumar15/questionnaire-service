CREATE TABLE `QUESTIONS` (
    `id` BIGINT(3) NOT NULL AUTO_INCREMENT,
    `subject_branch_id` BIGINT(2),
    `subject_set_Id` INT(2) NOT NULL,
    `display_text` varchar(2000) NOT NULL,
    `created_at` TIMESTAMP,
    `updated_at` TIMESTAMP,
    PRIMARY KEY(ID)
);