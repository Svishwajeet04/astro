package com.example.demo.configurations.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeDetailService;
import com.example.demo.services.JwtUtilService;

@Component
public class SecurityFilter extends OncePerRequestFilter {

	@Autowired
	JwtUtilService jwtutil;

	@Autowired
	private EmployeeDetailService userDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest arg0, HttpServletResponse arg1, FilterChain arg2)
			throws ServletException, IOException {
		final String AuthHeader = arg0.getHeader("Authorization");
		String jwt = null;
		String username = null;
		if (AuthHeader != null && AuthHeader.startsWith("Bearer")) {
			jwt = jwtutil.resolveToken(arg0);
			username = jwtutil.getUsername(jwt);
		}
		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			Employee ud = (Employee) this.userDetailsService.loadUserByUsername(username);

			if (jwtutil.validateToken(jwt, ud.getUsername())) {
				UsernamePasswordAuthenticationToken utoken = new UsernamePasswordAuthenticationToken(username, null,
						ud.getAuthorities());
				utoken.setDetails(new WebAuthenticationDetailsSource().buildDetails(arg0));
				SecurityContextHolder.getContext().setAuthentication(utoken);

				System.out.println("\n yes i am here ");
			}
		}
		arg2.doFilter(arg0, arg1);
	}
}
