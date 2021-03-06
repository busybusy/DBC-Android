# Copyright 2016 Busy, LLC
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

# This progaurd config should strip out all of the assertions from the processed code

-assumenosideeffects class com.busybusy.dbc.Dbc {
	public static ** require(...);
	public static ** check(...);
	public static ** ensure(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.BooleanCondition {
	public ** isTrue();
	public ** isFalse();

	public ** message(...);
	public ** isNotNull();
	public ** isNull();
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.BundleCondition {
	public ** containsKey(...);
	public ** valueIsOfType(...);

	public ** message(...);
	public ** isNotNull();
	public ** isNull();
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.DoubleCondition {
	public ** isNear(...);
	public ** isNearWithTolerance(...);
	public ** isNearZero();
	public ** isNearZeroWithTolerance(...);

	public ** isGreaterThan(...);
	public ** isGreaterThanOrEqual(...);
	public ** isLessThan(...);
	public ** isLessThanOrEqual(...);

	public ** message(...);
	public ** isNotNull();
	public ** isNull();
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.FloatCondition {
	public ** isNear(...);
	public ** isNearWithTolerance(...);
	public ** isNearZero();
	public ** isNearZeroWithTolerance(...);

	public ** isGreaterThan(...);
	public ** isGreaterThanOrEqual(...);
	public ** isLessThan(...);
	public ** isLessThanOrEqual(...);

	public ** message(...);
	public ** isNotNull();
	public ** isNull();
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.IntegralCondition {
	public ** isGreaterThan(...);
	public ** isGreaterThanOrEqual(...);
	public ** isLessThan(...);
	public ** isLessThanOrEqual(...);

	public ** message(...);
	public ** isNotNull();
	public ** isNull();
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.ListCondition {
	public ** isNotEmpty();
	public ** hasSize(...);
	public ** hasSizeBetween(...);
	public ** hasSizeGreaterThan(...);
	public ** hasSizeGreaterThanOrEqual(...);
	public ** hasSizeLessThan(...);
	public ** hasSizeLessThanOrEqual(...);

	public ** message(...);
	public ** isNotNull();
	public ** isNull();
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.MapCondition {
	public ** containsKey(...);
	public ** containsValue(...);

	public ** isNotEmpty();
	public ** hasSize(...);
	public ** hasSizeBetween(...);
	public ** hasSizeGreaterThan(...);
	public ** hasSizeGreaterThanOrEqual(...);
	public ** hasSizeLessThan(...);
	public ** hasSizeLessThanOrEqual(...);

	public ** message(...);
	public ** isNotNull();
	public ** isNull();
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.SetCondition {
	public ** contains(...);

	public ** isNotEmpty();
	public ** hasSize(...);
	public ** hasSizeBetween(...);
	public ** hasSizeGreaterThan(...);
	public ** hasSizeGreaterThanOrEqual(...);
	public ** hasSizeLessThan(...);
	public ** hasSizeLessThanOrEqual(...);

	public ** message(...);
	public ** isNotNull();
	public ** isNull();
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.ObjectCondition {
	public ** isNotNull();
	public ** isNull();
	public ** message(...);
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}

-assumenosideeffects class com.busybusy.dbc.conditions.StringCondition {
	public ** isValid();
	public ** isValidUUID();

	public ** isNotNull();
	public ** isNull();
	public ** message(...);
	public ** passes(...);
	public ** fails(...);
	public ** isEqualTo(...);
	public ** isNotEqualTo(...);
}
