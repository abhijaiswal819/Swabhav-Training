package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

	@Mock
	Database mockDatabase;

	@Test
	void testQuery() {
		assertNotNull(mockDatabase);
		when(mockDatabase.isAvailable()).thenReturn(true);
		Service service = new Service(mockDatabase);
		assertTrue(service.query("Some sql query"));
	}

	@Test
	void testToString_testUniqueId() {

		when(mockDatabase.getUniqueId()).thenReturn(50);
		Service service = new Service(mockDatabase);
		assertEquals("ID: 50", service.toString());
	}

	@Test
	public void testVerify() {
		// create and configure mock
		when(mockDatabase.getUniqueId()).thenReturn(43);

		// call method testing on the mock with parameter 12
		mockDatabase.setUniqueId(12);
		mockDatabase.getUniqueId();
		mockDatabase.getUniqueId();

		// now check if method testing was called with the parameter 12
		verify(mockDatabase).setUniqueId(ArgumentMatchers.eq(12));

		// was the method called twice?
		verify(mockDatabase, times(2)).getUniqueId();

		// other alternatives for verifiying the number of method calls for a method
		verify(mockDatabase, never()).isAvailable();
		verify(mockDatabase, never()).setUniqueId(13);
		verify(mockDatabase, atLeastOnce()).setUniqueId(12);
		verify(mockDatabase, atLeast(2)).getUniqueId();

		// more options are
		// times(numberOfTimes)
		// atMost(numberOfTimes)
		// This let's you check that no other methods where called on this object.
		// You call it after you have verified the expected method calls.
		verifyNoMoreInteractions(mockDatabase);
	}

}
