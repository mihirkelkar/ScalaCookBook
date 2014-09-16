//Ternary statements in scala are extrmelely simple. 
//They can be something like this. 
val a = true

val x = if(a) 2 else 3
println(x)



//Using a for loop and for each loop in scala
val array = Array("Apples", "Oranges", "Banana")
for(e <- array) println(e)

//Another possible illustartion of the forloop can be
for(e <- array){
  val s = e.toUpperCase
  println(s)
}

//An illustration of the For yeild Structure in scala
//This should yield an array of Upper case strings. 
for(e <- array) yield e.toUpperCase


//An illustration of for loop counters in scala
for(i <- 0 until array.length){
  println(s"$i is ${array(i)}")
}

//Looping through an array with indexes, similar to enumerate in python
for((e, count) <- array.zipWithIndex){
  println(s"$count is $e")
}
