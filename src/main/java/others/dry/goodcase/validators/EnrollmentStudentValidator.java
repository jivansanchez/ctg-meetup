package others.dry.goodcase.validators;

import org.apache.commons.lang3.StringUtils;
import others.dry.dto.Student;
import others.dry.validator.StudentValidator;

public class EnrollmentStudentValidator extends BaseStudentValidator
        implements StudentValidator {

    @Override
    public boolean isDataValid(Student student) {

        Boolean isValidGenericData = this.validateGenerateStudentData(student);
        Boolean isValidAge = this.isIntegerDataValid(student.getAge());

        if (isValidGenericData && isValidAge) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    protected boolean isIntegerDataValid(Integer data){
        if (data > 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
