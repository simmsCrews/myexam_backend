package com.myexam.author.adapter.out.persistence

import com.myexam.author.application.port.out.ExamFindPort
import com.myexam.author.domain.Exam

class ExamFindAdapter(
    // JPA Repo 구성
): ExamFindPort {

    override fun searchExams(pageNum: Int): List<Exam> {
        TODO("Not yet implemented")
    }

}