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

public val Colorbind_blue2: ImageVector
	get() {
		if (_Colorbind_blue2 != null) {
			return _Colorbind_blue2!!
		}
		_Colorbind_blue2 = ImageVector.Builder(
            name = "Colorbind_blue2",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
			group {
				path(
    				fill = SolidColor(Color(0xFF231F20)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.NonZero
				) {
					moveTo(515.32f, 515.855f)
					lineTo(3.321f, 515.855f)
					lineTo(3.321f, 3.855f)
					lineTo(515.32f, 3.855f)
					lineTo(515.32f, 515.855f)
					close()
				}
}
		}.build()
		return _Colorbind_blue2!!
	}

private var _Colorbind_blue2: ImageVector? = null
