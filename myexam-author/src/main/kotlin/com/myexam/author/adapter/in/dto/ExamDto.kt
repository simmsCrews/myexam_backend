package com.myexam.author.adapter.`in`.dto

import com.myexam.author.domain.Exam

class ExamDto {

    data class Response(
        val examId: Long,
        val title: String,
        val content: String,
    ) {
        companion object {
            fun of(
                examId: Long, title: String, content: String
            ): Response = Response(examId, title, content)

            fun from(exam: Exam): Response =
                of(examId = exam.examId, title = exam.title, content = exam.content)
        }
    }

}