package com.myexam.author.domain

data class Exam(
    val examId: Long,
    val title: String,
    val content: String
) {
    companion object {
        fun of(examId: Long, title: String, content: String): Exam =
            Exam(examId = examId, title = title, content = content)
    }
}