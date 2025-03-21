Worked on Intellij workspace for this assessment

1. Creative Problem Solving: "Fan Event Scheduler"
-------------------------------------------------
    >> Solution provided in the package question1
    >> components involved in the solution FanEventSchedulerService and Slots
    >> custom slotInterval initialized with value 15 mins. This can be configurable for any value.
    >> Checking the initial condition for slot eligibility by comparing the difference of start,End time is
                bigger than the event duration. If yes it would process further. otherwise moves to next slot in the list.

2. Based on the index formulas created functions to handle addTicket and getNextTicket.
    The parent node is stored at index i.
    The left child is at 2 * i + 1.
    The right child is at 2 * i + 2.

    For AddTicket // Moves the newly added element up to maintain the heap property
    newly added element and compare with parent interchange  based on priority

    getNextTicket():  Return the highest priority and then remove it.


3. Code Refactoring: "Ticket Price Calculator Cleanup"
------------------------------------------------------
    >> Solution provided in the package question3
    >> updated method name based on the purpose
    >> Included Null and empty checks to ensure there are no run time errors.
    >> Use enhanced for loop for eliminating redundant code
    >> Introduced utility methods to convert object to int/ double.


 4. Language Fluency: "Stadium Seat Allocator"
 ----------------------------------------------
    >> Solution provided in the package question4
    >> filter --> filters only if avalableseats greater than or equal to requested seats, then get sectionId's
    >>  findFirst satisfying section Id
    >> if filter condition not matches any section return null.



