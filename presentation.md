






# TDD

	- Kent Beck (XP), Uncle Bob (Rober C Martin)

	- Test      <---\       Red
	- Code          |      Green, Commit
	- Refactor   ---/      Green, Commit





































# Rules by Uncle Bob

	1. You are not allowed to write any more of a unit test
	   that is sufficient to fail,
	   and compilation failures are failures

	2. You are not allowed to write any production code
	   unless it is to make a failing unit test pass.

	3. You are not allowed to write any more production code
	   that is sufficient to pass the one failing the unit test.

	( "not allowed to write any more production code..." 
	  === "not allowed to add functionality of production code..."
	  Refactoring doesn't add functionality. )





































# Detour via refactoring

	- Improve code without changing the results
		- no bugfix
		- no new feature
		- no new test

	- Remove unnecessary code
	| Remove unnecessary complexity
	| Remove duplication (e.g. extract method)
	| Make the code easier to read (e.g. rename)
	| Increase cohesion
	| Decrease coupling

	- It should be a tiny change that we do every 5 minutes,
	  not a project that you will plan to do next week.
	  (If it's a project then do it in tiny steps anyway.)





































# Rules by Kent Beck

	1. Don’t write a line of new code
	   unless you first have a failing automated test.

	2. Eliminate duplication.
	   
	   (=== Refactor or generalize code. No new functionality!)





































# Example






































# Observations
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.

	- Refactoring doesn't add new functionality.

	- Adding functionality and refactoring is separate.

	- Code works after each iteration.

	- By choosing what to test next you choose how big change you
	  will implement.

	- Tests should start with easiest cases and get more complex.

	- Production code starts hardcoded and becomes more general over time.






































# But but! That's crazy!

	- Yes

	- Try it as an excercise
	    Pair!
	  	One tests,
	  	the other implements,
	  	both refactor.

	- Then use the good parts behind TDD...






































# Tests

	- Not necessarily test first then code

	- Good if you...
		- need as few bugs as possible
		- will maintain the code
		- need to make feedback loop faster

	- If it's hard to refactor because of tests, you don't have good tests.
	  (Reach out for help, this is hard.)



































# Fast feedback loop

	- Supports learning, be in zone, fun

	- Tests / just run and see (art, game of life...).

	- If you need to do 5 manual steps to reproduce an issue,
	  it will be painful.






































# Small increments

	- It works after each step, it stays working

	- Hard to come up with them (see Intentional change below)

	- Good if...
		- the project is not tiny
		  (not possible to keep the whole codebase in mind)
		- you want record of reasoning process (code review)
		- minimize negative impact





































# Intentional change

	- Separate new functionality x refactoring x experiment

	- Refactor after each step.
	  (Reminder Should be small and often.)

	- When you don't know, experiment.
	  When done, rollback the change and continue (in small steps)



































