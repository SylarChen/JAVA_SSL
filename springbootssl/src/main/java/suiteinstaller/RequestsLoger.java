package suiteinstaller;


import org.apache.catalina.filters.RequestDumperFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class RequestsLoger {
	@Bean
	public FilterRegistrationBean requestDumperFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		Filter requestDumperFilter = new RequestDumperFilter();
		registration.setFilter(requestDumperFilter);
		registration.addUrlPatterns("/*");
		return registration;
	}
}
