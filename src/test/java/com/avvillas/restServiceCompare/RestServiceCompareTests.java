package com.avvillas.restServiceCompare;


import com.avvillas.restServiceCompare.business.ComparatorBussiness;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestServiceCompareTests {

        @Autowired
        ComparatorBussiness comparatorBussiness;
                
	@Test
	public void testCompareTrueArmyCase() {
            assertTrue(comparatorBussiness.compararStrings("army", "mary"));
        }
        
        @Test
        public void testCompareFalseArmyCase() {
            assertFalse(comparatorBussiness.compararStrings("Army", "mary"));
        }

        @Test
        public void testCompareFalseMaryCase() {
            assertFalse(comparatorBussiness.compararStrings("Mary", "lary"));
        }
        
        @Test
        public void testCompareFalseTestCase() {
            assertFalse(comparatorBussiness.compararStrings("test", "lary"));
        }
        
        @Test
        public void testCompareFalseTestTestCase() {
            assertFalse(comparatorBussiness.compararStrings("testtest", "mary"));
        }
}
