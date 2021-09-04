
 /**
 *  @author Fatih ARI - 04.09.2021
 */
 
SELECT DISTINCT city FROM station
WHERE NOT RIGHT(city, 1) IN('a', 'e', 'i', 'o', 'u'); -- RIGHT(city, 1) IN () = RIGHT(city, 1) = 'a' OR RIGHT(city, 1) = 'e' etc.
