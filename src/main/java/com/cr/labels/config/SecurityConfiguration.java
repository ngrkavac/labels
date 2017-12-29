package com.cr.labels.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.security.annotations.RooSecurityConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RooSecurityConfiguration
public class SecurityConfiguration {
	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.inMemoryAuthentication()
//				.withUser("user").password("password").roles("USER").and()
//				.withUser("admin").password("password").roles("USER", "ADMIN");
//	}
}
