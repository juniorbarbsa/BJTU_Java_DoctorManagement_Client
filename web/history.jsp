<%@ page language="java" pageEncoding="ISO-8859-1" %>
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

    <title>My JSP 'History.jsp' starting page</title>

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
        var newForm = document.getElementById("DiagnosisHistoryForm");
        newForm.action = "<%=basePath%>servlet/DiagnosisHistoryServlet";
        newForm.submit();

    }
</script>

<body>
<font size="6">Diagnosis History</font>
<br>
<hr>
<%
    MedicalRecord mr = (MedicalRecord) request.getAttribute("mr");
%>
<div id="DiagnosisHistory">
    <form id="DiagnosisHistoryForm" name="DiagnosisHistoryForm"
          method="post">

        <input type="hidden" name="doctorID"/>

        <input type="submit" value="Query" onclick="doSubmit();">
        <br/>
        <br/>
        <label for="diagnosisDate">
            Diagnosis Date :
        </label>
        <input type="text" name="diagnosisDate" id="diagnosisDate"
               class="text" tabindex="1" value="<%=mr.getDate()%>">

        <br/>
        <br/>


        <label for="doctorName">
            Doctor Name :
        </label>
        <input type="text" name="doctorName" id="doctorName" class="text"
               tabindex="1" value="<%=mr.getDoctorName()%>">
        <br/>
        <br/>

        <label for="symptomps">
            Symptomps :
        </label>
        <br/>
				<textarea rows="4" cols="50" name="symptomps" id="symptomps"
                          value="<%=mr.getSymptomps()%>">
				</textarea>

        <br/>

        <label for="diagnosis">
            Diagnosis :
        </label>
        <br/>
				<textarea rows="4" cols="50" name="diagnosis" id="diagnosis"
                          value="<%=mr.getDiagnosis()%>">
				</textarea>
        <br/>

        <label for="prescription">
            Prescription :
        </label>
        <br/>
				<textarea rows="4" cols="50" name="prescription" id="prescription"
                          value="<%=mr.getPrescription()%>">
				</textarea>

    </form>
</body>
</html>
