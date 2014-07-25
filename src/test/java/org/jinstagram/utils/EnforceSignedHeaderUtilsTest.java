package org.jinstagram.utils;

import org.jinstagram.exceptions.InstagramException;
import org.junit.Assert;
import org.junit.Test;

public class EnforceSignedHeaderUtilsTest {

    @Test
    public void testSignature() throws InstagramException {
        String signature1 = EnforceSignedHeaderUtils.signature("6dc1787668c64c939929c17683d7cb74", "200.15.1.1");
        Assert.assertEquals("7e3c45bc34f56fd8e762ee4590a53c8c2bbce27e967a85484712e5faa0191688", signature1);
        String signature2 = EnforceSignedHeaderUtils.signature("6dc1787668c64c939929c17683d7cb74", "200.15.1.1,131.51.1.35");
        Assert.assertEquals("13cb27eee318a5c88f4456bae149d806437fb37ba9f52fac0b1b7d8c234e6cee", signature2);
    }
}
