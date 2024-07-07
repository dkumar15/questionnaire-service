SET @modern_id = (select id from subject_branches where name='Modern');

INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text, created_at, updated_at) VALUES
(@modern_id, 1, 'display_text Modern',  now(), now()),
(@modern_id, 1, 'display_text Modern',  now(), now());