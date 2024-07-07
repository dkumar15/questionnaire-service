CREATE TABLE `subject_branches` (
    `id` BIGINT(2) NOT NULL,
    `name` varchar(20) NOT NULL,
    `subject_id` BIGINT(2),
    `updated_at` DATETIME,
    `created_at` DATETIME,
    PRIMARY KEY(id)
);