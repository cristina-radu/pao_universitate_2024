package enums;

public enum MenuEnum {
    ONE(1, "Display books", "Show book details"),
    TWO(2, "User account", "Show user details"),
    THREE(3, "Exit", "Go to previous menu");

    private Integer key;
    private String title;
    private String description;

    MenuEnum(Integer key, String title, String description) {
        this.key = key;
        this.title = title;
        this.description = description;
    }

    public Integer getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static MenuEnum getForKey(Integer key) {
        MenuEnum foundEnum = null;
        for(MenuEnum menuEnum: MenuEnum.values()) {
            if(menuEnum.getKey() == key) {
                foundEnum = menuEnum;
            }
        }
        return foundEnum;
    }

}
