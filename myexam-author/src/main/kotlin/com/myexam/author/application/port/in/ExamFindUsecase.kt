package com.myexam.author.application.port.`in`

import com.myexam.author.domain.Exam

interface ExamFindUsecase {

    fun searchExams(pageNum: Int): List<Exam>

}