package com.muai.apiimpl.utils

class Validation {
    companion object {

        fun isValidObject(`object`: Any?): Boolean {
            return `object` != null
        }

        fun isValidString(string: String?): Boolean {
            return string != null && string.trim().isNotEmpty()
        }

        fun isValidList(list: List<*>?): Boolean {
            return list != null && list.isNotEmpty()
        }

        fun validateValue(value: String?): Boolean {
            return value != null && value.isNotEmpty()
        }

        fun isValidOtp(string: String?): Boolean {
            return string != null && string.trim().length == 4
        }

        fun isValidArrayList(list: Array<*>?): Boolean {
            return list != null && list.isNotEmpty()
        }

        fun isValidDigit(integer: Double): Boolean {
            return if (integer > 0) true else false
        }


    }
}