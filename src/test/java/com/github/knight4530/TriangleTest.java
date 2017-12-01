package com.github.knight4530;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void getType1() throws Exception {
        //Arrange
        Triangle triangle = new Triangle( 5, 10, 5);

        //Act
        String result = triangle.getType();

        //Assert
        Assert.assertEquals("不是三角形", result);
    }

}
