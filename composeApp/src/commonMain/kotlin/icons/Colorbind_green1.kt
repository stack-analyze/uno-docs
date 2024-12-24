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

public val Colorbind_green1: ImageVector
	get() {
		if (_Colorbind_green1 != null) {
			return _Colorbind_green1!!
		}
		_Colorbind_green1 = ImageVector.Builder(
            name = "Colorbind_green1",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
			group {
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
						moveTo(373.701f, 131.169f)
						lineTo(160.82f, 8.269f)
						lineTo(160.82f, 254.069f)
						lineTo(373.701f, 131.169f)
						close()
					}
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
						moveTo(373.701f, 397.368f)
						lineTo(160.82f, 274.467f)
						lineTo(160.82f, 520.269f)
						lineTo(373.701f, 397.368f)
						close()
					}
}
}
		}.build()
		return _Colorbind_green1!!
	}

private var _Colorbind_green1: ImageVector? = null
