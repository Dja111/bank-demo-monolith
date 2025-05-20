-- Testbenutzer
INSERT INTO users (first_name, last_name, address, phone, username, password)
VALUES ('Test', 'User1', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser1', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User2', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser2', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User3', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser3', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User4', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser4', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User5', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser5', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User6', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser6', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User7', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser7', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User8', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser8', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User9', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser9', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5'),
       ('Test', 'User10', 'Musterstraße 1, 12345 Berlin', '+49123456789', 'testuser10', '$2a$10$xJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5Z5U5Z5U5ZeXJwL5v5Jz5U5');

-- Deutsche Banken mit korrekten BICs
INSERT INTO accounts (iban, bic, account_number, balance, user_id) VALUES
                                                                       ('DE89370400440532013000', 'DEUTDEBB', '532013000', 1500.00, 1),
                                                                       ('DE75512108001245126199', 'INGDDEFF', '1245126199', 3200.50, 2),
                                                                       ('DE12500105170648489890', 'PBNKDEFF', '70648489890', 875.25, 3),
                                                                       ('DE91100000000123456789', 'MARKDEF1100', '123456789', 4200.75, 4),
                                                                       ('DE02120300000000202051', 'BYLADEM1001', '202051', 150.00, 5),
                                                                       ('DE02500105170137075030', 'PBNKDEFF', '70137075030', 6200.00, 6),
                                                                       ('DE88100900001234567892', 'BEVODEBB', '1234567892', 0.00, 7),
                                                                       ('DE27100777770209299700', 'NORSDE51', '209299700', 15000.00, 8),
                                                                       ('DE89370400440532013001', 'DEUTDEBB', '532013001', -200.00, 9), -- Dispokonto
                                                                       ('DE75512108001245126190', 'INGDDEFF', '1245126190', 50000.00, 10);


-- Realistische Transaktionen zwischen den Testkonten
INSERT INTO transactions (amount, reference, timestamp, source_account_iban, target_account_iban) VALUES
                                                                                                      (150.00, 'Miete März', '2023-03-01 10:00:00', 'DE75512108001245126199', 'DE89370400440532013000'),
                                                                                                      (29.99, 'Amazon Einkauf', '2023-03-02 14:30:00', 'DE89370400440532013000', 'DE91100000000123456789'),
                                                                                                      (75.50, 'Restaurantbesuch', '2023-03-03 20:15:00', 'DE12500105170648489890', 'DE02120300000000202051'),
                                                                                                      (1200.00, 'Gehalt', '2023-03-05 08:00:00', 'DE91100000000123456789', 'DE75512108001245126199'),
                                                                                                      (45.00, 'Stromrechnung', '2023-03-05 12:00:00', 'DE02120300000000202051', 'DE02500105170137075030'),
                                                                                                      (300.00, 'Überweisung Freund', '2023-03-06 16:45:00', 'DE75512108001245126199', 'DE88100900001234567892'),
                                                                                                      (19.99, 'Spotify Abo', '2023-03-10 00:01:00', 'DE89370400440532013000', 'DE27100777770209299700'),
                                                                                                      (650.00, 'Miete April', '2023-04-01 10:00:00', 'DE75512108001245126199', 'DE89370400440532013000'),
                                                                                                      (89.99, 'Technik-Laden', '2023-04-02 11:20:00', 'DE02500105170137075030', 'DE91100000000123456789'),
                                                                                                      (1500.00, 'Gehalt', '2023-04-05 08:00:00', 'DE91100000000123456789', 'DE75512108001245126199'),
                                                                                                      (25.00, 'Mobilfunkrechnung', '2023-04-05 09:30:00', 'DE12500105170648489890', 'DE27100777770209299700'),
                                                                                                      (200.00, 'Rückzahlung', '2023-04-06 18:00:00', 'DE88100900001234567892', 'DE75512108001245126199'),
                                                                                                      (42.50, 'Supermarkt', '2023-04-07 12:15:00', 'DE89370400440532013000', 'DE02120300000000202051'),
                                                                                                      (12.99, 'Netflix Abo', '2023-04-10 00:01:00', 'DE75512108001245126199', 'DE27100777770209299700'),
                                                                                                      (650.00, 'Miete Mai', '2023-05-01 10:00:00', 'DE75512108001245126199', 'DE89370400440532013000'),
                                                                                                      (199.99, 'Möbelhaus', '2023-05-03 15:45:00', 'DE02500105170137075030', 'DE91100000000123456789'),
                                                                                                      (1500.00, 'Gehalt', '2023-05-05 08:00:00', 'DE91100000000123456789', 'DE75512108001245126199'),
                                                                                                      (55.00, 'Internetrechnung', '2023-05-05 11:00:00', 'DE12500105170648489890', 'DE27100777770209299700'),
                                                                                                      (75.00, 'Tanken', '2023-05-06 09:30:00', 'DE89370400440532013000', 'DE02120300000000202051'),
                                                                                                      (9.99, 'App Store', '2023-05-10 00:05:00', 'DE75512108001245126199', 'DE27100777770209299700');