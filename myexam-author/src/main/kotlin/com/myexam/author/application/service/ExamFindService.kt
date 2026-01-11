package com.myexam.author.application.service

import com.myexam.author.application.port.`in`.ExamFindUsecase
import com.myexam.author.domain.Exam
import org.springframework.stereotype.Service

@Service
class ExamFindService(

): ExamFindUsecase {
    override fun searchExams(pageNum: Int): List<Exam> {
        TODO("Not yet implemented")
    }

}