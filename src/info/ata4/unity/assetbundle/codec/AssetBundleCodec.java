/*
 ** 2014 July 01
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.unity.assetbundle.codec;

import info.ata4.io.socket.IOSocket;
import java.io.IOException;

/**
 * Inteface for asset bundle codecs.
 * 
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public interface AssetBundleCodec {

    public String getName();

    public boolean isEncoded(IOSocket socket) throws IOException;

    public void encode(IOSocket socket) throws IOException;

    public void decode(IOSocket socket) throws IOException;
}
