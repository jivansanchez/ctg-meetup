package others.dry.goodcase.validators;

import org.apache.commons.lang3.StringUtils;
import others.dry.dto.Student;
import others.dry.enumerations.MaritalStatusEnum;
import others.dry.validator.StudentValidator;

public class SportsStudentValidator extends BaseStudentValidator implements StudentValidator {

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
