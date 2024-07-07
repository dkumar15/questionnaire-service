SET @biology_id = (select id from subject_branches where name='Biology');


INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text,  created_at, updated_at) VALUES
(@biology_id, 1, 'display_text Biology', now(), now()),
(@biology_id, 1, 'display_text Biology', now(), now());