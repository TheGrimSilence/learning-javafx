package pomodoro.model;

public class Attempt {
  private String mMessage;
  private int mRemainingSeconds;
  private AttemptKind mKind;

  public Attempt(AttemptKind kind, String message) {
    this.mKind = kind;
    this.mMessage = message;
    this.mRemainingSeconds = kind.getTotalSeconds();
  }

  public AttemptKind getKind() {
    return mKind;
  }

  public String getMessage() {
    return mMessage;
  }

  public int getRemainingSeconds() {
    return mRemainingSeconds;
  }

  public void setMessage(String mMessage) {
    this.mMessage = mMessage;
  }

  public void tick() {
    mRemainingSeconds--;
  }

  @Override
  public String toString() {
    return "Attempt{" +
        ", mKind=" + mKind +
        "mMessage='" + mMessage + '\'' +
        ", mRemainingSeconds=" + mRemainingSeconds +
        '}';
  }

  public void save() {
    System.out.printf("SAVING: %s %n",this);
  }
}