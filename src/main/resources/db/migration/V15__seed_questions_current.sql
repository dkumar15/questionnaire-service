SET @current_id = (select id from subject_branches where name='Current');

INSERT INTO `QUESTIONS` (subject_branch_id, subject_set_Id, display_text,  created_at, updated_at) VALUES
(@current_id, 1, 'अमेरिका में स्थित अंतरिक्ष अन्वेषण एवं अनुसंधान एजेंसी(SERA) किस देश को मानव अंतरिक्ष उड़ान कार्यक्रम काहिस्सा बनाया।', now(), now()),
(@current_id, 1, '"भारत क्यों मायने र खता ह ै” नामक पुस्तक के लेखक कौन ह ैं?' , now(), now()),
(@current_id, 1, 'किस पूर्वोत्तर र ाज्य में सींग व ाले मेंढ़क की नई प्रजाति खोजी गई जिसका नाम “जेनोफ्रीस अपाटानी” र खा गया ह ै ?',  now(), now()),
(@current_id, 1, 'KOO के संदर्भ में निम्नल‍िखि त कथनों पर वि चार करें। 1. भारतीय सोशल मीडिय ा प्लेटफाॅर्म KOO बंद ह ो गया ह ै। 2. इस ऐप को माइक्रो ब्लॉगिं ग साइट टि ्वि टर (अब X) को टक्कर देने के लि ए लॉंच किय ा गया था। 3. KOO एक लैंगवेज बेस्ड सोशलमीडिय ा प्लेटफॉर्म था जिसकी स्था पना 14 दि संबर 2020 को हुई थी।',  now(), now()),
(@current_id, 1, 'लिय ोन मास्टर्स शतरंज टूर्ना मेंट 2024 के संदर्भ में निम्नलिखित कथनों पर वि चार करें। 1. पॉंच बार के वि श्व चैम्पिय न वि श्वनाथन आनंद ने 11वीं बार इस खि ताब को जीता। 2. यह प्रतिय ोगि ता स्पे न ने लिय ोन शहर में 30 जून 2024 को अायोजित हुआ। 3. उन्होंने 28 वर्ष पहले 1996 में अपना पहला लिय ोन मास्टर्स का खि ताब जीता था।',  now(), now()),
(@current_id, 1, 'वि श्व य ूएफओ दिव स कब मनाया जाता ह ै ?',  now(), now()),
(@current_id, 1, '“राष्ट्रीय फोरेंसिक इन् फ्रास्ट्र क्चर एन्हां समेंट य ोजना” के संदर्भ में निम्नलिखि त कथनों पर वि चार करें। 1. प्रधााष्ट्रीय फोरेंसिक इन्फ्रास्ट्र चर एन्हा समेंट य ोजना (NFIES) के लि ए गृह मंत्रालय के प्रस्ताव को मंजूरी दी। 2. इस य ोजना का उद्देश्य 28 र ाज्यों और सभी कें द्र‍शासित प्रदेशों में र ाष्ट्रीय सीबीआई वि ज्ञान वि श्ववि द्यालय की आॅफ कैं पस प्रयोगशालाऍं स्थापि त करके सम्पूर्ण देश में फारेंस्सि‍क वि ज्ञान प्रयोगशालाऍं को शामि ल करना ह ै। 3. इस य ोजना का वर्ष 2024-26 से 2028-30 तक ह ै। उपर्युक्त कथनों में से कौन से सही ह ै।',  now(), now()),
(@current_id, 1, 'भारत सरकार ने किस बैंक के साथ महा मारियों के खि‍लाफ तैयारियों के लि ए एक ऋण पत्र पर ह स्ता क्षर किए ह ैं ?' , now(), now()),
(@current_id, 1, 'भारत मंगोलिय ा संयुक्त सैन्य अभ्या स नोमैडि क एलीफें ट का 16वॉ ं संस्कर ण किस र ाज्य में आयोजित किय ा जा रह ा ह ै ?',  now(), now()),
(@current_id, 1, 'संघ लोक सेवा आयोग के उम्मी दवारों की सहायता के लि ए कौन सा पोर्टल लॉन्च किय ा गया ह ै ?',  now(), now()),
(@current_id, 1, 'display_text Current',  now(), now())
on duplicate key update `display_text` = VALUES(`display_text`);
