
<html>
    <head>
        <title>JSP read cookie Page</title>
    </head>
    <body>
        <%
            Cookie[] c = request.getCookies();
                    for(int i=0;i<c.length;i++)
                    {
                    out.println("<br>Cookie name="+c[i].getName()+"<br>");
                    out.println("Cookie value="+c[i].getValue());
        }
        %>
    </body>
</html>