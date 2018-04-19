package nl.elstarit.spring.forward.starter.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Slf4j
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http.csrf().disable()
      .authorizeRequests()
      .antMatchers("/**", "/error", "/actuator/**", "/metadata/**", "/api/**", "/page/demos").permitAll()
      .antMatchers("/css/**", "/javascript/**", "/images/**", "/webjars/**").permitAll()
      .antMatchers("/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/security", "/swagger-ui.html", "/webjars/**").permitAll()
      .anyRequest().authenticated()
      .and()
      .logout()
      .clearAuthentication(true)
      .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/page/demos.html")
      .deleteCookies("JSESSIONID")
      .invalidateHttpSession(true);
  }
}
