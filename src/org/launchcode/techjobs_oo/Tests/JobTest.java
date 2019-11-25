package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

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
    String[] testArr;
    String[] testArr2;

    String test_nameD;
    Employer test_employerD;
    Location test_locationD;
    PositionType test_positionD;
    CoreCompetency test_coreCompetencyD;

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

        test_nameD = "";
        test_employerD = new Employer();
        test_locationD = new Location();
        test_positionD = new PositionType();
        test_coreCompetencyD = new CoreCompetency();

        test_jobA = new Job(test_nameA, test_employerA, test_locationA, test_positionA, test_coreCompetencyA);
        test_jobB = new Job(test_nameB, test_employerB, test_locationB, test_positionB, test_coreCompetencyB);

        test_jobC = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testArr = Job.toString(test_jobA).split("\n");
        testArr2 = Job.toString(new Job(test_nameD,test_employerD, test_locationD,test_positionD,test_coreCompetencyD)).split("\n");
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
    @Test
    public void testToString_shouldReturnBlankLineBeforeAndAfterJobInfo(){
        assertTrue(testArr[0].isBlank());
        assertTrue(testArr[testArr.length-1].isBlank());
    }
    @Test
    public void testToString_shouldReturnEachLineWithAppropriateFieldNameAndData(){
        assertEquals("ID: 13",testArr[1]);
        assertEquals("Name: Rayna",testArr[2]);
        assertEquals("Employer: LaunchCode",testArr[3]);
        assertEquals("Location: St. Louis",testArr[4]);
        assertEquals("Position Type: Full Stack",testArr[5]);
        assertEquals("Core Competency: JavaScript",testArr[6]);

        System.out.print(test_jobA.getId());
        System.out.print(test_jobB.getId());
        System.out.print(test_jobC.getId());

    }
    @Test
    public void testToString_shouldPrintDataNotAvailableIfFieldIsEmpty(){
        assertEquals("Employer: Data not available", testArr2[3]);
    }
}
