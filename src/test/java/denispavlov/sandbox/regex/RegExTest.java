package denispavlov.sandbox.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/**
 * User: denispavlov
 * Date: 27/03/2014
 * Time: 12:06
 */
public class RegExTest {

    String ensureNoAssignmentsUsed(final String expression) {

        final Pattern noNewLinesPattern = Pattern.compile("(\\s*)([=><]+)(\\s*)", Pattern.MULTILINE);
        final Matcher noNewLinesMatcher = noNewLinesPattern.matcher(expression);
        String noNewLinesExpression = noNewLinesMatcher.replaceAll("$2");

        final Pattern noAssignPattern = Pattern.compile("(?<![=><])=(?![=><])");
        final Matcher noAssignMatcher = noAssignPattern.matcher(noNewLinesExpression);
        String noAssignExpression = noAssignMatcher.replaceAll("==");

        noAssignExpression = noAssignExpression.replace("=<", "<=");
        noAssignExpression = noAssignExpression.replace("=>", ">=");

        return noAssignExpression;
    }


    @Test
    public void testRegExLookaround() throws Exception {


        // Preceding
        assertEquals("X==Y", ensureNoAssignmentsUsed("X\n=Y"));
        assertEquals("X>=Y", ensureNoAssignmentsUsed("X\n>=Y"));
        assertEquals("X<=Y", ensureNoAssignmentsUsed("X\n<=Y"));
        assertEquals("X>=Y", ensureNoAssignmentsUsed("X\n=>Y"));
        assertEquals("X<=Y", ensureNoAssignmentsUsed("X\n=<Y"));
        assertEquals("X==Y", ensureNoAssignmentsUsed("X\n==Y"));

        // Tailing
        assertEquals("X==Y", ensureNoAssignmentsUsed("X=\nY"));
        assertEquals("X>=Y", ensureNoAssignmentsUsed("X>=\nY"));
        assertEquals("X<=Y", ensureNoAssignmentsUsed("X<=\nY"));
        assertEquals("X>=Y", ensureNoAssignmentsUsed("X=>\nY"));
        assertEquals("X<=Y", ensureNoAssignmentsUsed("X=<\nY"));
        assertEquals("X==Y", ensureNoAssignmentsUsed("X==\nY"));

        // Own line
        assertEquals("X==Y", ensureNoAssignmentsUsed("X\n=\nY"));
        assertEquals("X>=Y", ensureNoAssignmentsUsed("X\n>=\nY"));
        assertEquals("X<=Y", ensureNoAssignmentsUsed("X\n<=\nY"));
        assertEquals("X>=Y", ensureNoAssignmentsUsed("X\n=>\nY"));
        assertEquals("X<=Y", ensureNoAssignmentsUsed("X\n=<\nY"));
        assertEquals("X==Y", ensureNoAssignmentsUsed("X\n==\nY"));

        // Middle
        assertEquals("X==Y", ensureNoAssignmentsUsed("X = Y"));
        assertEquals("X>=Y", ensureNoAssignmentsUsed("X >= Y"));
        assertEquals("X<=Y", ensureNoAssignmentsUsed("X <= Y"));
        assertEquals("X>=Y", ensureNoAssignmentsUsed("X => Y"));
        assertEquals("X<=Y", ensureNoAssignmentsUsed("X =< Y"));
        assertEquals("X==Y", ensureNoAssignmentsUsed("X == Y"));

        // Complex
        assertEquals("X==Y+Z && Y>=Z", ensureNoAssignmentsUsed("X=Y+Z && Y=>Z"));

    }
}
