<%@ page language="java" import="java.util.ArrayList" pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.List" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'Appointment.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
<link rel="stylesheet" type="text/css" href="styles.css">
-->

</head>
<script type="text/javascript">
    function doSubmit() {
        var newForm = document.getElementById("appointmentForm");
        newForm.action = "<%=basePath%>servlet/AppointmentServlet";
        newForm.submit();

    }
</script>

<
body >
< font
size = "6" > Doctor
Appointment < / font >
< br >
< br >
< form
id = "appointmentForm"
name = "appointmentForm"
method = "post" >
< label
for= "department" >
Department :
</
label >
< select
name = "department"
id = "department" >
<%
    DepartmentService service = new DepartmentService();

    List<Department> departmentList = new ArrayList<Department>();
    departmentList = service.getAllDepartments();
    for (int i = 0; i < departmentList.size(); i++) {
        Department dep = (Department) departmentList.get(i);
%>

< option
value =
<%=dep.getDepartmentID()%>>
<%=dep.getDepartmentName()%>
</
option >
<%
    }
%>
< / select >
< br >
< br >

< label
for= "doctorName" >
Doctor Name :
<
/
label >
< select
name = "doctorName"
id = "doctorName" >
<%
    DepartmentService service = new DepartmentService();

    List<Department> departmentList = new ArrayList<Department>();
    departmentList = service.getAllDepartments();
    for (int i = 0; i < departmentList.size(); i++) {
        Department dep = (Department) departmentList.get(i);
%>

< option
value =
<%=dep.getDepartmentID()%>>
<%=dep.getDepartmentName()%>
</
option >
<%
    }
%>
< / select >
< br >
< br >

< label
for= "year" >
Date :
</
label >
< select
name = "year"
id = "year" >
<%
    for (int i = 2014; i < 2020; i++) {
%>
< option
value =
<%=i%>>
<%=i%>
</
option >
<%
    }
%>
< / select >

< select
name = "month"
id = "month" >
<%
    for (int j = 1; j <= 12; j++) {
%>
< option
value =
<%=j%> >
<%


    String Month = "";
    if (j == 1) {
        Month = "January";
    }
    if (j == 2) {
        Month = "February";
    }
    if (j == 3) {
        Month = "March";
    }
    if (j == 4) {
        Month = "April";
    }
    if (j == 5) {
        Month = "May";
    }
    if (j == 6) {
        Month = "June";
    }
    if (j == 7) {
        Month = "July";
    }
    if (j == 8) {
        Month = "August";
    }
    if (j == 9) {
        Month = "September";
    }
    if (j == 10) {
        Month = "October";
    }
    if (j == 11) {
        Month = "November";
    }
    if (j == 12) {
        Month = "December";
    }
%>
<%=Month%>
</
option >
<%
    }
%>
< / select >

< select
name = "day"
id = "day" >
<%
    for (int k = 1; k < 31; k++) {
%>
< option
value =
<%=k%>>
<%=k%>
</
option >
<%
    }
%>
< / select >

< br / >
< br / >

< input
type = "submit"
value = "Submit"
onclick = "doSubmit();" >
< / form >


< / body >
< / html >
