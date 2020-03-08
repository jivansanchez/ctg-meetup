package others.dry.badcase.validators;

import org.apache.commons.lang3.StringUtils;
import others.dry.dto.Student;
import others.dry.enumerations.MaritalStatusEnum;
import others.dry.validator.StudentValidator;

public class SportsStudentValidator implements StudentValidator {

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
        if (StringUtils.isNotEmpty(data)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    protected boolean isIntegerDataValid(Integer data){
        if (data > 20 && data < 30) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    protected boolean isMaritalStatusValid(MaritalStatusEnum maritalStatusEnum){
        if (maritalStatusEnum != null && MaritalStatusEnum.SINGLE.equals(maritalStatusEnum)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
