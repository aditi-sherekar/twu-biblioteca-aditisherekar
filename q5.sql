SELECT member.name, checkout_item.member_id, count(*)
FROM member, checkout_item
WHERE member.id = checkout_item.member_id
GROUP BY member_id
HAVING count(*) > 1;

Answer: Anand Beck (3 Items), Frank Smith (3 Items)