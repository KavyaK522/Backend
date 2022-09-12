SELECT dr.doctor_user_id,ur.first_name,ur.last_name
FROM doctor_profiles dr INNER JOIN users ur
ON dr.doctor_user_id=ur.id;
