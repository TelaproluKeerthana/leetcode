# Write your MySQL query statement below
select firstName, lastName, city, state from person LEFT JOIN address on address.personId = person.personId;
