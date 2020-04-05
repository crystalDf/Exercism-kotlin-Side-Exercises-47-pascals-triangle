object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {

        if (rows == 0) return emptyList()
        if (rows == 1) return listOf(listOf(1))

        return computeTriangle(rows - 1).upgrade()
    }

    private fun List<List<Int>>.upgrade(): List<List<Int>> =
            this.plus(listOf(listOf(1)
                    .plus(this.last().windowed(2).map { it.sum() })
                    .plus(1)))
}
