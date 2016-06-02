Branches:
master - the original JGAP implementation for the position paper SASS: 
	Self-Adaptation using Stochastic Search.  This implementation only 
	supports single objective search.
convert_to_ecj - first implementation of the planner in ECJ for single objective
	search.  This planner is bare bones, meaning that it doesn't have all 
	the features of the JGAP implementation.
multi_objective_ecj - first implementation of the planner in ECJ for 
	multi-objective search.  This planner is also bare bones, meaning that
	it doesn't have all the features of the JGAP implementation.
omnetSystemEvaluation- This was the latest branch I was using to implement 
	the system in a way that it could be used to compare to the PRISM MDP 
	planner for the Omnet System.  This branch contains the PRISM MDP planner 
	and works for simple case. However, the current implementation has memory 
	issues when the plan gets larger than low double digit actions.  The 
	planner currently copies the state for every branch when a branch is 
	encountered, causing the plan to run out of memory in many cases.  The next 
	step for this planner would be to convert it to a depth first search 
	evaluation that explores each path and then backracks to the last 
	unexplored branch.

Test by JW

Instructions to run the latest version of the selfadaptive system genetic 
algorithm planner:
1. Install Gradle on your machine
2. git checkout omnetSystemEvaluation
3. cd ECJImplementation/ECJImplementationProject
4. gradle runSingleOptimization

Sample Output:

ECJ will create the output file out.stat and print out
 
Starting a new Gradle Daemon for this build (subsequent builds will be faster).
:compileJava UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
:runSingleOptimization
| ECJ
| An evolutionary computation system (version 23)
| By Sean Luke
| Contributors: L. Panait, G. Balan, S. Paus, Z. Skolicki, R. Kicinger,
|               E. Popovici, K. Sullivan, J. Harrison, J. Bassett, R. Hubley,
|               A. Desai, A. Chircop, J. Compton, W. Haddon, S. Donnelly,
|               B. Jamil, J. Zelibor, E. Kangas, F. Abidi, H. Mooers,
|               J. O'Beirne, L. Manzoni, K. Talukder, and J. McDermott
| URL: http://cs.gmu.edu/~eclab/projects/ecj/
| Mail: ecj-help@cs.gmu.edu
|       (better: join ECJ-INTEREST at URL above)
| Date: June 15, 2015
| Current Java: 1.7.0_101 / OpenJDK 64-Bit Server VM-24.95-b01
| Required Minimum Java: 1.5


Threads:  breed/1 eval/1
Seed: 55838494 
Job: 0
Setting up
Processing GP Types
Processing GP Node Constraints
Processing GP Function Sets
Processing GP Tree Constraints
Initializing Generation 0

worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.80560
Average Invalid Actions: 0.38000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 1
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09005
Average Invalid Actions: 0.09000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 2
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.02504
Average Invalid Actions: 0.02000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 3
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.11226
Average Invalid Actions: 0.10000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 4
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.23448
Average Invalid Actions: 0.19000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 5
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.12226
Average Invalid Actions: 0.09000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 6
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.20670
Average Invalid Actions: 0.16000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 7
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.07226
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 8
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 9
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.14170
Average Invalid Actions: 0.09000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 10
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.19948
Average Invalid Actions: 0.18000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 11
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04004
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 12
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09448
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 13
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09170
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 14
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09170
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 15
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.13448
Average Invalid Actions: 0.11000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 16
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.14170
Average Invalid Actions: 0.09000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 17
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.06504
Average Invalid Actions: 0.07000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 18
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.16392
Average Invalid Actions: 0.10000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 19
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04448
Average Invalid Actions: 0.02000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 20
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.14170
Average Invalid Actions: 0.09000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 21
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.13893
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 22
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.00004
Average Invalid Actions: 0.00000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 23
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04448
Average Invalid Actions: 0.01000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 24
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 25
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.07226
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 26
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.08726
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 27
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09448
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 28
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09448
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 29
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.27726
Average Invalid Actions: 0.29000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 30
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.07226
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 31
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.14448
Average Invalid Actions: 0.12000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 32
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.06948
Average Invalid Actions: 0.04000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 33
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.26449
Average Invalid Actions: 0.22000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 34
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.10083
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 35
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.02504
Average Invalid Actions: 0.02000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 36
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.11226
Average Invalid Actions: 0.10000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 37
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.14948
Average Invalid Actions: 0.14000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 38
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.13448
Average Invalid Actions: 0.11000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 39
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.06948
Average Invalid Actions: 0.04000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 40
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.30837
Average Invalid Actions: 0.20000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 41
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.06504
Average Invalid Actions: 0.07000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 42
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.00004
Average Invalid Actions: 0.00000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 43
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.18892
Average Invalid Actions: 0.11000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 44
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09448
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 45
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09170
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 46
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 47
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.10948
Average Invalid Actions: 0.09000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 48
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.11948
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 49
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.06948
Average Invalid Actions: 0.04000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 50
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.21114
Average Invalid Actions: 0.13000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 51
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.00004
Average Invalid Actions: 0.00000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 52
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.00004
Average Invalid Actions: 0.00000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 53
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.07504
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 54
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.02504
Average Invalid Actions: 0.02000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 55
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.02504
Average Invalid Actions: 0.02000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 56
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09726
Average Invalid Actions: 0.07000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 57
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09448
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 58
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04004
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 59
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.14448
Average Invalid Actions: 0.10000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 60
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04004
Average Invalid Actions: 0.05000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 61
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 62
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 63
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.00004
Average Invalid Actions: 0.00000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 64
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.18170
Average Invalid Actions: 0.16000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 65
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.11226
Average Invalid Actions: 0.10000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 66
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.15948
Average Invalid Actions: 0.13000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 67
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.20671
Average Invalid Actions: 0.16000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 68
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.23059
Average Invalid Actions: 0.13000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 69
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.13893
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 70
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 71
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.13170
Average Invalid Actions: 0.10000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 72
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09449
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 73
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 74
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.00004
Average Invalid Actions: 0.00000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 75
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09448
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 76
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.14448
Average Invalid Actions: 0.10000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 77
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09725
Average Invalid Actions: 0.07000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 78
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.16670
Average Invalid Actions: 0.11000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 79
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.08726
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 80
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.05003
Average Invalid Actions: 0.04000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 81
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.02000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 82
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.24171
Average Invalid Actions: 0.21000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 83
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09726
Average Invalid Actions: 0.07000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 84
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.25115
Average Invalid Actions: 0.18000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 85
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.00004
Average Invalid Actions: 0.00000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 86
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.29837
Average Invalid Actions: 0.23000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 87
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 88
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.06948
Average Invalid Actions: 0.04000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 89
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.11948
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 90
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.05004
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 91
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09726
Average Invalid Actions: 0.09000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 92
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.23893
Average Invalid Actions: 0.18000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 93
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.13448
Average Invalid Actions: 0.11000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 94
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.09448
Average Invalid Actions: 0.06000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 95
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.08726
Average Invalid Actions: 0.08000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 96
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.20670
Average Invalid Actions: 0.16000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 97
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.16392
Average Invalid Actions: 0.09000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 98
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04726
Average Invalid Actions: 0.03000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Generation 99
worst score possible: 20.00000000000001
do generation: true
Average Fitness: 0.04448
Average Invalid Actions: 0.02000
Subpop 0 best fitness of generation Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0
Subpop 0 best fitness of run: Fitness: Standardized=2.5279136746921332E-5 Adjusted=0.9999747215022716 Hits=0

BUILD SUCCESSFUL

Total time: 24.957 secs
