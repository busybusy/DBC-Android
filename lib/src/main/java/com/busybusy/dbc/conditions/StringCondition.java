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

import com.busybusy.dbc.DbcAssertionError;
import com.busybusy.dbc.checks.StringChecks;

import static com.busybusy.dbc.Dbc.require;

/**
 * {@linkplain StringChecks} primary implementation
 *
 * @author Trevor
 */
public final class StringCondition extends BasicCondition<CharSequence, StringCondition> implements StringChecks<StringCondition>
{
	public StringCondition(CharSequence subject) { super(subject); }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StringCondition isValid()
	{
		require(this.subject).isNotNull();

		if (this.subject.toString().trim().length() == 0)
		{
			DbcAssertionError.throwNew(new IllegalArgumentException("The provided String is empty"), this.message);
		}

		return result();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StringCondition isValidUUID()
	{
		require(this.subject).isNotNull();

		if (!this.subject.toString().matches(StringChecks.UUID_PATTERN))
		{
			DbcAssertionError.throwNew(new IllegalArgumentException("The provided String is not a valid UUID: " + this.subject), this.message);
		}

		return result();
	}
}
