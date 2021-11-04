# 递归实现
def is_reverse(string, left, right):
    if left == right or left + 1 == right:
        return True
    else:
        if string[left] == string[right]:
            return is_reverse(string, left + 1, right - 1)
        else:
            return False


def main():
    string = input("请输入一串字符：")
    print(is_reverse(string, 0, len(string) - 1))


if __name__ == '__main__':
    main()
# 使用stack结构来实现
def is_reverse(strings):
    flag = True
    stack = [char for char in strings]
    for k in strings:
        if k == stack.pop():
            continue
        else:
            flag = False
    if flag:
        return True
    return False


def main():
    string = input("请输入一串字符：")
    print(is_reverse(string))


if __name__ == '__main__':
    main()
