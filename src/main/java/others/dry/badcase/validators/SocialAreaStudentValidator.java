package others.dry.badcase.validators;

import others.dry.dto.Student;
import others.dry.enumerations.MaritalStatusEnum;
import others.dry.validator.StudentValidator;

public class SocialAreaStudentValidator implements StudentValidator {

    @Override
    public boolean isDataValid(Student student) {
        Boolean isValidId = this.isStringDataValid(student.getId());
        Boolean isValidName = this.isStringDataValid(student.getName());
        Boolean isValidMidName = this.isStringDataValid(student.getMidName());
        Boolean isValidLastName = this.isStringDataValid(student.getLastName());
        Boolean isValidAge = this.isIntegerDataValid(student.getAge());
        Boolean isValidMaritalStatus = this.isMaritalStatusValid(student.getMaritalStatus());

        if (isValidId && isValidName && isValidMidName && isValidLastName
                && isValidAge && isValidMaritalStatus) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    protected boolean isStringDataValid(String data){
        if (data != null && data.length() > 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    protected boolean isIntegerDataValid(Integer data){
        if (data > 0 && data < 60) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    protected boolean isMaritalStatusValid(MaritalStatusEnum maritalStatusEnum){
        if (maritalStatusEnum != null) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
