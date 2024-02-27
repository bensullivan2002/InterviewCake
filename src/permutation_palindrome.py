def contains_palindrome(string):
    if len(string) == 0:
        return False
    if len(string) == 1:
        return True

    char_count = dict()
    for char in string:
        if char in char_count:
            if char_count[char] == 1:
                char_count[char] = 0
            else:
                char_count[char] = 1
        else:
            char_count[char] = 1
    return sum(char_count.values()) <= 1
