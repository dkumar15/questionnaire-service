SET @mediaeval_id = (select id from `subject_branches` where name='Mediaeval');

INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text, created_at, updated_at) VALUES
(@mediaeval_id, 1, 'display_text Mediaeval',  now(), now()),
(@mediaeval_id, 1, 'display_text Mediaeval',  now(), now());