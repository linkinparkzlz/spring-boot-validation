package com.example.springbootvalidation;

import com.example.springbootvalidation.bean.validation.constraints.PersonName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class PersonNameConstraintValidator  implements ConstraintValidator<PersonName,String>{
    @Override
    public void initialize(PersonName personName) {



    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
