/**
 * 
 */
package com.designpattern.methodfactory;

/**
 * Jiaxu
 * Mar 9, 2017
 * 
 */
public class AppleFactory implements FruitFactory {
	public Fruit produce(){
		return new Apple();
	}
	
}
