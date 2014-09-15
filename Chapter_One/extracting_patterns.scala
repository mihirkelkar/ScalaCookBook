//Often we want to extract one or more parts of the string that match a regular expression. 

//Solution. 

//1. Define a regular expression that you want to match

//2.Place paranthesis around them so that you can extract them as regular expression groups. 

//Let the string be as follows:
val string = "100 Bananas"

val pattern = "(\\d+) (\\w+)".r

val pattern(count, fruit) = string
println(count)
println(fruit)
