SET @chemistry_id = (select id from subject_branches where name='Chemistry');

INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text, created_at, updated_at) VALUES
(@chemistry_id, 1, 'display_text Chemistry', now(), now()),
(@chemistry_id, 1, 'display_text Chemistry', now(), now());