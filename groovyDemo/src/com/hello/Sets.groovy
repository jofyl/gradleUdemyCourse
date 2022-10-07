package com.hello

s = ["java", "python", "js", "python"] as Set

println(s.class)
println(s)

m = [james:"nounou", wiki:"susu", jiji:345]
println(m)

m.each {k, v ->
    println(k + ' / ' + v)
}

println(m.james)
println(m.get("james"))
m.james = "koko"

println(m.james)