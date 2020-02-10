package pomodoro.model;

public enum AttemptKind {
  FOCUS(3, "Focus time"),
  BREAK(5 * 60, "Break time");

  private int mTotalSeconds;
  private String mDisplayName;

  AttemptKind(int totalSeconds, String displayName) {
    this.mTotalSeconds = totalSeconds;
    this.mDisplayName = displayName;
  }

  public int getTotalSeconds() {
    return mTotalSeconds;
  }

  public String getDisplayName() {
    return mDisplayName;
  }
}
