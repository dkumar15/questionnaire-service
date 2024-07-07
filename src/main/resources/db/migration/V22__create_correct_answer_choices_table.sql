CREATE TABLE `correct_answer_choices` (
    `id` INT(3) NOT NULL AUTO_INCREMENT,
    `question_id` INT(2) NOT NULL,
    `correct_choices_id` INT(2) NOT NULL,
    `created_at` TIMESTAMP,
    `updated_at` TIMESTAMP,
    PRIMARY KEY(ID),
    CONSTRAINT  UC_ID_questionId UNIQUE(id, question_id)
);