SET @tech_id = (select id from subject_branches where name='Tech');


INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text, created_at, updated_at) VALUES
(@tech_id, 1, 'display_text Tech',  now(), now()),
(@tech_id, 1, 'display_text Tech',  now(), now());