package others.dry.goodcase.validators;

import others.dry.dto.Student;
import others.dry.enumerations.MaritalStatusEnum;
import others.dry.validator.StudentValidator;

public class SocialAreaStudentValidator extends BaseStudentValidator
        implements StudentValidator {

    @Override
    public boolean isDataValid(Student student) {
        Boolean isValidGenericData = this.validateGenerateStudentData(student);
        Boolean isValidAge = this.isIntegerDataValid(student.getAge());
        Boolean isValidMaritalStatus = this.isMaritalStatusValid(student.getMaritalStatus());

        if (isValidGenericData && isValidAge && isValidMaritalStatus) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
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
