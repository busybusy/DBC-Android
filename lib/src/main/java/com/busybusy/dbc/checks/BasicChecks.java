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

package com.busybusy.dbc.checks;


import java.util.Comparator;
import java.util.concurrent.Callable;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;

/**
 * Combined marker type
 *
 * @author Trevor
 */
public interface BasicChecks<T, Self extends BasicChecks<T, Self>> extends NullChecks<BasicChecks<T, Self>>, BlockChecks<T, Self>
{
	/**
	 * Add a custom message to the assertion to log if the check fails
	 *
	 * @param message Message to use if the next check fails
	 */
	@CheckResult
	Self message(@NonNull String message);

	/**
	 * Add a custom message that is only evaluated when the check fails
	 *
	 * @param lazyMessage A callable setup to produce a message if the next check fails
	 */
	@CheckResult
	Self message(@NonNull Callable<String> lazyMessage);

	/**
	 * Assert that the subject object is equal to param with .equals(T)
	 *
	 * @param toCompare Object to compare against subject
	 */
	Self isEqualTo(T toCompare);

	/**
	 * Assert that the subject object is equal to param with custom comparator
	 *
	 * @param toCompare        Object to compare against subject
	 * @param customComparator Comparator to use against subject and toCompare object
	 */
	Self isEqualTo(T toCompare, Comparator<T> customComparator);

	/**
	 * Assert that the subject object is not equal to param with .equals(T)
	 *
	 * @param toCompare Object to compare against subject
	 */
	Self isNotEqualTo(T toCompare);

	/**
	 * Assert that the subject object is not equal to param with custom comparator
	 *
	 * @param toCompare        Object to compare against subject
	 * @param customComparator Comparator to use against subject and toCompare object
	 */
	Self isNotEqualTo(T toCompare, Comparator<T> customComparator);
}
