INSERT INTO book(title)
VALUES ('The Pragmatic Programmer');

INSERT INTO member(name)
VALUES ('Aditi Sherekar')

INSERT INTO checkout_item(member_id)
VALUES ((SELECT id FROM member WHERE name = 'Aditi Sherekar'));

UPDATE checkout_item
SET book_id = (SELECT id FROM book WHERE title = 'The Pragmatic Programmer')
WHERE member_id = 43;

SELECT member.name
FROM member, book, checkout_item
WHERE checkout_item.member_id = member.id AND checkout_item.book_id = book.id AND book.title = 'The Pragmatic Programmer';

Answer: Aditi Sherekar