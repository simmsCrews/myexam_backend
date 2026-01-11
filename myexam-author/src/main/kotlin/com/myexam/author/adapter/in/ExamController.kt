package com.myexam.author.adapter.`in`

import com.myexam.author.adapter.`in`.dto.ExamDto
import com.myexam.author.application.port.`in`.ExamFindUsecase
import com.myexam.author.supoort.Response
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ExamController(
    private val examFindUsecase: ExamFindUsecase
) {
    @GetMapping("/exams")
    fun getExams(
        @RequestParam(required = false) pageNum: Int
    ): Response<List<ExamDto.Response>> {

        val searchExams = examFindUsecase.searchExams(pageNum)
        val result = searchExams.map(ExamDto.Response::from)

        return Response.success(result);
    }
}