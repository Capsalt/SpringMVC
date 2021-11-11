<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringMVC</title>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet">
</head>
<body>
<div class="container">
<h1 class="mt-4 text-center">SpringMVC Examples</h1>


<form action="submit">
  <div class="mb-3">
    <label for="number1">Number 1</label>
    <input type="number" class="form-control" id="number1" name="number1" placeholder=" ">
   
  </div>
  <div class="mb-3">
    <label for="number2">Number 2</label>
    <input type="number" class="form-control" id="number2" name="number2" placeholder=" ">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>


</body>
</html>