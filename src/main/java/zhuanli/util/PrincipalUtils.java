package zhuanli.util;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import zhuanli.domain.User;


public class PrincipalUtils {
	public static User getCurrentPrincipal() {
		return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	public static int getCurrentUserId() {
		return  getCurrentPrincipal().getUserId();
	}
	
	public static boolean hasAuthority(String role) {
		User user = getCurrentPrincipal();
		Set<GrantedAuthority> authorities = user.getAuthorities();
		for (GrantedAuthority authority: authorities) {
			if (authority.getAuthority().equalsIgnoreCase(role)) {
				return true;
			}
		}
		return false;
	}
	
}
