/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No9;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        QueueProducer producer = new QueueProducer(queue);
        QueueConsumer consumer = new QueueConsumer(queue);
        producer.start();
        consumer.start();
    }
}
