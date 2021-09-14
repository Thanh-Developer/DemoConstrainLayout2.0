package com.demo.constraint2.recyclerperconstrain

class RecyclerViewType {
    private val viewTypes: ArrayList<Pair<Int, ViewTypePosition>> = ArrayList()

    fun addViewType(viewType: Int, viewTypePosition: ViewTypePosition) {
        viewTypes.add(Pair(viewType, viewTypePosition))
    }

    fun getViewTypes() = viewTypes

    fun getViewType(position: Int): Int {
        for (viewType in viewTypes) {
            if (position >= viewType.second.startPosition && position <= viewType.second.endPosition)
                return viewType.first
        }
        return 0
    }

    inner class ViewTypePosition(
        val startPosition: Int,
        val endPosition: Int
    )
}