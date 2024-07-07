CREATE TABLE `USER_DETAILS` (
    `id` BIGINT(3) NOT NULL AUTO_INCREMENT,
    `user_name` varchar(50),
    `email_id` varchar(30) NOT NULL,
    `mobile_no` varchar(12) NOT NULL,
    `created_at` TIMESTAMP,
    `updated_at` TIMESTAMP,
    PRIMARY KEY(ID),
    CONSTRAINT UC_email_mobile UNIQUE (email_id, mobile_no)
);