import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ArrayHandlerTest {

    private final ArrayHandler arrayHandler = new ArrayHandler();

    @Test
    void checkArray() {
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {1, 7};
        Assertions.assertArrayEquals(arr2,arrayHandler.checkArray(arr)) ;
    }

    @ParameterizedTest
    @MethodSource("dataForFindFourOrOneNumberInArray")
    void findFourOrOneNumberInArray(int[] array,boolean expectedResult) {
        boolean actualResult = arrayHandler.findFourOrOneNumberInArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> dataForFindFourOrOneNumberInArray() {
        List<Arguments> arguments = new ArrayList<Arguments>() {{
            add(Arguments.arguments(new int[]{1,1,1,4,4,1,4,4},true));
            add(Arguments.arguments(new int[]{1,1,1,1,1,1},false));
            add(Arguments.arguments(new int[]{4,4,4,4},false));
            add(Arguments.arguments(new int[]{1,1,4,4,1,4},true));

        }};
        return arguments.stream();
    }

}