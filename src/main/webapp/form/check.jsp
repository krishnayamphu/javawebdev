<%
    String name=request.getParameter("name");
    String address=request.getParameter("address");

    out.print("Name:"+name);
    out.print("<br>Address:"+address);
%>