fun main() {
    val post1 = Post(id = 11)
    val post2 = Post(id = 11, text = "newText")

    WallService.add(post1)

    WallService.update(post2)
}


