SET @ancient_id = (select id from subject_branches where name='Ancient');

INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text, created_at, updated_at) VALUES
(@ancient_id, 1, 'गुप्त काल से पहले निम्नलिखित में से कौन सी भाषा भारत की लोकभाषा थी?',  now(), now()),
(@ancient_id, 1, 'स्वतंत्रता के बाद के भारत में सबसे अधिक सिंधु घाटी स्थल किस राज्य में पाए गए?',  now(), now());

