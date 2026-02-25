CREATE TYPE BookType as ENUM ('PERSONAL_DEVELOPMENT', 'CLASSIC', 'LEISURE', 'DEV_BOOK' , 'ECONOMY' , 'PHILOSOPHY');
CREATE TYPE BookStatus as ENUM ('NOT_STARTED', 'IN_PROGRESS', 'COMPLETED' , 'PAUSED');

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS BookReviews (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    bookName VARCHAR(150) NOT NULL,
    author VARCHAR(50) NOT NULL,
    type BookType NOT NULL,
    rating INT CHECK (rating >= 1 AND rating <= 10) NOT NULL ,
    current_page INT CHECK (current_page >= 0) NOT NULL,
    last_page INT CHECK (last_page >= 0) NOT NULL,
    status BookStatus NOT NULL,
    reading_date DATE NOT NULL,
    last_rereading_date DATE,
    cover VARCHAR(255),
    resume bytea
);

ALTER TABLE BookReviews
    ADD COLUMN completion_percentage FLOAT
        GENERATED ALWAYS AS ((current_page::float / last_page::float) * 100) STORED;

INSERT INTO BookReviews
(bookName, author, type, rating, current_page, last_page, status, reading_date, cover, resume)
VALUES
    ('O Poder do Hábito', 'Charles Duhigg', 'PERSONAL_DEVELOPMENT', 9, 408, 408, 'COMPLETED', '2023-01-15', NULL, NULL),
    ('Clean Code', 'Robert C. Martin', 'DEV_BOOK', 10, 150, 464, 'IN_PROGRESS', '2023-05-20', NULL, NULL),
    ('Dom Casmurro', 'Machado de Assis', 'CLASSIC', 8, 0, 256, 'NOT_STARTED', '2023-10-01', NULL, NULL),
    ('A Riqueza das Nações', 'Adam Smith', 'ECONOMY', 7, 100, 1200, 'PAUSED', '2023-03-10', NULL, NULL),
    ('Meditações', 'Marco Aurélio', 'PHILOSOPHY', 10, 200, 200, 'COMPLETED', '2023-02-14', NULL, NULL),
    ('O Hobbit', 'J.R.R. Tolkien', 'LEISURE', 9, 310, 310, 'COMPLETED', '2023-06-12', NULL, NULL),
    ('Refactoring', 'Martin Fowler', 'DEV_BOOK', 10, 50, 448, 'IN_PROGRESS', '2023-11-05', NULL, NULL),
    ('Pai Rico, Pai Pobre', 'Robert Kiyosaki', 'ECONOMY', 6, 180, 180, 'COMPLETED', '2023-04-22', NULL, NULL),
    ('1984', 'George Orwell', 'CLASSIC', 10, 120, 328, 'IN_PROGRESS', '2023-12-01', NULL, NULL),
    ('Essencialismo', 'Greg McKeown', 'PERSONAL_DEVELOPMENT', 8, 0, 272, 'NOT_STARTED', '2024-01-10', NULL, NULL);



