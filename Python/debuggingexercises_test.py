from debuggingexercises import is_prime

def test_is_prime():
    assert is_prime(5) == True
    assert is_prime(9) == False
    assert is_prime(2) == True
    assert is_prime(3) == True
