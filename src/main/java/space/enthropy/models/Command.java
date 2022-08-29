package space.enthropy.models;

public enum Command {
    UNKNOWN("Я не понимаю Ваш запрос"),
    UNKNOWN_TTS("Я не поним+аю В+аш запр+ос");

    private String text;

    Command(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @SuppressWarnings("all")
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
