def get_solutions(p:Int) = { //Brute force
	var count = 0
	for (a <- 1 to p; b <- a to p-a; c = p-a-b; if a*a + b*b == c*c)
		count += 1
	count
}

def compile_solutions(bound:Int) = {
	var max_p = 0
	var max_val = 0
	for (a <- 1 to bound) { //Soooo imperative
		val t = get_solutions(a)
		if(t > max_val) { //Did I mention imperative?
			max_p = a 
			max_val = t
		}
	}
	max_p
}

println(compile_solutions(1000))
