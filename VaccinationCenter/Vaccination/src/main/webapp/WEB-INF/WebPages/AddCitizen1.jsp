<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Citizen</title>
    <script>
        function updateVaccineStatus() {
            var doses = document.getElementById("doses").value;
            var vaccineStatusField = document.getElementById("status");

            if (doses === "0") {
                vaccineStatusField.value = "Not Vaccinated";
            } else if (doses === "1") {
                vaccineStatusField.value = "One Dose Completed";
            } else if (doses === "2") {
                vaccineStatusField.value = "Fully Vaccinated";
            }
        }
    </script>
</head>
<body>
    <h1 style="text-align: center">Add Citizen</h1>

    <frm:form method="post" action="cinfo" modelAttribute="ctz">
        <p style="text-align: center">
           <label for="name">Citizen Name:</label>
            <frm:input path="name" type="text" placeholder="Citizen Name" />
            <br /><br />
            <label for="city">Citizen City:</label>
            <frm:input path="city" type="text" placeholder="Citizen city Name" />
            <br /><br />
            <label for="doses">No.of Doses Completed:</label>
            <frm:select id="doses" path="doses" onchange="updateVaccineStatus()" >
                <frm:option value="0">0</frm:option>
                <frm:option value="1">1</frm:option>
                <frm:option value="2">2</frm:option>
            </frm:select>
            <br /><br />
            <label for="vaccineStatus">Vaccine Status:</label>
            <frm:input id="status" path="status" type="text"  />
            <br /><br />
            <input type="submit" value="Add New Citizen" />
        </p>
    </frm:form>
</body>
</html>
