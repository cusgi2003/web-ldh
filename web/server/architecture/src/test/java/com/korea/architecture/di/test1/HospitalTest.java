package com.korea.architecture.di.test1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.korea.architecture.di.test1.Hospital;

@SpringBootTest
public class HospitalTest {
   
   @Autowired
   private Hospital hospital;

   @Test
   void hospitalTest() {
      hospital.startMedicalService();
   }
}
