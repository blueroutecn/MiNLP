/*
 * Copyright (c) 2020, Xiaomi and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xiaomi.duckling

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class PlaceQueryTest extends AnyFunSpec with Matchers {
  describe("PlaceQuery") {
    it("levels") {
      PlaceQuery.extract("山东") shouldBe Some("中华人民共和国/山东省")
    }
  }
}
