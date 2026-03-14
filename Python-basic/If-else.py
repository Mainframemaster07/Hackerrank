#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())

    if n % 2 != 0:  # Odd number logic  ex. 1, 3, 5...
        print('Weird')
    elif n % 2 == 0:   # Even number logic ex. 2, 4, 6...
        if 2 <= n <= 5:  # Set Range b/w 2 to 5
            print("Not Weird")
        elif 6 <= n <= 20:  # Set Range b/w 6 to 20
            print("Weird")
        elif n > 20:  # N is grater than 20
            print("Not Weird")
