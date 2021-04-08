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

package duckling.dimension.gender

import duckling.Types._
import duckling.dimension.{Dimension, NilExamples}
import duckling.dimension.implicits._

case object Gender extends Dimension with Rules with NilExamples {
  override val name: String = "Gender"
}

case class GenderData(g: String) extends Resolvable with ResolvedValue {
  override def resolve(context: Context, options: Options): Option[(GenderData, Boolean)] =
    (this, false)
}
