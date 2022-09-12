SELECT d.doctor_user_id,u.first_name,u.last_name
FROM doctor_profiles d INNER JOIN users u
ON d.doctor_user_id=u.id
ORDER BY u.created_date_time;
