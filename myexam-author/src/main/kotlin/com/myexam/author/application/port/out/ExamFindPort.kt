package com.myexam.author.application.port.out

import com.myexam.author.domain.Exam

interface ExamFindPort {

    fun searchExams(pageNum: Int): List<Exam>

}