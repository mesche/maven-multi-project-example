/*
 * The MIT License
 *
 * Copyright 2014 Markus Eschenbach.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package de.mes;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

/**
 *
 * @author esche
 */
@RunWith(Parameterized.class)
public class ReactorModuleTest {
    
    private static final String MODULE_NAME = "test";
    
    private final ReactorModule module;

    public ReactorModuleTest(ReactorModule module) {
        this.module = module;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
      return Arrays.asList(new Object[][] {
          { new ReactorModuleTest1() },
          { new ReactorModuleTest2() }
      });
    }
    
    public static class ReactorModuleTest1 implements ReactorModule{
        public String reactorMethod() {
            return MODULE_NAME;
        }
    }
    public static class ReactorModuleTest2 implements ReactorModule{       
        public String reactorMethod() {
            return MODULE_NAME;
        }
    }
    
    @Test
    public void testreactorMethod(){
        Assert.assertEquals(MODULE_NAME,this.module.reactorMethod());       
    }
        
}
