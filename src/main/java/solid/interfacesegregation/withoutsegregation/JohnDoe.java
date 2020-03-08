package solid.interfacesegregation.withoutsegregation;

public class JohnDoe implements Athlete {

    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }

    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }

    //Aca es donde se rompe el principio, porque JohnDoe es un nadador, no un un atleta de salto alto y largo
    //un nadador no deberia implementar los metodos highJump y longJump
    @Override
    public void highJump() {
    }

    @Override
    public void longJump() {
    }
}
