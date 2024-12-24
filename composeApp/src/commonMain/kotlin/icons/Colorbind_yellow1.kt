package icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Colorbind_yellow1: ImageVector
	get() {
		if (_Colorbind_yellow1 != null) {
			return _Colorbind_yellow1!!
		}
		_Colorbind_yellow1 = ImageVector.Builder(
            name = "Colorbind_yellow1",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
			group {
				path(
    				fill = SolidColor(Color(0xFF373535)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.NonZero
				) {
					moveTo(482.75f, 265.624f)
					lineTo(41.743f, 9.624f)
					lineTo(41.743f, 521.624f)
					lineTo(482.75f, 265.624f)
					close()
				}
}
		}.build()
		return _Colorbind_yellow1!!
	}

private var _Colorbind_yellow1: ImageVector? = null
