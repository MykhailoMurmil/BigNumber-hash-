import number.BigNumber;
import org.junit.jupiter.api.*;


public class TestBigNumber {
    BigNumber bigNumber;
    BigNumber bigNumberHex1 = new BigNumber("51bf608414ad5726a3c1bec098f77b1b54ffb2787f8d528a74c1d7fde6470ea4");
    BigNumber bigNumberHex2 = new BigNumber("403db8ad88a3932a0b7e8189aed9eeffb8121dfac05c3512fdb396dd73f6331c");
    BigNumber bigNumberHex3 = new BigNumber("36f028580bb02cc8272a9a020f4200e346e276ae664e45ee80745574e2f5ab80");
    BigNumber bigNumberHex4 = new BigNumber("70983d692f648185febe6d6fa607630ae68649f7e6fc45b94680096c06e4fadb");
    BigNumber bigNumberHex5 = new BigNumber("33ced2c76b26cae94e162c4c0d2c0ff7c13094b0185a3c122e732d5ba77efebc");
    BigNumber bigNumberHex6 = new BigNumber("22e962951cb6cd2ce279ab0e2095825c141d48ef3ca9dabf253e38760b57fe03");

    @Test
    @DisplayName("Test for XOR")
    public void testXor() {
        BigNumber resultTestXor = bigNumberHex1.bitwiseXor(bigNumberHex2);
        Assertions.assertEquals("1182d8299c0ec40ca8bf3f49362e95e4ecedaf82bfd167988972412095b13db8", resultTestXor.getHex());
    }

    @Test
    @DisplayName("Test for ADD")
    public void testAdd() {
        BigNumber resultTestAdd = bigNumberHex3.add(bigNumberHex4);
        Assertions.assertEquals("a78865c13b14ae4e25e90771b54963ee2d68c0a64d4a8ba7c6f45ee0e9daa65b", resultTestAdd.getHex());
    }

    @Test
    @DisplayName("Test for SUB")
    public void testSub() {
        BigNumber resultTestSub = bigNumberHex5.sub(bigNumberHex6);
        Assertions.assertEquals("10e570324e6ffdbc6b9c813dec968d9bad134bc0dbb061530934f4e59c2700b9", resultTestSub.getHex());
    }


}


