In the terminal run :
1) mvn clean install
2) mvn -Pfitnesse test

Go to the http://localhost/FrontPage.SimpleClassTest
Check the information in the test:

```
!define TEST_SYSTEM {slim}

!path /Users/nyakunina/IdeaProjects/Calculator/target/classes

!| IntegerCalculator |
| firstNumber | secondNumber | add? |
| 3 | 5 | 8	 |
| 9 | 2 | 11 |
| 0 | 0 | 0  |

!| IntegerCalculator |
| firstNumber | secondNumber | subtract? |
| 5 | 3 | 2	 |
| 2 | 0 | 2  |
| 0 | 8 | -8 |

!| IntegerCalculator |
| firstNumber | secondNumber | multiply? |
| 3 | 5 | 15 |
| 9 | 0 | 0  |
| 0 | 0 | 0  |

!| IntegerCalculator |
| firstNumber | secondNumber | divide? |
| 15| 5 | 3	 |
| 9 | 2 | 4  |
| 0 | 1 | 0  |
```
