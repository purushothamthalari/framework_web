package com.fw.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class LoginController {
	private static Logger logger = Logger.getLogger(LoginController.class);

	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		logger.info("--> Entered into LoginController::printWelcom()");

		User user = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		String name = user.getUsername();
		model.addAttribute("username", name);
		model.addAttribute("errorCssClass","errorblock_none");
		logger.info("<-- Exited from LoginController::printWelcom()");
		return "hello";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(ModelMap model) {
		logger.info("--> Entered into LoginController::showLogin()");
		model.addAttribute("errorCssClass","errorblock_none");
		logger.info("<-- Exited from LoginController::showLogin()");
		return "login";
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.GET)
	public String performLogin(ModelMap model, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("--> Entered into LoginController::performLogin()");
		String viewName = "redirect:/login";
		String name, role = null;
		try {
			Authentication auth = SecurityContextHolder.getContext()
					.getAuthentication();
			name = auth.getName();
			Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) auth.getAuthorities();
			for (GrantedAuthority grantedAuthority : authorities) {
				GrantedAuthority grantedAuthority2 = grantedAuthority;
				role = grantedAuthority2.getAuthority();
			}
	
			logger.debug("Username:" + name + " logged in with role:" + role);
			String requestUrI = request.getRequestURI();
			if (role.equalsIgnoreCase("ROLE_ADMIN") && !requestUrI.contains("admin")) {
				viewName = "redirect:/admin/dashboard";
			}
			if (role.equalsIgnoreCase("ROLE_USER")&& !requestUrI.contains("user")) {
				viewName = "redirect:/user/dashboard";
			}
			
		} catch (Exception e) {
			logger.error("Exception e:",e);
		}
		
		logger.info("<-- Exited from LoginController::performLogin()");
		return viewName;
	}

	@RequestMapping(value = "/loginFailed", method = RequestMethod.GET)
	public String loginError(ModelMap model) {
		logger.info("--> Entered into LoginController::loginError()");
		model.addAttribute("errorCssClass","errorblock_block");
		logger.info("<-- Exited from LoginController::loginError()");
		return "login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		logger.info("--> Entered into LoginController::logout()");
		model.addAttribute("errorCssClass","errorblock_none");
		logger.info("<-- Exited from LoginController::logout()");
		return "login";

	}

}