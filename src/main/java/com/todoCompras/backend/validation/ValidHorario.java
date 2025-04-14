package com.todoCompras.backend.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = HorarioValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidHorario {
    String message() default "Debe completar días y horarios si no es 24 hs";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}