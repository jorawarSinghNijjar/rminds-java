package com.lambda;

public interface Login<U,P> {
	void apply(U username, P password);
}
