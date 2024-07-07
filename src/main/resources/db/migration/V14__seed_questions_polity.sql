SET @polity_id = (select id from subject_branches where name='Polity');

INSERT INTO `QUESTIONS` (subject_set_Id, subject_branch_id, display_text, created_at, updated_at) VALUES
(@polity_id, 1, 'display_text Polity',  now(), now()),
(@polity_id, 1, 'display_text Polity',  now(), now());