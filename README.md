Apache HBase [1] is an open-source, distributed, versioned, column-oriented
store modeled after Google' Bigtable: A Distributed Storage System for
Structured Data by Chang et al.[2]  Just as Bigtable leverages the distributed
data storage provided by the Google File System, HBase provides Bigtable-like
capabilities on top of Apache Hadoop [3].

To get started using HBase, the full documentation for this release can be
found under the doc/ directory that accompanies this README.  Using a browser,
open the docs/index.html to view the project home page (or browse to [1]).
The hbase 'book' at docs/book.html has a 'quick start' section and is where you
should being your exploration of the hbase project.

The latest HBase can be downloaded from an Apache Mirror [4].

The source code can be found at [5]

The HBase issue tracker is at [6]

Apache HBase is made available under the Apache License, version 2.0 [7]

The HBase mailing lists and archives are listed here [8].

1. http://hbase.apache.org
2. http://labs.google.com/papers/bigtable.html
3. http://hadoop.apache.org
4. http://www.apache.org/dyn/closer.cgi/hbase/
5. http://hbase.apache.org/docs/current/source-repository.html
6. http://hbase.apache.org/docs/current/issue-tracking.html
7. http://hbase.apache.org/docs/current/license.html
8. http://hbase.apache.org/docs/current/mail-lists.html


%***************** HBASE version with QoD (quality-of-data) *****************%
[travis-status](https://travis-ci.org/algarecu/hbase-0.94.8-qod.svg?branch=master)
## Description:

This is a HBase version with consistency guarantees instrumented within the
replication mechanisms of the stable release of HBase 0.94.8.

The Consistency guarantees consist in the following. For each column-family or
defined data-container is possible to build a storage priority-queue based on a
QoD (quality-of-data)  three-dimensional vector model K (θ, σ, ν).

When using the code please refer to the full conference paper,"Quality-of-Data
for Consistency Levels in Geo-replicated Cloud Data Stores" Á. García-Recuero,
S. Esteves, L. Veiga. IEEE CloudCom 2013, December, Bristol, UK.

P.S. Please note the code is not always properly annotated/commented and the
programming style might not follow the Apache Foundation and/or HBase community
guidelines at all times. Use at your own discretion and feel free to contact me
in order to propose any further contributions/enhancements to the model.

## Acknowledgements:

This work might be applicable to Apache issue 1734 and further work on Storage
Consistency Guarantees for cloud data-stores
(https://issues.apache.org/jira/browse/HBASE-1734).
Thanks to L. Hofhansl for sharing insight knowledge and direction through my
initial questions about the architecture of HBase.

## Contact:

https://www.researchgate.net/profile/Alvaro_Garcia-Recuero/