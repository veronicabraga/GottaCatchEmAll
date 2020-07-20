import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class InputTest {

    private Input input;
    private InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;


    @Before
    public void setUp() {
        input = new Input();
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @After
    public void restoreSystemInput() {
        System.setIn(systemIn);
    }

    @Test
    public void demandInputTest() {
        String testString = "NWSESWEN";
        provideInput(testString);

        String directions = input.demandInput();

        assertEquals(testString, directions);
    }

    @Test
    public void validateInputTest() {
        boolean expected = true;
        boolean result = input.validateInput("SNEWNSEW");

        assertEquals("This input is not valid. Please insert correct options. \n", expected, result);
    }

    @Test
    public void validateInputTest2() {
        boolean expected = true;
        boolean result = input.validateInput("ESWNNNESWWSENNWWSSEEWWSSNSEWS");

        assertEquals("This input is not valid. Please insert correct options.", expected, result);
    }

    @Test
    public void validateEmptyInputTest() {
        boolean expected = false;
        boolean result = input.validateInput("");

        assertEquals(expected, result);
    }

    @Test
    public void validateInputWrongCharactersTest() {
        boolean expected = false;
        boolean result = input.validateInput("7YJKINESW%$*&KJHVFDWSAK");

        assertEquals(expected, result);
    }

    @Test
    public void validateInputLowerCaseLettersTest() {
        boolean expected = false;
        boolean result = input.validateInput("sewnswesswwnnn");

        assertEquals(expected, result);
    }


}
