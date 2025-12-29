package com.yedam.java.package3;

public class MaxScore {
	private int idx = -1;
	private int score = 0;
	
	public MaxScore() {}
	public MaxScore(int idx, int score) {
		this.idx = idx;
		this.score = score;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
