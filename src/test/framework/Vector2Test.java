package test.framework;

import game.framework.Vector2;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Unit test for Vector2.
 */
public class Vector2Test {
    @Test
    public void testAdd() throws Exception {

    }

    @Test
    public void testAddX() throws Exception {

    }

    @Test
    public void testAddY() throws Exception {

    }

    @Test
    public void testBarycentric() throws Exception {

    }

    @Test
    public void testCatmullRom() throws Exception {

    }

    @Test
    public void testClamp() throws Exception {

    }

    @Test
    public void testDirectionAlpha() throws Exception {

    }

    @Test
    public void testDirectionBeta() throws Exception {

    }

    @Test
    public void testDistance() throws Exception {

    }

    @Test
    public void testDistanceSquared() throws Exception {

    }

    @Test
    public void testDivide() throws Exception {

    }

    @Test
    public void testDotProduct() throws Exception {

    }

    @Test
    public void testEquals() throws Exception {
        Vector2 a = new Vector2(1,1);
        Vector2 b = new Vector2(1,1);
        Vector2 c = new Vector2(-1,-1);
        // Assert for null
        Assert.assertNotNull(a);
        Assert.assertNotNull(b);
        Assert.assertNotNull(c);
        // Check the object equal
        Assert.assertTrue(a.equals(b));
        Assert.assertFalse(a.equals(c));
        Assert.assertFalse(b.equals(c));
        // Check the static equal
        Assert.assertTrue(Vector2.equals(a,b));
        Assert.assertFalse(Vector2.equals(c,a));
        Assert.assertFalse(Vector2.equals(c,b));
    }

    @Test
    public void testHermite() throws Exception {

    }

    @Test
    public void testLerp() throws Exception {

    }

    @Test
    public void testMagnitude() throws Exception {

    }

    @Test
    public void testMagnitudeSquared() throws Exception {

    }

    @Test
    public void testMax() throws Exception {

    }

    @Test
    public void testMin() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {

    }

    @Test
    public void testNegate() throws Exception {

    }

    @Test
    public void testNormalize() throws Exception {

    }

    @Test
    public void testPerpendicular() throws Exception {

    }

    @Test
    public void testScalarProjection() throws Exception {

    }

    @Test
    public void testVectorProjection() throws Exception {

    }

    /*
    TODO: Fix the implementation of random
    @Test
    public void testRandom() throws Exception {

    }
    */

    @Test
    public void testReflect() throws Exception {

    }

    @Test
    public void testSmoothStep() throws Exception {

    }

    @Test
    public void testOne() throws Exception {

    }

    @Test
    public void testUnitX() throws Exception {

    }

    @Test
    public void testUnitY() throws Exception {

    }

    @Test
    public void testZero() throws Exception {

    }

    @Test
    public void testSubtract() throws Exception {

    }

    @Test
    public void testSubtractX() throws Exception {

    }

    @Test
    public void testSubtractY() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }

    /*
    TODO: Need to implement transform before being able to test it :)
    @Test
    public void testTransform() throws Exception {

    }
    */

    @Test
    public void testWedgeProduct() throws Exception {

    }
}
