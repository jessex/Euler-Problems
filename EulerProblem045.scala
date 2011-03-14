def h(n:Int):Long = n*(2*n-1).toLong //Return the nth hexagonal number
def isPentagonal(x:Long):Boolean = {
	val n = (math.sqrt(24*x+1) + 1)/6
	n == math.round(n) //If n is a natural number it is pentagonal
}
//Evaluate from previous pentagonal number (P165) until we find solution
val n = Stream.from(166).find(n => isPentagonal(h(n))).get
println(h(n))
