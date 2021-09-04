 /**
 *  @author Fatih ARI - 04.09.2021
 */
 
SELECT DISTINCT city FROM station
WHERE NOT(LEFT(city, 1) IN('a', 'e', 'i', 'o', 'u') AND RIGHT(city, 1) IN('a', 'e', 'i', 'o', 'u'));
