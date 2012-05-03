/*
Copyright (C) 2012 by CapCaval.org

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package org.capcaval.c3.sample.tutorial4;

import org.capcaval.c3.componentmanager.ComponentManager;
import org.capcaval.c3.sample.tutorial4.numberhmi._impl.NumberIhmImpl;
import org.capcaval.c3.sample.tutorial4.numberproducer._impl.NumberProducerImpl;



public class numberProductionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appDescription = ComponentManager.componentManager.startApplication(
				NumberIhmImpl.class,
				NumberProducerImpl.class);

		System.out.println(appDescription);
	}

}
