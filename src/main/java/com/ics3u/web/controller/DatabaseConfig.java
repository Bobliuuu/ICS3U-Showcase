// Import package
package com.ics3u.web.controller;

// Import postgreSQL deprendencies (HikariCP and DataSource) and spring boot frameworks
import com.zaxxer.hikari.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

/**
 * DatabaseConfig will set up the postgreSQL database and convigurate and connect the SQL server with Spring Boot
 */

@Configuration // Specify configuration type
public class DatabaseConfig {
  @Value("${spring.datasource.url}") //Set the value to the Spring Boot DataSource URL created with the database
  private String dbUrl; // Create a private String variable to store the URL of the database, taken from the .env file
  @Bean // Specify the configuration bean type
  /**
   * DataSource method will return the data source of the SQL database
   * @return DataSource config
   */
  public DataSource dataSource() { 
      HikariConfig config = new HikariConfig(); // Create a new HikaruCP config object meant to store the db details
      config.setJdbcUrl(dbUrl); // Set the Java database URL to the specified database URL of the created db from the .env (SPRING_DATASOURCE_URL)
      return new HikariDataSource(config); // Return the data source from the method to the main program
  }
}