package com.imooc.miaosha.validator;

import com.imooc.miaosha.util.ValidationUtils;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsMobileValidatior implements ConstraintValidator<IsMobile, String> {

    private boolean required = false;


    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        if(required){
            return ValidationUtils.isMobile(value);
        }else{
            if(StringUtils.isEmpty(value)){
                return true;
            }else{
                return ValidationUtils.isMobile(value);
            }
        }
    }
}
