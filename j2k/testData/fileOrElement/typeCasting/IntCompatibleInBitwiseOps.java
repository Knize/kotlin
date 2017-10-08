public class TestIntCompatibleInBitwiseOps {
    public int testByte(byte b) {
        return b & 0x0F | 0xF0;
    }

    public int testShort(short s) {
        return s & 0x0F | 0xF0;
    }

    public int testInt(int i) {
        return i & 0x0F | 0xF0;
    }
}