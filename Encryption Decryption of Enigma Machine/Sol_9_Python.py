from time import sleep
import random
import sys

def fc(ceasar_shift, message):
    ret = []
    for c in message:
        ret.append(chr((ord(c) - ord('A') + ceasar_shift) % 26 + ord('A')))
        ceasar_shift = (ceasar_shift + 1) % 26
    return ''.join(ret)
def rc(ceasar_shift, message):
    ceasar_shift = (ceasar_shift + len(message) - 1) % 26
    ret = []
    for c in reversed(message):
        ret.append(chr((ord(c) - ord('A') - ceasar_shift) % 26 + ord('A')))
        ceasar_shift = (ceasar_shift - 1) % 26
    return ''.join(reversed(ret))
def fr(rotor, message):
    return ''.join(rotor[ord(c) - ord('A')] for c in message)
def rr(rotor, message):
    reverse_map = {c: i for i, c in enumerate(rotor)}
    return ''.join(chr(reverse_map[c] + ord('A')) for c in message)
def e(ceasar_shift, rotors, message):
    message = fc(ceasar_shift, message)
    for rotor in rotors:
        message = fr(rotor, message)
    return message
def d(ceasar_shift, rotors, message):
    for rotor in reversed(rotors):
        message = rr(rotor, message)
    message = rc(ceasar_shift, message)
    return message
def sol():
    operation = input()
    ceasar_shift = int(input())
    rotors = [input() for _ in range(3)]
    message = input()
    if operation == 'ENCODE':
        print(e(ceasar_shift, rotors, message))
    else:
        print(d(ceasar_shift, rotors, message))


if __name__ == '__main__':
    sol()