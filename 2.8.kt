package geometry.shapes

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    val isCircle: Boolean
        get() = true

}

fun createRandomRectangle(): Rectangle {
    val random = Random()

    return Rectangle(random.nextInt(), random.nextInt())
}

fun main() {
    println(createRandomRectangle().isSquare)
    println(createRandomRectangle().isCircle)
}