package com.mlomb.freetype;

import com.mlomb.freetype.Utils.Pointer;

public class Size extends Pointer {

	public Size(long pointer) {
		super(pointer);
	}

	public SizeMetrics getMetrics() {
		long sizeMetrics = FreeType.FT_Size_Get_metrics(pointer);
		if (sizeMetrics <= 0)
			return null;
		return new SizeMetrics(sizeMetrics);
	}
}