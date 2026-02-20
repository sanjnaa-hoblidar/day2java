
<html>
    <head>
        <title>JSP create cookie page</title>
    </head>
    <body>
        <%
            String id=request.getParameter("empid");
            Cookie ck=new Cookie("EMPID",id);
            response.addCookie(ck);
            %>
            <a href ="read.jsp">click here to read cookie </a>
    </body>
</html>