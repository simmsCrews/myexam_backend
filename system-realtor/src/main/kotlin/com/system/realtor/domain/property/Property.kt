package com.system.realtor.domain.property

import com.system.realtor.domain.Realtor

/**
매물
 */
class Property(
   val building: String,
   val unit: String,
   val propertyType: PropertyType,
   val realtor: Realtor
) {

}