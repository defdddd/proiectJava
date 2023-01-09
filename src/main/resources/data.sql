INSERT INTO Account (username, password, email, phone_number, role) VALUES
('marian', 'marian', 'marian@marian.com', '1241224', 1),
('string', 'string', 'string', 'string', 0),
('string1', 'string', 'string', 'string', 0),
('valentin', 'string', 'string', 'string', 0),
('string1bc', 'string', 'string', 'string', 0),
('string22', 'string22', 'string', 'string', 0),
('andrei', 'Prptxk12#', 'andrei@gmail.com', '0756514123', 0),
('test', 'Parola123#', 'test@gmail.com', '0756514123', 0);

INSERT INTO Location (location_name, image_location, price_per_hour, location_x, location_y, address) VALUES
('FC Chelsea Bucuresti SA', 'Test location 1 updated', 100, 44.40789806114942, 26.1111227979398, 'Bulevardul Tineretului 2, Bucuresti 040341'),
('Sud Arena', 'location', 70, 44.395078233653585, 26.144351099792264, 'Soseaua Vitan-Bârzesti 5-7, Bucuresti 042121'),
('Teren Fotbal Bucuresti', 'location', 60, 44.44650318845206, 26.15675199794114, 'Str. Doamna Ghica, Bucuresti 022826'),
('Basketball court and football pitch', 'location', 120, 44.411514758231256, 26.098147755442927, 'Bucuresti'),
('Fortius Olimpia', 'location', 160, 44.40967734833804, 26.134028468937746, 'Strada Văilor 18, Bucuresti 031878');

INSERT INTO Review (account_id, location_id, grade, description, date) VALUES
(7, 1, 5, 'I will come again for sure!', 'Thu Dec 08 2022'),
(1, 1, 2, 'A decent location', 'Mon Dec 12 2022'),
(1, 1, 5, 'I like the review feature', 'Mon Dec 12 2022'),
(1, 2, 3, 'Super wow', 'Mon Dec 12 2022'),
(1, 1, 5, 'Great place!', 'Mon Dec 12 2022'),
(1, 1, 1, 'Bad', 'Mon Dec 12 2022'),
(1, 4, 3, 'It is pretty nice', 'Wed Dec 14 2022'),
(1, 1, 3, 'Super', 'Wed Dec 14 2022');

INSERT INTO Booking (account_id, location_id, phone_number, in_date, out_date, total_price) VALUES
(2, 1, 'string', '12-12-2022', '12-13-2022', 34),
(6, 1, 'string', '12-14-2022', '12-20-2022', 69),
(1, 1, '0748081793', 'Wed Dec 21 2022', 'Fri Dec 23 2022', 137),
(3, 1, '1254123', 'Sat Dec 24 2022', 'Mon Dec 26 2022', 112),
(1, 1, '1241224', 'Tue Dec 27 2022', 'Wed Dec 28 2022', 200),
(1, 1, '1241224', 'Thu Dec 29 2022', 'Fri Dec 30 2022', 200),
(1, 4, '1241224', 'Thu Dec 15 2022', 'Fri Dec 16 2022', 240),
(7, 3, '0756513632', 'Thu Dec 15 2022', 'Fri Dec 16 2022', 200),
(1, 1, '1241224', 'Wed Jan 04 2023', 'Fri Jan 06 2023', 300),
(1, 1, '1241224', 'Mon Jan 09 2023', 'Wed Jan 11 2023', 300);