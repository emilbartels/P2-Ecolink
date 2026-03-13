@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(request -> request.requestMatchers(new AntPathRequestMatcher("/api/Ecopoint/**"))
                .hasRole("ADMIN"))

            .authorizeHttpRequests(request -> request.requestMatchers(new AntPathRequestMatcher("/api/**"))
            .authenticated()
            
            .anyRequest()
            .permitAll()
            
            .httpBasic(Customizer.withDefaults())

            .build();
            )

            
    }
}