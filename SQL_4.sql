SELECT ur.first_name,ur.last_name
FROM users ur
WHERE ur.id IN
(SELECT uid.user_id
FROM user_role_map uid,roles
WHERE uid.role_id=r.id AND roles.name='CUSTOMER_CARE');

/*SELECT * FROM roles;
SELECT * FROM user_role_map;
SELECT * FROM users;*/