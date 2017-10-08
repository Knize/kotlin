class TestIntCompatibleInBitwiseOps {
    fun testByte(b: Byte): Int {
        return (b and 0x0F or (0xF0).toByte()).toInt()
    }

    fun testShort(s: Short): Int {
        return (s and 0x0F or 0xF0).toInt()
    }

    fun testInt(i: Int): Int {
        return i and 0x0F or 0xF0
    }
}