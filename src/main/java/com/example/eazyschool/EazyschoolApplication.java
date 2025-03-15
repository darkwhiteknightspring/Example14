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
