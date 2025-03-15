package com.example.eazyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*

	Lombok annotations

	@NoArgsConstructor
	@AllArgsConstructor
	@RequiredArgsConstructor (create constructor for final fields)
	@Getter
	@Setter
	@ToString
	@EqualsAndHashCode
	@Data (equal all annotation except 1 and 2)

	@Slf4j (create logger object)

*/

@SpringBootApplication
public class EazyschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyschoolApplication.class, args);
	}

}


/*

	Request scope : Creates bean for every http request.
	Make sure it does not execute time taking logic.
	Considered for scenarios where data reset needs to be done
	after each request.

	Session scope : Never store sensitive or too much information in the session scope.
	Use for scenarios where the information needs to be used in different pages.

	Application scope: One bean for the entire application. (single bean for one servlet context)
	Use for scenarios where we want to store the drop-down values, reference table value that won't change for any of the user.

 */