//Basically substituting variables in the string
val name = "Eric"

val age = 22

val weight = 165

println(s"My name is $name, I am $age and weigh $weight pounds")

println(s"My age one year from now would be ${age + 1}")

//Or you could do it in a more pythonic way by doing something like this

println("%s is %s years old".format(name, age))
