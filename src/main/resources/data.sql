-- INSERT INTO movies (title, genre, popular, poster_url) VALUES
-- ('The Shawshank Redemption', 'Drama', true, 'http://localhost:8080/api/image.png'),
-- ('The Godfather', 'Crime', true, 'http://localhost:8080/api/image1.png'),
-- ('Pulp Fiction', 'Crime', true, 'http://localhost:8080/api/image2.png');
-- Inserting sample movie records
INSERT INTO movies (title, popular, drama, comedy, action, poster_url) VALUES
('The Dark Knight',  true, false, false, true, 'http://localhost:8080/api/image.png'),
('Inception',  true, true, false, true, 'http://localhost:8080/api/image1.png'),
('The Hangover', false, false, true, false, 'http://localhost:8080/api/image2.png'),
('Titanic',  false, true, false, false, 'http://localhost:8080/api/titanic.png'),
('Avengers: Endgame',  true, false, false, true, 'http://localhost:8080/api/avengers.png'),
('Joker',  false, true, false, false, 'http://localhost:8080/api/joker.png');
