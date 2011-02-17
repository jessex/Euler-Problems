def isPalindrome(s:String) = s.reverse == s
val palindromes = for(a <- (100 to 999); b <- (a to 999); val p = a*b if isPalindrome(p.toString)) yield p
println(palindromes.toList.max)
