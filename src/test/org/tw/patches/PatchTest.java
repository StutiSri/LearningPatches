package org.tw.patches;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.assertEquals;

/**
 * Created by stutis on 6/6/17.
 */
public class PatchTest {
    @Test
    public void shouldReturnHelloWorld(){
        Patch patch = new Patch();
        assertEquals("Hello World!", patch.helloWorld());
    }
}
