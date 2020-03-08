package others.dry.goodcase.validators;

import org.apache.commons.lang3.StringUtils;
import others.dry.dto.Student;

public class BaseStudentValidator {

    protected boolean validateGenerateStudentData(Student student) {
        Boolean isValidId = this.isStringDataValid(student.getId());
        Boolean isValidName = this.isStringDataValid(student.getName());
        Boolean isValidMidName = this.isStringDataValid(student.getMidName());
        Boolean isValidLastName = this.isStringDataValid(student.getLastName());

        return isValidId && isValidName && isValidMidName && isValidLastName;
    }

    protected boolean isStringDataValid(String data){
        if (StringUtils.isNotEmpty(data)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
