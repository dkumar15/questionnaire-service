SET @history_id = (select id from SUBJECTS where name='History');
SET @science_id = (select id from SUBJECTS where name='Science');
SET @geography_id = (select id from SUBJECTS where name='Geography');
SET @economics_id = (select id from SUBJECTS where name='Economics');
SET @polity_id = (select id from SUBJECTS where name='Polity');
SET @currentAffairs_id = (select id from SUBJECTS where name='Current Affairs');
SET @tech_id = (select id from SUBJECTS where name='Tech');

INSERT INTO `subject_branches` (`id`, `subject_id`, `name`, `created_at`, `updated_at`)
    VALUES(1, @history_id, 'Ancient', now(), now()),
    (2, @history_id, 'Mediaeval', now(), now()),
    (3, @history_id, 'Modern', now(), now()),
    (4, @science_id, 'Physics', now(), now()),
    (5, @science_id, 'Chemistry', now(), now()),
    (6, @science_id, 'Biology', now(), now()),
    (7, @geography_id, 'Geography', now(), now()),
    (8, @economics_id, 'Economics', now(), now()),
    (9, @polity_id, 'Polity', now(), now()),
    (10, @currentAffairs_id, 'Current', now(), now()),
    (11, @tech_id, 'Tech', now(), now());
