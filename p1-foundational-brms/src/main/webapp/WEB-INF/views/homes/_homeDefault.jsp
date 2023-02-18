<%@page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apna Bus Service</title>
</head>
<body>
	<jsp:include page="../_header.jsp"></jsp:include>
	
	<div style="text-align: center; padding: 10px;">
		<h2>Welcome to MSTANG BUS Services</h2>
		<p style="text-align:center; margin:10px;">Today most things have been digitalized and it is being
			cherished more than ever in the current situation, as this not just
			ensures convenience but also safety, i.e. the need of the hour. Now
			as it comes to bus-ticket booking, in the times we’re living in, no
			one would be willing to stand in long queues and increase their risk
			of catching the virus just to get their tickets booked. And with this
			comes the significance of our online bus reservation website!.</p>
	</div>
	<div style=" margin: 10px; margin-left:500px;">

		<h3>Make your Reservation</h3>
		<form class="book_now">
			<div class="row">
				<div class="col-md-12">
					<span>Source : </span> <input class="online_book"
						placeholder="Enter a source" type="text" />
				</div>
				<div class="col-md-12">
					<span>Destination : </span> <input class="online_book"
						placeholder="Enter a destination" type="text" />
				</div>
				<div class="col-md-12">
					<span>Date-of-travel : </span> <input class="online_book"
						type="date" required />
				</div>
				<div class="col-md-12">
					<button class="book_btn">Book Now</button>
				</div>
			</div>
		</form>

	</div>
	<div style="padding: 10px; top-margin: 10px; text-align:center;">
		<h3 style="text-align: center;">CONVENIENCE ON-THE-GO!</h3>
		<p>Enjoy the following exclusive features on the MSTANG Website
		<p>
		<p>Last Minute Booking - In a hurry to book a bus at the last
			minute? Choose the bus passing from your nearest boarding point and
			book in a few easy steps.</p>
		<p>Boarding Point Navigation - Never lose your way while
			travelling to your boarding point!</p>
		<p>Comprehensive Ticket Details- Everything that you need to make
			the travel hassle free - rest stop details, boarding point images,
			chat with co-passengers, wake-up alarm and much more!</p>
	</div>
	<jsp:include page="../_footer.jsp"></jsp:include>
</body>
</html>
