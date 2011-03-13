def nines(n:Int) = (math.pow(10,n)-1).toInt //Integer with n 9s only
/* Limit of evaluation is number with all 9s such that it is larger than the
 * sum of the fifth power of each of the 9s
 */
val limit = Stream.from(1).find(n => nines(n) > math.pow(9,5)*n).get
//Raise each digit to fifth power and return sum
def sumDigitsToFifth(n:Int) = n.toString.map(_.asDigit).map(math.pow(_,5)).sum
println((2 to nines(limit)).view.filter(n => n == sumDigitsToFifth(n)).sum)
