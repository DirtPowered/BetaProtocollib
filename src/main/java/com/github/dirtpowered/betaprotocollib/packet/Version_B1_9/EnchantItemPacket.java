/*
 * Copyright (c) 2020 Dirt Powered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data.V1_9EnchantItemPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.IOException;

public class EnchantItemPacket extends AbstractPacket<V1_9EnchantItemPacketData> {

    public EnchantItemPacket() {
        super(0x6C);
    }

    @Override
    public ByteBuf writePacketData(V1_9EnchantItemPacketData packet) throws IOException {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getTransaction());
        buffer.writeByte(packet.getEnchantmentId());
        return buffer;
    }

    @Override
    public V1_9EnchantItemPacketData readPacketData(ByteBuf buffer) throws IOException {
        int transaction = buffer.readByte();
        int enchantmentId = buffer.readByte();
        return new V1_9EnchantItemPacketData(transaction, enchantmentId);
    }
}
