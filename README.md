# MakeChangeProject

Using Java, Control Flow, and Casting, I've created a usable change calculator.

Lessons Learned:

One of the biggest lessons I learned while making this program is proper casting of using a [double] instead of a [float] to insure values retain accuracy in the distribution of change. During my testing, the pennies place would sometimes be accuate, and other times be inaccurate. By switching the cast to a [double] I was able to maintain number integrity and produce the correct amount of change.

While math was never my strong suit, constructing this program has allowed me to more competently understand the [%] operator and use the remaining values to determine how much change will be left to distribute.

Through a multitude of testing, I learned multiplying the double number by 100 makes distributing change easier than dealing with decimals. I also avoided uncessesary rounding by converting casting this number into an [int] to cut off the remainders that might affect the values when down to the penny amount.


This program will take 2 values from the user; the cost of any item, and the amount produced by a customer intending to purchase said item. It will then assess the remaining amount of change and correctly produce the amounts to distribute from $20 bills all the way down to pennies.

Try it out for yourself!

-Parris
