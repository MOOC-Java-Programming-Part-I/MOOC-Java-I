import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class ExerciseManagementTest {
    private ExerciseManagement exMgt;

    @Before
    public void initialize(){
        exMgt = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtTheBeginning(){
        assertEquals(0, exMgt.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne(){
        exMgt.add("Write a test");
        assertEquals(1, exMgt.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList(){
        exMgt.add("Write a test");
        assertTrue(exMgt.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        exMgt.add("New exercise");
        exMgt.markAsCompleted("New exercise");
        assertTrue(exMgt.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        exMgt.add("New exercise");
        exMgt.markAsCompleted("New exercise");
        assertFalse(exMgt.isCompleted("Some exercise"));
    }
}
