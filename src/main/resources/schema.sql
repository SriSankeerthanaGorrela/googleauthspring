-- Creating the 'movies' table with the columns from the Movie entity
CREATE TABLE movies (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    popular BOOLEAN DEFAULT FALSE,
    drama BOOLEAN DEFAULT FALSE,
    comedy BOOLEAN DEFAULT FALSE,
    action BOOLEAN DEFAULT FALSE,
    poster_url VARCHAR(500)  -- Adjust size based on expected URL length
);
