def check(value:Long):Boolean = {
	for (i <- 11 to 20) //Only need 11 to 20 since using 2520 (has 1 to 10)
		if((value % i) != 0) return false
	return true
}

def find11to20Divisor():Long = {
	var seed:Long = 2520 //2520 must be a factor of our result
	while(1==1) {
		seed += 2520
		if(check(seed)) return seed
	}
	return seed
}

println(find11to20Divisor())
