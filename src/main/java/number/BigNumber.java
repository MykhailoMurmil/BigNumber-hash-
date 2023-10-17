package number;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

public class BigNumber {
    private BigInteger value;

    public BigNumber() {
    }

    public BigNumber(String hexValue) {
        this.value = new BigInteger(hexValue, 16);
    }


    public void setHex(String hexValue) {
        this.value = new BigInteger(hexValue, 16);
    }


    public String getHex() {
        return this.value.toString(16);
    }


    public BigNumber bitwiseAnd(BigNumber other) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.and(other.value);
        return result;
    }


    public BigNumber bitwiseOr(BigNumber other) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.or(other.value);
        return result;
    }

    public BigNumber bitwiseXor(BigNumber other) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.xor(other.value);
        return result;
    }


    public BigNumber bitwiseInv(BigNumber other) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.modInverse(other.value.not());
        return result;
    }


    public BigNumber add(BigNumber other) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.add(other.value);
        return result;
    }

    public BigNumber shiftR(int amount) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.shiftRight(amount);
        return result;
    }

    public BigNumber shiftL(int amount) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.shiftLeft(amount);
        return result;
    }


    public BigNumber sub(BigNumber other) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.subtract(other.value);
        return result;
    }

    public BigNumber mod(BigNumber other) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.mod(other.value);
        return result;
    }

    public BigNumber mul(BigNumber other) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.multiply(other.value);
        return result;
    }

    public BigNumber div(BigNumber other) {
        BigNumber result = new BigNumber("0");
        try {
            result.value = this.value.divide(other.value);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return result;
    }

    public BigNumber mod(BigNumber exponent, BigNumber modulus) {
        BigNumber result = new BigNumber("0");
        result.value = this.value.modPow(exponent.value, modulus.value);
        return result;
    }
}