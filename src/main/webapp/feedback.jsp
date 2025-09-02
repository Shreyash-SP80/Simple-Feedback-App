<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <%@ include file="cmp/links.jsp" %>
  </head>
  <body>
  	
  	<%@ include file="header.jsp" %>
    
    <div class="content_container py-4 d-flex flex-column justify-content-center align-items-center">
    	<h3>Fill the feedback from </h3> 
    	<form action="<%= application.getContextPath() %>/feedback" method="post" class="mt-4">
    	
    	  <!-- email field -->
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input placeholder="Enter here" type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp">
		    <div id="emailHelp" class="form-text text-white">We'll never share your email with anyone else.</div>
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Phone Number</label>
		    <input placeholder="Enter here" type="text" class="form-control" name="phone" id="exampleInputPassword1">
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Your Feedback message</label><br>
		    <textarea rows="10" placeholder="Enter here	" name="feedbackMessage" cols="40"></textarea>
		  </div>
		  
		  <div class="container text-center">
		  	<button type="submit" class="btn btn-primary">Submit</button>
		  	<button type="reset" class="btn btn-light">Reset</button>
		  </div>
		</form>
    </div>
    
 	<%@ include file="cmp/scripts.jsp" %>
    
  </body>
</html>