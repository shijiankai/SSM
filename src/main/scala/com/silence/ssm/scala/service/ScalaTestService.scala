package com.silence.ssm.scala.service

import org.springframework.stereotype.Service

@Service("scalaTestService")
class ScalaTestService {
  
  def execute(name:String) : String = {
     "Scala test service module return data" 
  }
  
}