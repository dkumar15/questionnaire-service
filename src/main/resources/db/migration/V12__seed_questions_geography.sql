SET @geography_id = (select id from subject_branches where name='Geography');

INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text, created_at, updated_at) VALUES
(@geography_id, 1, 'display_text Geography', now(), now()),
(@geography_id, 1, 'display_text Geography', now(), now());