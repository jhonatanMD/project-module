package com.ws.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class ProjectModuleApplicationTests {
	ApplicationModules modules = ApplicationModules.of(ProjectModuleApplication.class);

	@Test
	void shouldBeCompliant() {
		modules.verify();
	}

}
