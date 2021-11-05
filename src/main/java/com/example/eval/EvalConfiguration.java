package com.example.eval;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.eval.adresses.AdressConfiguration;
import com.example.eval.nurses.NurseConfiguration;
import com.example.eval.patients.PatientConfiguration;

@Configuration
@Import({ PatientConfiguration.class, NurseConfiguration.class, AdressConfiguration.class })
public class EvalConfiguration {

}
