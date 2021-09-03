/**
 *  @author Fatih ARI - 02.09.2021
 */
 
SELECT country.continent, FLOOR(AVG(city.population)) FROM country INNER JOIN city
ON country.code = city.countrycode
GROUP BY country.continent;
