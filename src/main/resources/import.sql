--
-- JBoss, Home of Professional Open Source
-- Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
-- contributors by the @authors tag. See the copyright.txt in the
-- distribution for a full listing of individual contributors.
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- http://www.apache.org/licenses/LICENSE-2.0
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

--CREATE table AnalyticalData(ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,  USERNAME VARCHAR(20) NOT NULL UNIQUE , FIRSTNAME VARCHAR(20) NOT NULL, LASTNAME VARCHAR(20) NOT NULL);
--
--INSERT INTO AnalyticalData (USERNAME, FIRSTNAME, LASTNAME) VALUES ('jdoe', 'John', 'Doe');
--INSERT INTO AnalyticalData (USERNAME, FIRSTNAME, LASTNAME) VALUES ('emuster', 'Erika', 'Mustermann'); 
CREATE TABLE analyticalData (
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 
device_id INT NOT NULL UNIQUE, 
discipline_name VARCHAR(20) NOT NULL,
locus_name VARCHAR(20) NOT NULL,
assigned_recall_time INT NOT NULL,
assigned_practice_time int NOT NULL
no_of_items int NOT NULL );