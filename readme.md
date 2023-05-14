[![CodeQL](https://github.com/perconey/eko-kod/actions/workflows/codeql.yml/badge.svg)](https://github.com/perconey/eko-kod/actions/workflows/codeql.yml)
# Zadanie konkursowe ING Zielony Kod
twórca: Michał Minikowski

To repozytorium zawiera aplikację, którą opracowano do realizacji trzech zadań w ramach ING Zielony Kod:
 - Serwis ATM - endpoint /atms/calculateOrder
 - Gra w sieci - endpoint /onlinegame/calculate
 - Transakcje - endpoint /transactions/report

## Kompilacja oraz uruchomienie aplikacji
Możesz zbudować aplikację, używając skryptu `build.sh`, umieszczonego w głównym folderze repozytorium.
Uruchomienie aplikacji jest możliwe poprzez użycie skryptu `run.sh`, który znajduje się również głównym folderze repozytorium.

## Statyczna analiza bezpieczeństwa kodu SAST

Repozytorium posiada skonfigurowaną statyczną analizę bezpieczeństwa kodu źródłowego SAST (Static Application Security Testing) poprzez CodeQL. Tutaj można pobrać wyniki analizy dla najnowszej wersji: [https://github.com/perconey/eko-kod/raw/master/SAST.zip]. Analiza kodu nie wykryła żadnych podatności
<img width="754" alt="image" src="https://github.com/perconey/eko-kod/assets/24498656/da17acab-af7b-47a2-a7c6-02c229263982">


## Licencje Open Source użytych i powiązanych pakietów

Aplikacja wykorzystuje bibliotekę Spring Boot i jej powiązane pakiety, które są udostępniane na licencjach Open Source. Projekt korzysta również z narzędzia do automatyzacji budowy Gradle i Gradle Wrapper, jak również z wtyczek, które są dostępne na licencjach Open Source.

Group: org.springframework Name: spring-beans Version: 6.0.8
Project URL: https://github.com/spring-projects/spring-framework
License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: org.apache.tomcat.embed Name: tomcat-embed-websocket Version: 10.1.8
Project URL: https://tomcat.apache.org/
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: com.fasterxml.jackson.core Name: jackson-core Version: 2.14.2
Project URL: https://github.com/FasterXML/jackson-core
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: org.apache.logging.log4j Name: log4j-api Version: 2.19.0
Project URL: https://www.apache.org/
License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0.txt

Group: ch.qos.logback Name: logback-classic Version: 1.4.7
Project URL: http://www.qos.ch
License: Eclipse Public License - v 1.0 - http://www.eclipse.org/legal/epl-v10.html

Group: io.micrometer Name: micrometer-commons Version: 1.10.6
Project URL: https://github.com/micrometer-metrics/micrometer
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: org.springframework Name: spring-aop Version: 6.0.8
Project URL: https://github.com/spring-projects/spring-framework
License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: com.fasterxml.jackson.core Name: jackson-annotations Version: 2.14.2
Project URL: https://github.com/FasterXML/jackson
License: The Apache Software License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0.txt

Group: com.fasterxml.jackson.core Name: jackson-databind Version: 2.14.2
Project URL: [https://github.com/FasterXML/jackson](https://github.com/FasterXML

Group: org.apache.logging.log4j Name: log4j-to-slf4j Version: 2.19.0
Project URL: https://www.apache.org/
License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0.txt

Group: org.slf4j Name: slf4j-api Version: 2.0.7
Project URL: http://www.slf4j.org
License: MIT License - http://www.opensource.org/licenses/mit-license.php

Group: com.fasterxml.jackson.datatype Name: jackson-datatype-jdk8 Version: 2.14.2
Project URL: https://github.com/FasterXML/jackson-modules-java8/jackson-datatype-jdk8
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: com.fasterxml.jackson.datatype Name: jackson-datatype-jsr310 Version: 2.14.2
Project URL: https://github.com/FasterXML/jackson-modules-java8/jackson-datatype-jsr310
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: jakarta.annotation Name: jakarta.annotation-api Version: 2.1.1
Project URL: https://www.eclipse.org
License: EPL 2.0 - http://www.eclipse.org/legal/epl-2.0

Group: org.springframework Name: spring-beans Version: 6.0.8
Project URL: https://github.com/spring-projects/spring-framework
License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: com.fasterxml.jackson.core Name: jackson-bom Version: 2.14.2
License: The Apache Software License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0.txt

Group: org.apache.tomcat.embed Name: tomcat-embed-core Version: 10.1.8
Project URL: https://tomcat.apache.org/
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: io.micrometer Name: micrometer-observation Version: 1.10.6
Project URL: https://github.com/micrometer-metrics/micrometer
License: Apache License, Version 2.0 

Group: org.springframework Name: spring-aop Version: 6.0.8
Project URL: https://github.com/spring-projects/spring-framework
License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: org.apache.tomcat.embed Name: tomcat-embed-el Version: 10.1.8
Project URL: https://tomcat.apache.org/
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: com.fasterxml.jackson.module Name: jackson-module-parameter-names Version: 2.14.2
Project URL: https://github.com/FasterXML/jackson-modules-java8/jackson-module-parameter-names
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: org.apache.tomcat.embed Name: tomcat-embed-core Version: 10.1.8
Project URL: https://tomcat.apache.org/
License: Apache License, Version 2.0 - http://www.apache.org/licenses/LICENSE-2.0.txt

Group: ch.qos.logback Name: logback-classic Version: 1.4.7
Project URL: http://www.qos.ch
License: Eclipse Public License - v 1.0 - http://www.eclipse.org/legal/epl-v10.html

Group: org.slf4j Name: jul-to-slf4j Version: 2.0.7
Project URL: http://www.slf4j.org
License: MIT License - http://www.opensource.org/licenses/mit-license.php

Group: org.apache.logging.log4j Name: log4j-api Version: 2.19.0
Project URL: https://www.apache.org/
License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0.txt

Group: org.apache.logging.log4j Name: log4j-to-slf4j Version: 2.19.0
Project URL: https://www.apache.org/
License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0.txt

Group: org.springframework Name: spring-context Version: 6.0.8
POM Project URL: https://github.com/spring-projects/spring-framework
POM License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: org.springframework Name: spring-core Version: 6.0.8
POM Project URL: https://github.com/spring-projects/spring-framework
POM License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: org.springframework Name: spring-expression Version: 6.0.8
POM Project URL: https://github.com/spring-projects/spring-framework
POM License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: org.springframework Name: spring-jcl Version: 6.0.8
POM Project URL: https://github.com/spring-projects/spring-framework
POM License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0


Group: org.springframework Name: spring-web Version: 6.0.8
POM Project URL: https://github.com/spring-projects/spring-framework

Group: org.springframework Name: spring-webmvc Version: 6.0.8
POM Project URL: https://github.com/spring-projects/spring-framework
POM License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: org.springframework.boot Name: spring-boot Version: 3.0.6
POM Project URL: https://spring.io/projects/spring-boot
POM License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0

Group: org.springframework.boot Name: spring-boot-autoconfigure Version: 3.0.6
POM Project URL: https://spring.io/projects/spring-boot
POM License: Apache License, Version 2.0 - https://www.apache.org/licenses/LICENSE-2.0
