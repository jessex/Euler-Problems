//Standard comprehension of square of sums - sum of squares for naturals from 1 to 100
println(math.pow(((for (i <- List.range(1, 101)) yield i).reduceLeft(_+_)),2)-((for (i <- List.range(1, 101)) yield i*i).reduceLeft(_+_)))
