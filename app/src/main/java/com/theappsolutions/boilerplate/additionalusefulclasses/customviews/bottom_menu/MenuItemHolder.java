package com.theappsolutions.boilerplate.additionalusefulclasses.custom_views.bottom_menu;

/**
 * @author Dmytro Yakovlev d.yakovlev@theappsolutions.com
 * @copyright (c) 2017 TheAppSolutions. (https://theappsolutions.com)
 */
public class MenuItemHolder {

    private int iconResId;
    private int captionResId;

    public MenuItemHolder(int iconResId, int captionResId) {
        this.iconResId = iconResId;
        this.captionResId = captionResId;
    }

    public int getIconResId() {
        return iconResId;
    }

    public void setIconResId(int iconResId) {
        this.iconResId = iconResId;
    }

    public int getCaptionResId() {
        return captionResId;
    }

    public void setCaptionResId(int captionResId) {
        this.captionResId = captionResId;
    }
}
