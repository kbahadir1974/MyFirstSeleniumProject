package day08;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fatihPractice {



    @BeforeMethod
    public void kamil(){
        System.out.println("before");
    }

    @Test
    public void mustafa(){
        System.out.println("test");
    }

    @AfterMethod
    public void ftatih(){
        System.out.println("after");
    }



}
