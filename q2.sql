SELECT count(*)
FROM member
WHERE
    NOT EXISTS(
        SELECT 1
        FROM checkout_item
        WHERE member_id = member.id);


Answer: 37