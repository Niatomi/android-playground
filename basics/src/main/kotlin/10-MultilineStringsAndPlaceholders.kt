package ru.niatomi

fun main() {
//  Python like heh
    val someDate = "login name"
    val emailTemplate1 = """
        <body>
            <h1>This is a big string</h1>
            <p>Some paragraph</p>
            <h2>This message is required for ${someDate}</h2>
        </body>
    """.trimIndent()

//  As well as like Python
    val emailTemplate2= """
        <body>
            <h1>This is a big string</h1>
            <p>Some paragraph</p>
            <h2>This message is required for %s</h2>
        </body>
    """.trimIndent().format(someDate)
    println(emailTemplate1)
    println(emailTemplate2)
}