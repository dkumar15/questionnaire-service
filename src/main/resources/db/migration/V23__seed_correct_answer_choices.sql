SET @question1_id = (select id from QUESTIONS where display_text = 'गुप्त काल से पहले निम्नलिखित में से कौन सी भाषा भारत की लोकभाषा थी?');
SET @question2_id = (select id from QUESTIONS where display_text = 'स्वतंत्रता के बाद के भारत में सबसे अधिक सिंधु घाटी स्थल किस राज्य में पाए गए?');


SET @question1_id = (select id from QUESTIONS where display_text = 'अमेरिका में स्थित अंतरिक्ष अन्वेषण एवं अनुसंधान एजेंसी(SERA) किस देश को मानव अंतरिक्ष उड़ान कार्यक्रम काहिस्सा बनाया।');
SET @question2_id = (select id from QUESTIONS where display_text = '"भारत क्यों मायने र खता ह ै” नामक पुस्तक के लेखक कौन ह ैं?' );
SET @question3_id = (select id from QUESTIONS where display_text = 'किस पूर्वोत्तर र ाज्य में सींग व ाले मेंढ़क की नई प्रजाति खोजी गई जिसका नाम “जेनोफ्रीस अपाटानी” र खा गया ह ै ?');
SET @question4_id = (select id from QUESTIONS where display_text = 'KOO के संदर्भ में निम्नल‍िखि त कथनों पर वि चार करें। 1. भारतीय सोशल मीडिय ा प्लेटफाॅर्म KOO बंद ह ो गया ह ै। 2. इस ऐप को माइक्रो ब्लॉगिं ग साइट टि ्वि टर (अब X) को टक्कर देने के लि ए लॉंच किय ा गया था। 3. KOO एक लैंगवेज बेस्ड सोशलमीडिय ा प्लेटफॉर्म था जिसकी स्था पना 14 दि संबर 2020 को हुई थी।');
SET @question5_id = (select id from QUESTIONS where display_text = 'लिय ोन मास्टर्स शतरंज टूर्ना मेंट 2024 के संदर्भ में निम्नलिखित कथनों पर वि चार करें। 1. पॉंच बार के वि श्व चैम्पिय न वि श्वनाथन आनंद ने 11वीं बार इस खि ताब को जीता। 2. यह प्रतिय ोगि ता स्पे न ने लिय ोन शहर में 30 जून 2024 को अायोजित हुआ। 3. उन्होंने 28 वर्ष पहले 1996 में अपना पहला लिय ोन मास्टर्स का खि ताब जीता था।');
SET @question6_id = (select id from QUESTIONS where display_text = 'वि श्व य ूएफओ दिव स कब मनाया जाता ह ै ?');
SET @question7_id = (select id from QUESTIONS where display_text = '“राष्ट्रीय फोरेंसिक इन् फ्रास्ट्र क्चर एन्हां समेंट य ोजना” के संदर्भ में निम्नलिखि त कथनों पर वि चार करें। 1. प्रधााष्ट्रीय फोरेंसिक इन्फ्रास्ट्र चर एन्हा समेंट य ोजना (NFIES) के लि ए गृह मंत्रालय के प्रस्ताव को मंजूरी दी। 2. इस य ोजना का उद्देश्य 28 र ाज्यों और सभी कें द्र‍शासित प्रदेशों में र ाष्ट्रीय सीबीआई वि ज्ञान वि श्ववि द्यालय की आॅफ कैं पस प्रयोगशालाऍं स्थापि त करके सम्पूर्ण देश में फारेंस्सि‍क वि ज्ञान प्रयोगशालाऍं को शामि ल करना ह ै। 3. इस य ोजना का वर्ष 2024-26 से 2028-30 तक ह ै। उपर्युक्त कथनों में से कौन से सही ह ै।');
SET @question8_id = (select id from QUESTIONS where display_text = 'भारत सरकार ने किस बैंक के साथ महा मारियों के खि‍लाफ तैयारियों के लि ए एक ऋण पत्र पर ह स्ता क्षर किए ह ैं ?' );
SET @question9_id = (select id from QUESTIONS where display_text = 'भारत मंगोलिय ा संयुक्त सैन्य अभ्या स नोमैडि क एलीफें ट का 16वॉ ं संस्कर ण किस र ाज्य में आयोजित किय ा जा रह ा ह ै ?');
SET @question10_id = (select id from QUESTIONS where display_text = 'संघ लोक सेवा आयोग के उम्मी दवारों की सहायता के लि ए कौन सा पोर्टल लॉन्च किय ा गया ह ै ?');


SET @question_1_choice_id = (SELECT id from `answer_choices` where `display_text` = 'प्राकृत');
SET @question_2_choice_id = (SELECT id from `answer_choices` where `display_text` = 'गुजरात');

SET @question_1_choice_id = (SELECT id from `answer_choices` where `display_text` = 'भारत');
SET @question_2_choice_id = (SELECT id from `answer_choices` where `display_text` = 'एस जयशंकर');
SET @question_3_choice_id = (SELECT id from `answer_choices` where `display_text` = 'अरुणाचल प्रदेश' and `question_id`=@question9_id);
SET @question_4_choice_id = (SELECT id from `answer_choices` where `display_text` = 'केवल 1 और 2' and `question_id`=@question4_id);
SET @question_5_choice_id = (SELECT id from `answer_choices` where `display_text` = 'केवल 2 और 3');
SET @question_6_choice_id = (SELECT id from `answer_choices` where `display_text` = '2 जुलाई');
SET @question_7_choice_id = (SELECT id from `answer_choices` where `display_text` = 'केवल 1 और 2' and `question_id`=@question7_id);
SET @question_8_choice_id = (SELECT id from `answer_choices` where `display_text` = 'एडीबी');
SET @question_9_choice_id = (SELECT id from `answer_choices` where `display_text` = 'मेघालय');
SET @question_10_choice_id = (SELECT id from `answer_choices` where `display_text` = 'ई-सांख्यि की पोर्टल');

INSERT INTO `correct_answer_choices` (`question_id`, `correct_choices_id`, `created_at`, `updated_at`) VALUES
(@question1_id, @question_1_choice_id, now(), now()),
(@question2_id, @question_2_choice_id, now(), now()),
(@question1_id, @question_1_choice_id, now(), now()),
(@question2_id, @question_2_choice_id, now(), now()),
(@question3_id, @question_3_choice_id, now(), now()),
(@question4_id, @question_4_choice_id, now(), now()),
(@question5_id, @question_5_choice_id, now(), now()),
(@question6_id, @question_6_choice_id, now(), now()),
(@question7_id, @question_7_choice_id, now(), now()),
(@question8_id, @question_8_choice_id, now(), now()),
(@question9_id, @question_9_choice_id, now(), now()),
(@question10_id, @question_10_choice_id, now(), now());