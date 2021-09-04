-/**
 *  @author Fatih ARI - 02.09.2021
 */
 
-- RIGHT specifies the characters to be selected from the right side of a string. 
   SELECT name FROM students
   WHERE marks > 75
   ORDER BY RIGHT(name, 3), id ASC;
