package com.methods

int product(int x, int y) {
    return x*y
}

def product2(x,y) {
    x*y
}

int product3(int x = 3, int y) {
    return x*y
}

println(product(2, 4))

result = product2 2, 4
println(result)

println(product3(7))

void displayMap (Map productDetails){
    println productDetails.name
    println productDetails.price
}

displayMap name:"hello",price:50
displayMap(name:"hello",price:50)
displayMap([name:"hello",price:50])
