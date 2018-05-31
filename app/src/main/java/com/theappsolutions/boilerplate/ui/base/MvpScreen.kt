package com.theappsolutions.boilerplate.ui.base

/**
 * @author Severyn Parkhomenko s.parkhomenko@theappsolutions.com
 * @copyright (c) 2018 TheAppSolutions. (https://theappsolutions.com)
 */
interface MvpScreen {

    fun getBasePresenter(): BasePresenter<*>
}
