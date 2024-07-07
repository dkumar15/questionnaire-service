SET @physics_id = (select id from subject_branches where name='Physics');

INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text, created_at, updated_at) VALUES
(@physics_id, 1, 'display_text Physics', now(), now()),
(@physics_id, 1, 'display_text Physics', now(), now());