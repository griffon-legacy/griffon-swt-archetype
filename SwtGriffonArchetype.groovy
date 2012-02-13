/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class SwtGriffonArchetype {
    String version = '1.0'
    String griffonVersion = '0.9.5 > *'
    String license = 'Apache Software License 2.0'
    String documentation = ''
    String source = 'https://github.com/griffon/griffon-swt-archetype'
    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Default archetype for SWT applications'
    String description = '''
Brief description of SWT.

Usage
----
Simply specify the name of the archetype (*swt*) when invoking the `create-app`
command, like this

    griffon create-app sample -archetype=swt

Configuration
-------------
There's no additional configuration required by this archetype.'
'''
}
