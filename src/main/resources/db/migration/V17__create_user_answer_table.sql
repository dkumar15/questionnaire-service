CREATE TABLE `user_answers` (
    `id` BIGINT(3) NOT NULL AUTO_INCREMENT,
    `user_id` BIGINT(3) NOT NULL,
    `subject_branch_id` BIGINT(2) NOT NULL,
    `subject_set_Id` INT(2) NOT NULL,
    `question_id` BIGINT(2) NOT NULL,
    `selected_answer_id` BIGINT(3) NOT NULL,
    `is_answer_correct` TINYINT(1) NOT NULL,
    `created_at` TIMESTAMP,
    `updated_at` TIMESTAMP,
    PRIMARY KEY(ID)
);