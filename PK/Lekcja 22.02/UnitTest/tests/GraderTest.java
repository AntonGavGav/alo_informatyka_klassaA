import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void FiftyNine_Should_Return_F(){
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }
    @Test
    void SixtyNine_Should_Return_D(){
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }
    @Test
    void SeventyNine_ShouldReturn_C(){
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }
    @Test
    void EightyNine_Should_Return_B(){
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }
    @Test
    void NinetyNine_Should_Return_A(){
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }
    @Test
    void NegativeOne_Should_Return_IllegalArgumentException(){
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-1);
                });
    }
}