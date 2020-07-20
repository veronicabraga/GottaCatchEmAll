import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputTest {

    private Input input;

    @Before
    public void setUp() {
        input = new Input();
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
