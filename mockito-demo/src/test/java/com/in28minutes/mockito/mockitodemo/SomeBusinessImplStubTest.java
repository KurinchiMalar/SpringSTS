package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.in28minutes.mockito.mockitodemo.business.SomeBusinessImpl;
import com.in28minutes.mockito.mockitodemo.data.DataService;

class SomeBusinessImplTest {

	@Test
	void test() {
		
		DataServiceStub dataServiceStub = new DataServiceStub();
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		assertEquals(4,businessImpl.findTheGreatest());
	}

}


class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {2,3,4};
	}
	
	
	
}