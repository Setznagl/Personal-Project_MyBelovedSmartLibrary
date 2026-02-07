<%@ page import="com.team.servlet.model.SysUser" %>
<%@ page import="jakarta.websocket.Session" %>
<%
  session.setAttribute("SessionUser",null);
  request.getRequestDispatcher("index.jsp").forward(request, response);
%>

