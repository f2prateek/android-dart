/*
 * Copyright 2013 Jake Wharton
 * Copyright 2014 Prateek Srivastava (@f2prateek)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.f2prateek.dart.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

final class ExtraInjection {
  private final String key;
  private final Set<FieldBinding> fieldBindings = new LinkedHashSet<FieldBinding>();

  ExtraInjection(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }

  public Collection<FieldBinding> getFieldBindings() {
    return fieldBindings;
  }

  public List<Binding> getRequiredBindings() {
      return new ArrayList<Binding>(fieldBindings);
  }

  public void addFieldBinding(FieldBinding fieldBinding) {
    fieldBindings.add(fieldBinding);
  }
}
