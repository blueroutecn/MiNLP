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

package duckling.dimension.time.unitNumber

import duckling.Types._
import duckling.dimension.{Dimension, DimRules, NilExamples}
import duckling.dimension.implicits._
import duckling.dimension.numeral.{Numeral, NumeralData}

case object UnitNumber extends Dimension with Rules with NilExamples {
  override val name: String = "UnitNumber"
  override val dimDependents: List[Dimension] = List(Numeral)
}

trait Rules extends DimRules {
  val rule = Rule(
    name = "unit number: number <个>",
    pattern = List(isDimension(Numeral).predicate, "个".regex),
    prod = {
      case Token(Numeral, nd: NumeralData) :: _ => Token(UnitNumber, nd)
    }
  )
}
