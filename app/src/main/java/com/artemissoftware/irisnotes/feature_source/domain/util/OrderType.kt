package com.artemissoftware.irisnotes.feature_source.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}