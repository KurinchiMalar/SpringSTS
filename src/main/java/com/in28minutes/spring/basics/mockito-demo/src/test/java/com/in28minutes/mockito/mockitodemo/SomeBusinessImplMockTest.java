package com.in28minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28minutes.mockito.mockitodemo.business.SomeBusinessImpl;
import com.in28minutes.mockito.mockitodemo.data.DataService;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl someBusinessImpl;

	@Test
	void findTheGreatestTest() {
		
		//DataService dsmock = mock(DataService.class);
		//when(dsmock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		//SomeBusinessImpl businessImpl = new SomeBusinessImpl(dsmock);
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(3,someBusinessImpl.findTheGreatest());
	}

}