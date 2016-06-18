/*
 * Copyright 2016 Busy, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.busybusy.dbc.conditions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.UUID;

/**
 * @author Trevor
 */
@RunWith(JUnit4.class)
public class StringCondition_DisabledTest
{
	@Test
	public void isValid() throws Exception
	{
		StringCondition_Disabled condition = new StringCondition_Disabled("Input");
		condition.isValid();

		StringCondition_Disabled badCondition = new StringCondition_Disabled("");
		badCondition.isValid();
	}

	@Test
	public void isValidUUID() throws Exception
	{
		StringCondition_Disabled condition = new StringCondition_Disabled(UUID.randomUUID().toString());
		condition.isValidUUID();

		StringCondition_Disabled badCondition = new StringCondition_Disabled("");
		badCondition.isValidUUID();
	}
}