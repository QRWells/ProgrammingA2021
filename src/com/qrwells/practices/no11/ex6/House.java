/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11.ex6;

import java.util.ArrayList;

public class House {
    private final ArrayList<IName> members = new ArrayList<>();
    private int size = 0;

    public String getInformation() {
        return members
                .stream()
                .map(m -> m.name() + "\n")
                .reduce("", (x, y) -> x + y);
    }

    public void add(IName member) {
        if (size + member.size() > 20) throw new OverCapacityException();
        size += member.size();
        members.add(member);
    }

    public void remove(IName member) {
        if(members.remove(member))
            size -= member.size();
        else
            throw new NoExistException();
    }
}
