package org.apache.hupa.shared.algorithms;


import tc3.shared.InstrumentationLoggerProvider;

/**
 * A utility to decode and encode byte arrays as Strings, using only "safe"
 * characters.
 */
public class B64 {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8ea98774d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c89673c822");
	}
	

	public B64(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8");
	}
	
	/**
     * An array mapping size but values to the characters that will be used to
     * represent them. Note that this is not identical to the set of characters
     * used by MIME-Base64.
     */
    private static final char[] base64Chars = new char[] { 'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
            '4', '5', '6', '7', '8', '9', '$', '_' };

    /**
     * An array mapping legal base 64 characters [a-zA-Z0-9$_] to their
     * associated 6-bit values. The source indices will be given by 7-bit ASCII
     * characters, thus the array size needs to be 128 (actually 123 would
     * suffice for the given set of characters in use).
     */
    private static final byte[] base64Values = new byte[128];

    /**
     * Initialize the base 64 encoder values.
     */
    static {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c895996190");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x2_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x00x0");
		// Invert the mapping (i -> base64Chars[i])
        for (int i = 0; i < base64Chars.length; i++) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x30x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x30x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x30x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8959961900x10x00x30x0");
			base64Values[base64Chars[i]] = (byte) i;
        }
    }

    /**
     * Decode a base64 string into a byte array.
     *
     * @param data
     *            the encoded data.
     * @return a byte array.
     * @see #fromBase64(String)
     */
    public static byte[] fromBase64(String data) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x2_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x3_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x20x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x00x0");
		if (data == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x00x10x0");
			return null;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x10x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x10x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x10x0");
		int len = data.length();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x20x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x20x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x20x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x2");
		assert (len % 4) == 0;

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x3");
		if (len == 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x30x10x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x30x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x30x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x30x10x0");
			return new byte[0];
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x4_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x40x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x40x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x40x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x40x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x40x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x40x0");
		char[] chars = new char[len];
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x5_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x50x0");
		data.getChars(0, len, chars, 0);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x60x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x60x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x60x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x60x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x60x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x6");
		int olen = 3 * (len / 4);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x70x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x7");
		if (chars[len - 2] == '=') {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x70x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x70x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x70x10x0");
			--olen;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x8_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x80x0");
		if (chars[len - 1] == '=') {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x80x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x80x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x80x10x0");
			--olen;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x90x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x9_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x90x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x90x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x90x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x90x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40x90x10x00x00x0");
		byte[] bytes = new byte[olen];

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xa0x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xa0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xa");
		int iidx = 0;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xb0x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xb_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xb0x0");
		int oidx = 0;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc");
		while (iidx < len) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x00x1_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x00x0");
			int c0 = base64Values[chars[iidx++] & 0xff];
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x1_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x10x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x10x0");
			int c1 = base64Values[chars[iidx++] & 0xff];
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x2_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x20x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x20x0");
			int c2 = base64Values[chars[iidx++] & 0xff];
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x3_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x30x1");
			int c3 = base64Values[chars[iidx++] & 0xff];
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x10x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x4_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x10x00x20x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x10x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x40x10x00x2");
			int c24 = (c0 << 18) | (c1 << 12) | (c2 << 6) | c3;

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x50x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x50x00x10x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x50x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x5_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x50x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x50x00x10x10x0");
			bytes[oidx++] = (byte) (c24 >> 16);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x60x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x6");
			if (oidx == olen) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x60x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x60x10x0");
				break;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x70x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x70x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x70x00x10x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x70x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x70x00x10x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x7");
			bytes[oidx++] = (byte) (c24 >> 8);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x80x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x8");
			if (oidx == olen) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x80x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x80x10x0");
				break;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x90x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x90x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x90x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xc0x10x9");
			bytes[oidx++] = (byte) c24;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c83cfd802a0x40xd");
		return bytes;
    }

    /**
     * Decode a base64 string into a long value.
     */
    public static long longFromBase64(String value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x4_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x2_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x00x0");
		int pos = 0;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x10x0_____org_apache_hupa_shared_algorithms_B64_java0x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x10x1_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x1");
		long longVal = base64Values[value.charAt(pos++)];
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x20x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x20x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x20x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x2");
		int len = value.length();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x3");
		while (pos < len) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x30x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x30x10x00x0");
			longVal <<= 6;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x30x10x10x0_____org_apache_hupa_shared_algorithms_B64_java0x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x30x10x1_____org_apache_hupa_shared_algorithms_B64_java0x0");
			longVal |= base64Values[value.charAt(pos++)];
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8c204aa0f0x40x4");
		return longVal;
    }

    /**
     * Converts a byte array into a base 64 encoded string. Null is encoded as
     * null, and an empty array is encoded as an empty string. Otherwise, the
     * byte data is read 3 bytes at a time, with bytes off the end of the array
     * padded with zeros. Each 24-bit chunk is encoded as 4 characters from the
     * sequence [A-Za-z0-9$_]. If one of the source positions consists entirely
     * of padding zeros, an '=' character is used instead.
     *
     * @param data
     *            a byte array, which may be null or empty
     * @return a String
     */
    public static String toBase64(byte[] data) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x30x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x4_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x2_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x00x0");
		if (data == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x00x10x0");
			return null;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x10x1");
		int len = data.length;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x2_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x20x0");
		if (len == 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x20x10x0");
			return "";
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x30x10x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x3_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x30x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x30x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x30x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x30x10x00x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x30x1");
		int olen = 4 * ((len + 2) / 3);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x4_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x40x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x40x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x40x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x40x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x40x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x40x00x0");
		char[] chars = new char[olen];

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x5_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x50x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x50x1");
		int iidx = 0;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x60x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x60x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x6");
		int oidx = 0;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x70x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x70x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x7");
		int charsLeft = len;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x8_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x0");
		while (charsLeft > 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x0");
			int b0 = data[iidx++] & 0xff;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x10x10x0");
			if(!((charsLeft > 1)))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x10x10x00x2");
			if((charsLeft > 1))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x10x10x00x1");
			int b1 = (charsLeft > 1) ? data[iidx++] & 0xff : 0;
            if(!((charsLeft > 2)))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x20x10x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x20x10x0");
			if((charsLeft > 2))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x20x10x00x1");
			int b2 = (charsLeft > 2) ? data[iidx++] & 0xff : 0;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x30x10x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x30x10x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x30x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x30x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x3_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x30x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x30x1");
			int b24 = (b0 << 16) | (b1 << 8) | b2;

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x40x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x4_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x40x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x40x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x40x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x40x0");
			int c0 = (b24 >> 18) & 0x3f;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x50x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x50x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x50x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x50x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x50x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x5");
			int c1 = (b24 >> 12) & 0x3f;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x60x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x60x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x60x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x6_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x60x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x60x0");
			int c2 = (b24 >> 6) & 0x3f;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x70x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x70x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x70x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x7");
			int c3 = b24 & 0x3f;

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x80x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x8");
			chars[oidx++] = base64Chars[c0];
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x9_____org_apache_hupa_shared_algorithms_B64_java0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10x90x0");
			chars[oidx++] = base64Chars[c1];
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10xa0x00x1");
			if((charsLeft > 1))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10xa0x00x10x1");
			if(!((charsLeft > 1)))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10xa0x00x10x2");
			chars[oidx++] = (charsLeft > 1) ? base64Chars[c2] : '=';
            if((charsLeft > 2))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10xb0x00x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10xb0x00x1");
			if(!((charsLeft > 2)))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10xb0x00x10x2");
			chars[oidx++] = (charsLeft > 2) ? base64Chars[c3] : '=';

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10xc0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x80x10xc");
			charsLeft -= 3;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x9_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x90x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8405da7c50x40x90x00x0");
		return new String(chars);
    }

    /**
     * Return a string containing a base-64 encoded version of the given long
     * value. Leading groups of all zero bits are omitted.
     */
    public static String toBase64(long value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x3_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x4_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x2_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a39");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x00x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x00x10x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x00x10x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x0");
		// Convert to ints early to avoid need for long ops
        int low = (int) (value & 0xffffffff);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x10x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x10x10x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x10x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x10x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x10x10x00x1");
		int high = (int) (value >> 32);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x20x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x20x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x20x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x2_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x20x0");
		StringBuilder sb = new StringBuilder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x30x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x30x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x30x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x30x10x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x30x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x3");
		boolean haveNonZero = base64Append(sb, (high >> 28) & 0xf, false);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x40x00x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x40x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x40x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x40x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x40x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x4");
		haveNonZero = base64Append(sb, (high >> 22) & 0x3f, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x50x00x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x50x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x50x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x5_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x50x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x50x00x00x0");
		haveNonZero = base64Append(sb, (high >> 16) & 0x3f, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x60x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x6_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x60x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x60x00x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x60x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x60x00x0");
		haveNonZero = base64Append(sb, (high >> 10) & 0x3f, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x70x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x70x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x70x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x70x00x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x7_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x70x0");
		haveNonZero = base64Append(sb, (high >> 4) & 0x3f, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x00x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x00x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x00x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x00x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x8_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x00x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x80x10x00x0");
		int v = ((high & 0xf) << 2) | ((low >> 30) & 0x3);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x90x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x9_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40x90x0");
		haveNonZero = base64Append(sb, v, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xa0x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xa_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xa0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xa0x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xa0x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xa0x00x00x00x00x0");
		haveNonZero = base64Append(sb, (low >> 24) & 0x3f, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xb0x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xb0x00x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xb0x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xb0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xb_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xb0x00x00x0");
		haveNonZero = base64Append(sb, (low >> 18) & 0x3f, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xc0x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xc0x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xc0x00x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xc0x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xc0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xc");
		haveNonZero = base64Append(sb, (low >> 12) & 0x3f, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xd0x00x00x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xd_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xd0x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xd0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xd0x00x00x0");
		base64Append(sb, (low >> 6) & 0x3f, haveNonZero);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xe_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xe0x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xe0x0");
		base64Append(sb, low & 0x3f, true);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xf0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c8a1ee2a390x40xf");
		return sb.toString();
    }

    private static boolean base64Append(StringBuilder sb, int digit,
            boolean haveNonZero) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x30x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x40x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x3_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x1_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x4_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x50x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x6_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x5");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x00x0");
		if (digit > 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x00x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x00x10x0");
			haveNonZero = true;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x1");
		if (haveNonZero) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x10x00x0_____org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x10x00x00x0");
			sb.append(base64Chars[digit]);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_algorithms_B64_java0x09c3a83c81dc4cf5a0x60x2");
		return haveNonZero;
    }
}
