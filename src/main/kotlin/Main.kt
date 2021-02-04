fun main() {
    val post1 = Post(id = 11)
    val post2 = Post(id = 11, text = "newText")

    val comment1 = Comment(100, "коммент к посту")

    WallService.add(post1)

    WallService.update(post2)

    WallService.createComment(comment1, 1)
    println(comment1.text)
}


