package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import javax.swing.text.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {

    @Test
    public void emptyTest(){
        assertEquals(true, true);
    }

    String test_nameA;
    Employer test_employerA;
    Location test_locationA;
    PositionType test_positionA;
    CoreCompetency test_coreCompetencyA;
    Job test_jobA;

    String test_nameB;
    Employer test_employerB;
    Location test_locationB;
    PositionType test_positionB;
    CoreCompetency test_coreCompetencyB;
    Job test_jobB;
    Job test_jobC;

    @Before
    public void createJobObject(){
        test_nameA = "Rayna";
        test_employerA = new Employer("LaunchCode");
        test_locationA = new Location("St. Louis");
        test_positionA = new PositionType("Full Stack");
        test_coreCompetencyA = new CoreCompetency("JavaScript");

        test_nameB = "Rayna";
        test_employerB = new Employer("LaunchCode");
        test_locationB = new Location("St. Louis");
        test_positionB = new PositionType("Full Stack");
        test_coreCompetencyB = new CoreCompetency("JavaScript");

        test_jobA = new Job(test_nameA, test_employerA, test_locationA, test_positionA, test_coreCompetencyA);
        test_jobB = new Job(test_nameB, test_employerB, test_locationB, test_positionB, test_coreCompetencyB);

        test_jobC = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId(){assertTrue(test_jobA.getId() +1 == test_jobB.getId());}
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", test_jobC.getName());
        assertEquals("ACME", test_jobC.getEmployer().toString());
        assertEquals("Desert", test_jobC.getLocation().toString());
        assertEquals("Quality control", test_jobC.getPositionType().toString());
        assertEquals("Persistence", test_jobC.getCoreCompetency().toString());
    }
    @Test
    public void testJobsForEquality(){assertFalse(test_jobA.equals(test_jobB));}

}
