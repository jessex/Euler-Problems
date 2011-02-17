val ones = Map("0"->0,"1"->3,"2"->3,"3"->5,"4"->4,"5"->4,"6"->3,"7"->5,"8"->5,"9"->4)
val tens = Map("2"->6,"3"->6,"4"->5,"5"->5,"6"->5,"7"->7,"8"->6,"9"->6)
val teens = Map("10"->3,"11"->6,"12"->6,"13"->8,"14"->8,"15"->7,"16"->7,"17"->9,"18"->8,"19"->8)

def letterCount(i:Int):Int = { //Handles only 3-digit numerals
	val s = i.toString
	if(s.length == 1) return ones(s) //One digit
	else if(s.length == 2) { //Two digits
		val result:Int = 
			if(i < 20) teens(s)
			else tens(s.charAt(0).toString) + ones(s.charAt(1).toString)
		return result
	}
	else { //Three digits
		if((i % 100) == 0) return ones(s.charAt(0).toString) + 7
		else {
			val hund = ones(s.charAt(0).toString) + 10
			val tenStr = s.substring(1, s.length)
			if(tenStr.charAt(0) == '0') //ie. 306, 101
				return ones(tenStr.charAt(1).toString) + hund
			if(tenStr.charAt(0) == '1') //ie. 715, 617
				return teens(tenStr) + hund
			if(tenStr.charAt(1) == '0') //ie. 480, 920
				return tens(tenStr.charAt(0).toString) + hund
			//ie. 658, 999
			return tens(tenStr.charAt(0).toString) + ones(tenStr.charAt(1).toString) + hund
		}
	}
}

var total = 0
for(i <- 1 to 999) total += letterCount(i)
println(total + 11)
