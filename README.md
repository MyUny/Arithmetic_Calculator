# Programming Challenge: Arithmetic Expression Calculator

Write a `Calculator` class that can evaluate a string containing a valid arithmetic expression and return the result of the evaluation. The calculator should support the four basic operators (`+`, `-`, `*`, `/`) and parentheses. Make sure to handle operator precedence properly (i.e., the order in which operations should be performed).

For example, if your method is called with the string `"7 + (6 * 5 - 4) / 3"`, your method should return `15.6667`.

Here are the detailed requirements:

1. The calculator should support the operators `+`, `-`, `*`, and `/`, with their usual precedence. The `*` and `/` operators have higher precedence than `+` and `-`. For example, in the expression `"2 + 3 * 4"`, you should perform the multiplication before the addition, yielding a result of `14`.

2. The calculator should support the use of parentheses to change operator precedence. For example, in the expression `"2 * (3 + 4)"`, you should perform the addition before the multiplication, yielding a result of `14`.

3. The calculator should ignore any whitespace in the input.

4. If the input is invalid (e.g., it has unbalanced parentheses or contains characters that are not numbers, operators, or parentheses), the calculator should throw an exception.

5. You do not need to worry about division by zero. You can assume that you will not be provided with any input that results in division by zero.

You are expected to solve it using your programming skills and knowledge of data structures like stacks.