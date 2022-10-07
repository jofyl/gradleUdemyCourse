package com.hello

c = {
    println("hello")
}

c.call()

j = { n ->
    println(n % 2 == 0 ? "even" : "odd")
}

j.call(4)
j.call(5)

4.times {n->println n}
4.times {println it}