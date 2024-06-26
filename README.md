# CK as a task of Commits Miner

Fork from mauricioaniche/ck to work as java task on https://github.com/mateusfreira/commits-miner

### How to add it as a task on commits minner?
* Clone the Repository
```bath
git clone git@github.com:mateusfreira/ck.git
```

* Add the next task on Commits miner Configuration
```bash
{DIR-WHERE-YOU_CLONED_CK}/run.sh:metrics
```
<img width="1436" alt="screen shot 2018-01-22 at 09 17 04" src="https://user-images.githubusercontent.com/234049/35218875-63638d98-ff57-11e7-976a-9aac21dc839c.png">

* Save and good findings o/

# What is Commits miner?
    Commits miner is a tool to process and extract useful information from commits history in git repositories. (Check: https://github.com/mateusfreira/commits-miner)
# What is CK? 

This small projects calculates code metrics in Java projects by means
of static analysis (i.e. no need for compiled code). Currently, it contains
a large set of metrics, including the famous CK metrics:

- *CBO (Coupling between objects)*: Counts the number of dependencies a class has.
The tools checks for any type used in the entire class (field declaration, method
return types, variable declarations, etc). It ignores dependencies to Java itself
(e.g. java.lang.String).

- *DIT (Depth Inheritance Tree)*: It counts the number of "fathers" a class has.
All classes have DIT at least 1 (everyone inherits java.lang.Object).
In order to make it happen, classes must exist in the project (i.e. if a class
depends upon X which relies in a jar/dependency file, and X depends upon other
classes, DIT is counted as 2). 

- *NOC (Number of Children)*: Counts the number of children a class has.

- *NOF (Number of fields)*: Counts the number of fields in a class, no matter
its modifiers.

- *NOPF (Number of public fields)*: Counts only the public fields.

- *NOSF*: Counts only the static fields.

- *NOM (Number of methods)*: Counts the number of methods, no matter its
modifiers.

- *NOPM (Number of public methods)*: Counts only the public methods.

- *NOSM (Number of static methods):* Counts only the static methods.

- *NOSI (Number of static invocations)*: Counts the number of invocations
to static methods. It can only count the ones that can be resolved by the
JDT.


- *RFC (Response for a Class)*: Counts the number of unique method
invocations in a class. As invocations are resolved via static analysis,
this implementation fails when a method has overloads with same number of parameters,
but different types.

- *WMC (Weight Method Class)* or *McCabe's complexity*. It counts the number
of branch instructions in a class.

- *LOC (Lines of code)*: It counts the lines of count, ignoring
empty lines.

- *LCOM (Lack of Cohesion of Methods)*: Calculates LCOM metric. This is the very first
version of metric, which is not reliable. LCOM-HS can be better (hopefully, you will
send us a pull request). 

You can read more about CK metrics: http://www.aivosto.com/project/help/pm-oo-ck.html.

# How to Contribute

```
git clone https://github.com/mauricioaniche/ck.git
```

Then, you can:

* compile : `mvn clean compile`
* test    : `mvn test`
* eclipse : `mvn eclipse:eclipse`


# License

This software is licensed under the Apache 2.0 License.

# Improviments documentation

link: https://docs.google.com/document/d/1Ky5En4GBChbPUJn0yFoChNThuiwtBCWLgsDx_MCMsp0/edit#heading=h.uhgzlclhh37e
