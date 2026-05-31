#!/usr/bin/env python3
"""Write pom.xml for pcehr-compiled-wsdl-java (Java 11 / Jakarta)."""
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
executions = (ROOT / "scripts" / "wsimport-executions.xml").read_text(encoding="utf-8")
merge_names = (ROOT / "scripts" / "merge-names.txt").read_text(encoding="utf-8").rstrip()

pom = f'''<?xml version="1.0" encoding="UTF-8"?>
<!--
  Copyright 2012 NEHTA
  Copyright 2021-2026 ADHA (Australian Digital Health Agency)
  SPDX: Apache-2.0; full text in LICENSE.txt at the repository root.
-->
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>au.gov.nehta</groupId>
    <artifactId>pcehr-compiled-wsdl</artifactId>
    <version>1.7.0-SNAPSHOT</version>
    <name>PCEHR Compiled WSDL library</name>
    <description>MHR B2B WSDL and Jakarta generated types (Java 11)</description>
    <url>https://github.com/AuDigitalHealth/pcehr-compiled-wsdl-java</url>

    <licenses>
        <license>
            <name>Apache License, Version 2.0</name>
            <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
            <distribution>repo</distribution>
        </license>
    </licenses>

    <developers>
        <developer>
            <name>Admin Open Source</name>
            <email>admin.opensource@digitalhealth.gov.au</email>
            <organization>Australian Digital Health Agency</organization>
            <url>www.digitalhealth.gov.au</url>
            <organizationUrl>www.digitalhealth.gov.au</organizationUrl>
            <roles>
                <role>Admin</role>
            </roles>
            <timezone>UTC+10:00</timezone>
        </developer>
    </developers>

    <scm>
        <connection>scm:git:https://github.com/AuDigitalHealth/pcehr-compiled-wsdl-java.git
        </connection>
        <developerConnection>
            scm:git:https://github.com/AuDigitalHealth/pcehr-compiled-wsdl-java.git
        </developerConnection>
        <url>https://github.com/AuDigitalHealth/pcehr-compiled-wsdl-java.git</url>
        <tag>HEAD</tag>
    </scm>

    <distributionManagement>
        <snapshotRepository>
            <id>nexus-snapshots</id>
            <url>https://oss.sonatype.org/content/repositories/snapshots</url>
        </snapshotRepository>
        <repository>
            <id>nexus-releases</id>
            <url>https://oss.sonatype.org/service/local/staging/deploy/maven2</url>
        </repository>
    </distributionManagement>

    <properties>
        <maven.compiler.release>11</maven.compiler.release>
        <encoding>UTF-8</encoding>
        <project.build.sourceEncoding>${{encoding}}</project.build.sourceEncoding>
        <project.reporting.outputEncoding>${{encoding}}</project.reporting.outputEncoding>
        <skipTests>false</skipTests>
        <jaxws.rt.version>4.0.4</jaxws.rt.version>
        <jakarta.jws.api.version>3.0.0</jakarta.jws.api.version>
        <jakarta.xml.bind.api.version>4.0.2</jakarta.xml.bind.api.version>
        <jakarta.xml.ws.api.version>4.0.2</jakarta.xml.ws.api.version>
        <pcehr.wsdl.dir>${{project.basedir}}/src/main/resources/wsdl</pcehr.wsdl.dir>
        <pcehr.binding.dir>${{project.basedir}}/src/main/resources/binding</pcehr.binding.dir>
    </properties>

    <dependencies>
        <dependency>
            <groupId>jakarta.jws</groupId>
            <artifactId>jakarta.jws-api</artifactId>
            <version>${{jakarta.jws.api.version}}</version>
        </dependency>
        <dependency>
            <groupId>jakarta.xml.bind</groupId>
            <artifactId>jakarta.xml.bind-api</artifactId>
            <version>${{jakarta.xml.bind.api.version}}</version>
        </dependency>
        <dependency>
            <groupId>jakarta.xml.ws</groupId>
            <artifactId>jakarta.xml.ws-api</artifactId>
            <version>${{jakarta.xml.ws.api.version}}</version>
        </dependency>
        <dependency>
            <groupId>com.sun.xml.ws</groupId>
            <artifactId>jaxws-rt</artifactId>
            <version>${{jaxws.rt.version}}</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-clean-plugin</artifactId>
                <version>3.5.0</version>
                <configuration>
                    <retryOnError>true</retryOnError>
                    <fast>false</fast>
                    <force>true</force>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-gpg-plugin</artifactId>
                <version>3.2.8</version>
                <configuration>
                    <skip>true</skip>
                </configuration>
                <executions>
                    <execution>
                        <id>sign-artifacts</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>sign</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-javadoc-plugin</artifactId>
                <version>3.12.0</version>
                <configuration>
                    <doclint>none</doclint>
                    <encoding>${{encoding}}</encoding>
                </configuration>
                <executions>
                    <execution>
                        <id>attach-javadocs</id>
                        <goals>
                            <goal>jar</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-source-plugin</artifactId>
                <version>3.4.0</version>
                <executions>
                    <execution>
                        <id>attach-sources</id>
                        <goals>
                            <goal>jar</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-deploy-plugin</artifactId>
                <version>3.1.4</version>
                <configuration>
                    <skip>true</skip>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.sonatype.plugins</groupId>
                <artifactId>nexus-staging-maven-plugin</artifactId>
                <version>1.7.0</version>
                <extensions>true</extensions>
                <configuration>
                    <serverId>nexus-releases</serverId>
                    <nexusUrl>https://oss.sonatype.org/</nexusUrl>
                    <autoReleaseAfterClose>true</autoReleaseAfterClose>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.5.5</version>
                <configuration>
                    <skipTests>${{skipTests}}</skipTests>
                    <encoding>UTF-8</encoding>
                    <enableAssertions>true</enableAssertions>
                    <argLine>-Xmx1024m</argLine>
                    <includes>
                        <include>**/GeneratedWsdlBindingsTest.java</include>
                    </includes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-release-plugin</artifactId>
                <version>3.3.1</version>
                <configuration>
                    <useReleaseProfile>false</useReleaseProfile>
                    <releaseProfiles>release</releaseProfiles>
                    <localCheckout>true</localCheckout>
                    <dryRun>false</dryRun>
                    <goals>deploy</goals>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.15.0</version>
                <configuration>
                    <release>${{maven.compiler.release}}</release>
                    <encoding>${{project.build.sourceEncoding}}</encoding>
                    <debug>true</debug>
                    <debuglevel>lines,vars,source</debuglevel>
                    <showDeprecation>true</showDeprecation>
                    <showWarnings>true</showWarnings>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.4.2</version>
            </plugin>
        </plugins>
    </build>

    <profiles>
        <profile>
            <id>regenerate-sources</id>
            <properties>
                <groovy.version>4.0.32</groovy.version>
                <gmavenplus.plugin.version>4.3.1</gmavenplus.plugin.version>
                <jaxws.maven.plugin.version>4.0.2</jaxws.maven.plugin.version>
                <jaxb.xjc.version>4.0.7</jaxb.xjc.version>
            </properties>
            <build>
                <plugins>
                    <plugin>
                        <groupId>org.codehaus.gmavenplus</groupId>
                        <artifactId>gmavenplus-plugin</artifactId>
                        <version>${{gmavenplus.plugin.version}}</version>
                        <executions>
                            <execution>
                                <id>merge-wsimport</id>
                                <phase>process-sources</phase>
                                <goals><goal>execute</goal></goals>
                                <configuration>
                                    <scripts>
                                        <script><![CDATA[
                                            def bd = project.build.directory as File
                                            def out = new File(bd, 'generated-sources/wsimport')
                                            out.mkdirs()
                                            def base = new File(bd, 'generated-sources/wsimport-parts')
                                            def names = [
{merge_names}
                                            ]
                                            names.each {{ String part ->
                                                def dir = new File(base, part)
                                                if (!dir.isDirectory()) return
                                                dir.eachFileRecurse(groovy.io.FileType.FILES) {{ File f ->
                                                    def rel = dir.toPath().relativize(f.toPath()).toString().replace('\\\\', '/')
                                                    def target = new File(out, rel)
                                                    target.parentFile.mkdirs()
                                                    if (!target.exists()) {{
                                                        f.withInputStream {{ ins -> target.withOutputStream {{ os -> os << ins }} }}
                                                    }}
                                                }}
                                            }}
                                            def syncFlag = project.properties.getProperty('pcehr.wsdl.sync.generated')
                                            if (syncFlag == null || syncFlag.trim().isEmpty()) {{
                                                syncFlag = session.userProperties.getProperty('pcehr.wsdl.sync.generated', 'false')
                                            }}
                                            if ('true'.equalsIgnoreCase(String.valueOf(syncFlag).trim())) {{
                                                def srcMain = new File(project.basedir, 'src/main/java')
                                                out.eachFileRecurse(groovy.io.FileType.FILES) {{ File f ->
                                                    if (!f.name.endsWith('.java')) return
                                                    def rel = out.toPath().relativize(f.toPath()).toString().replace('\\\\', '/')
                                                    def target = new File(srcMain, rel)
                                                    target.parentFile.mkdirs()
                                                    f.withInputStream {{ ins -> target.withOutputStream {{ os -> os << ins }} }}
                                                }}
                                                log.info('Synced generated sources to src/main/java')
                                            }}
                                        ]]></script>
                                    </scripts>
                                </configuration>
                            </execution>
                        </executions>
                        <dependencies>
                            <dependency>
                                <groupId>org.apache.groovy</groupId>
                                <artifactId>groovy</artifactId>
                                <version>${{groovy.version}}</version>
                                <scope>runtime</scope>
                            </dependency>
                        </dependencies>
                    </plugin>
                    <plugin>
                        <groupId>com.sun.xml.ws</groupId>
                        <artifactId>jaxws-maven-plugin</artifactId>
                        <version>${{jaxws.maven.plugin.version}}</version>
                        <dependencies>
                            <dependency>
                                <groupId>com.sun.xml.ws</groupId>
                                <artifactId>jaxws-tools</artifactId>
                                <version>${{jaxws.rt.version}}</version>
                            </dependency>
                            <dependency>
                                <groupId>org.glassfish.jaxb</groupId>
                                <artifactId>jaxb-xjc</artifactId>
                                <version>${{jaxb.xjc.version}}</version>
                            </dependency>
                        </dependencies>
                        <configuration>
                            <xnocompile>true</xnocompile>
                            <extension>true</extension>
                            <quiet>true</quiet>
                            <encoding>${{project.build.sourceEncoding}}</encoding>
                            <xadditionalHeaders>true</xadditionalHeaders>
                            <xjcArgs>
                                <xjcArg>-XautoNameResolution</xjcArg>
                            </xjcArgs>
                            <vmArgs>
                                <vmArg>-Djavax.xml.accessExternalSchema=all</vmArg>
                                <vmArg>-Djava.io.tmpdir=${{project.build.directory}}/jaxws/tmp</vmArg>
                            </vmArgs>
                        </configuration>
                        <executions>
{executions}
                        </executions>
                    </plugin>
                    <plugin>
                        <groupId>org.apache.maven.plugins</groupId>
                        <artifactId>maven-enforcer-plugin</artifactId>
                        <version>3.5.0</version>
                        <executions>
                            <execution>
                                <id>require-pcehr-schema-tree</id>
                                <phase>initialize</phase>
                                <goals><goal>enforce</goal></goals>
                                <configuration>
                                    <rules>
                                        <requireFilesExist>
                                            <files>
                                                <file>${{project.basedir}}/src/main/resources/schema/Common/PCEHR_CommonTypes.xsd</file>
                                            </files>
                                            <message>Regeneration requires PCEHR XSD under src/main/resources/schema (see schema/readme.txt).</message>
                                        </requireFilesExist>
                                    </rules>
                                </configuration>
                            </execution>
                        </executions>
                    </plugin>
                </plugins>
            </build>
        </profile>
    </profiles>

</project>
'''

(ROOT / "pom.xml").write_text(pom, encoding="utf-8", newline="\n")
print("Wrote pom.xml")
