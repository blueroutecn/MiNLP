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

package duckling.dimension.numeral.multiple

import duckling.Types._
import duckling.dimension.DimRules
import duckling.dimension.implicits._
import duckling.dimension.numeral.Predicates.isPositive
import duckling.dimension.numeral.NumeralData

trait Rules extends DimRules {
  val rule = Rule(
    name = "multiple",
    pattern = List(isPositive.predicate, "倍".regex),
    prod = {
      case Token(_, NumeralData(value, _, _, _, _, _)) :: _ =>
        multiple(value)
    }
  )
}
