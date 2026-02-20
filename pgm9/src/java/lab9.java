import java.io.*;
import jakarta.servlet.http.*;
public class lab9 extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res)
            throws IOException
    {
        PrintWriter out=res.getWriter();
        String n=req.getParameter("name");
        String s=req.getParameter("usn");
        String m1=req.getParameter("m1");
        String m2=req.getParameter("m2");
        out.println(n+" 's total marks is"+(Integer.parseInt(m1)+Integer.parseInt(m2)));
    }
}