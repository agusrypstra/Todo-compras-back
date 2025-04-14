package com.todoCompras.backend.validation;

import com.todoCompras.backend.dto.local.LocalRequestDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class HorarioValidator implements ConstraintValidator<ValidHorario, LocalRequestDTO> {

    @Override
    public boolean isValid(LocalRequestDTO local, ConstraintValidatorContext context) {
        if (local.isEs24Horas()) {
            return true; // No se requiere validación si es 24 hs
        }

        boolean valid =
                local.getDiasAtencionDesde() != null && !local.getDiasAtencionDesde().isBlank() &&
                        local.getDiasAtencionHasta() != null && !local.getDiasAtencionHasta().isBlank() &&
                        local.getHorarioAtencionDesde() != null && !local.getHorarioAtencionDesde().isBlank() &&
                        local.getHorarioAtencionHasta() != null && !local.getHorarioAtencionHasta().isBlank();

        if (!valid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Debe completar días y horarios si no es 24 hs")
                    .addConstraintViolation();
        }

        return valid;
    }
}
