SET @economics_id = (select id from subject_branches where name='Economics');

INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text, created_at, updated_at) VALUES
(@economics_id, 1, 'display_text Economics',  now(), now()),
(@economics_id, 1, 'display_text Economics',  now(), now());
