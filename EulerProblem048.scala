//Produce vector of digits of sum of values i^i for i = 1,...,1000
val i = (1 to 1000).map(i => BigInt(i).pow(i)).sum.toString.map(_.asDigit)
//Slide over 10 digits with step size so that we can conveniently get last 10
i.iterator.sliding(10, i.length-10).toList(1).foreach(print)
