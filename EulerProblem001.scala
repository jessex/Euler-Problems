def sumMults(bound:Int, multiple:Int) = { //boundary is inclusive
	val upTo = bound / multiple 
	upTo * (upTo + 1)/2 * multiple //sum of 1...n = [n(n+1)]/2
}

println(sumMults(999, 3) + sumMults(999, 5) - sumMults(999, 15))
