package com.example.springbootvalidation.bean.validation.constraints;

import com.example.springbootvalidation.PersonNameConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.*;

@Target({METHOD, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {PersonNameConstraintValidator.class})
public @interface PersonName {

    String message() default "{javax.validation.constrains.NotNull.message}";

    Class<?>[] group() default {};

    Class<? extends Payload>[] payload() default {};

}
