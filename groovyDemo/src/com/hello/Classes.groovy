package com.hello

import com.classes.Patient

p = new Patient()
println(p.firstName)
println(p.lastName)
println(p.age)

p2 = new Patient(firstName: "john", lastName: "billo", age: 16)
println(p2.firstName)
println(p2.lastName)
println(p2.age)

Patient.displayHospital()