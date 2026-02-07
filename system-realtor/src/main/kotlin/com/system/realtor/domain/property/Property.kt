package com.system.realtor.domain.property

import java.time.LocalDate

import com.system.realtor.domain.Realtor

/**
   매물
 */
class Property(

   //계약 객체
   val contractEndDate: LocalDate,           // 만기일
   val price: String,                        // 가격
   val status: String,                        // 상태

   val landLoad: Landlord,                      // 임대(매도)인

   //주소 vo
   val address: Address,                      // 주소

   val realtor: Realtor
) {

}