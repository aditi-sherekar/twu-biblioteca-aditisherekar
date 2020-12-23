SELECT count(*)
FROM book
WHERE
    NOT EXISTS (
        SELECT 1
        FROM checkout_item
        WHERE book_id = book.id
    );

Answer = 6