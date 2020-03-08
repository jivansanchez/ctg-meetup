package others.dry.badcase.validators;

import org.apache.commons.lang3.StringUtils;
import others.dry.dto.Student;
import others.dry.validator.StudentValidator;

public class EnrollmentStudentValidator implements StudentValidator {

    @Override
    public boolean isDataValid(Student student) {
        Boolean isValidId = this.isStringDataValid(student.getId());
        Boolean isValidName = this.isStringDataValid(student.getName());
        Boolean isValidMidName = this.isStringDataValid(student.getMidName());
        Boolean isValidLastName = this.isStringDataValid(student.getLastName());
        Boolean isValidAge = this.isIntegerDataValid(student.getAge());

        if (isValidId && isValidName && isValidMidName && isValidLastName && isValidAge) {
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
        if (data > 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
