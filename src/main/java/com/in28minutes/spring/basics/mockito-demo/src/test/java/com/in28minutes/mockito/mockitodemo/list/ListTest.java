package com.in28minutes.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
	
	@Test
	void test() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(3).thenReturn(2);
		assertEquals(3, listMock.size());
		assertEquals(2, listMock.size());

	}
	
	@Test
	void specificParameters() {
		List listMock = mock(List.class);
		
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
	}
	
	@Test
	void genericParameters() {
		List listMock = mock(List.class);
		
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeOtherString");
		assertEquals("SomeOtherString", listMock.get(0));
		assertEquals("SomeOtherString", listMock.get(1));

	}

}
