package com.fw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashBoardController {
	private static Logger logger = Logger.getLogger(DashBoardController.class);
	
	@RequestMapping(value = "/admin/dashboard", method = RequestMethod.GET)
	protected ModelAndView dashboard(ModelMap model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		logger.info("<-- Exited from DashBoardController::dashboard()");

		logger.info("<-- Exited from DashBoardController::dashboard()");
		return new ModelAndView("/admin/dashboard", model);
	}

	@RequestMapping(value = "/admin/dashboard", method = RequestMethod.POST)
	protected ModelAndView getDashBoard(ModelMap model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		logger.info("<-- Exited from DashBoardController::dashboard()");

		
		

		logger.info("<-- Exited from DashBoardController::dashboard()");
		return new ModelAndView("/admin/dashboard", model);
	}
	

}
