package com.generics.interfaces;

//if a class implements a generic interface, this class has to be a generic class.
public class GenericClassImpl<T> implements GenericInterface<T> {

	@Override
	public void setValue(T e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
