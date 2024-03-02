import org.junit.jupiter.api.Test;

public class Tests extends pageObjects{

    @Test
    public void FirstTest(){
        openWebsite();
        loginAsStandartUser();
        checkTheUrl();
    }
}