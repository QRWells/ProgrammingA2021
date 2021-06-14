/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no6;

import java.util.ArrayList;

public class Directory extends File {

    private final ArrayList<File> files;

    public Directory(String name)
    {
        super(name,1);
        files = new ArrayList<>();
    }

    public void add(File file)
    {
        if (files.size() < 10)
        {
            files.add(file);
        }
    }

    public int getSize() {
        int result = size;
        for (File f:files)
        {
            result += f.getSize();
        }
        return result;
    }

    public String getName() {
        return name;
    }
}
