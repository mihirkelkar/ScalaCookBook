//this discussion has to do with creating a range, list or array of numbers

var r = 1 to 10
println(r)

//Step through the range by using the keyword "by"
var k = 1 to 10 by 2
println(k)
var j = 1 to 10 by 3
println(j)

//Ranges are an immutable data structure. 


//You can convert your ranges to Arrays and Lists
k.toArray.foreach(println)
println(k.toList)
