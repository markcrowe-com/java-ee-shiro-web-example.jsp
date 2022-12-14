/*
 * Copyright (c) 2022 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package io.gitlab.markcrowe.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(WebPaths.USER_ACCOUNT_DETAILS)
public class UserAccountDetailsServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String[] roles = {"Admin", "Power User", "User"};
		request.setAttribute("roles", roles);
		request.getRequestDispatcher(WebPages.ACCOUNT_DETAILS_JSP).forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}
}