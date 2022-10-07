package com.hello

l = [1,2,3]

println(l)
println(l.class)

l << 4

println(l)

l = l + [5,6]

println(l)

l = l - [3,2]

println(l)

l.each {println(it)}
l.eachPermutation {println(it)}
l.reverseEach {println(it)}