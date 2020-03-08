package others.dry.goodcase;

import others.dry.dto.Student;
import others.dry.enumerations.MaritalStatusEnum;
import others.dry.goodcase.validators.SocialAreaStudentValidator;
import others.dry.validator.StudentValidator;

public class Test {

    public static void main(String[] args) {
        Student student = new Student("123456789", "Arnold",
                "M","Palmer", 21, MaritalStatusEnum.SINGLE);

        StudentValidator studentValidator = new SocialAreaStudentValidator();

        System.out.println("Is valid Data Student? " + studentValidator.isDataValid(student));
    }
}
