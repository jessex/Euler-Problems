for (a <- 1 to 1000; b <- a to 1000-a; c = 1000-a-b; if a*a + b*b == c*c)
	println(a*b*c)

